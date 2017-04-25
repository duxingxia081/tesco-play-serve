package com.tescoplay.myapp.web;

import com.tescoplay.myapp.dto.GoodsEvaluateDTO;
import com.tescoplay.myapp.entity.Goods;
import com.tescoplay.myapp.entity.GoodsBreed;
import com.tescoplay.myapp.entity.GoodsEvaluate;
import com.tescoplay.myapp.entity.GoodsType;
import com.tescoplay.myapp.facade.GoodsEvaluateFacade;
import com.tescoplay.myapp.service.GoodsBreedService;
import com.tescoplay.myapp.service.GoodsImagesService;
import com.tescoplay.myapp.service.GoodsService;
import com.tescoplay.myapp.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.file.Paths;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

	public static final String ROOT = "/home/weizh/img/";

	private final ResourceLoader resourceLoader;

	@Autowired
	private GoodsTypeService goodsTypeService;
	@Autowired
	private GoodsService goodsService;
	@Autowired
	private GoodsImagesService goodsImagesService;
	@Autowired
	private GoodsBreedService goodsBreedService;
	@Autowired
	private GoodsEvaluateFacade goodsEvaluateFacade;

	@GetMapping("/type")
	@ResponseBody
	@Transactional(readOnly = true)
	public List<GoodsType> goodsTypes() {
		List list = goodsTypeService.findByActive();
		return list;
	}
	@GetMapping("/listGoods")
	@ResponseBody
	@Transactional(readOnly = true)
	public List<Goods> listGoods() {
		List list = goodsService.listByActive();
		return list;
	}
	@Autowired
	public GoodsController(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	@GetMapping( "/image/{file}/{filename:.+}")
	@ResponseBody
	@Transactional(readOnly = true)
	public ResponseEntity<?> getFile(@PathVariable String file,@PathVariable String filename) {

		try {
			return ResponseEntity.ok(resourceLoader.getResource("file:" + Paths.get(ROOT+file+"/", filename).toString()));
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/listBread")
	@ResponseBody
	@Transactional(readOnly = true)
	public List<GoodsBreed> listGoodsBreed() {
		List list = goodsBreedService.findByActive();
		return list;
	}
	@GetMapping("/countGoodsEvaluate&goodsId={goodsId}")
	@ResponseBody
	public int countGoodsEvaluate(@PathVariable String goodsId) {
		int count =  goodsEvaluateFacade.count(Long.parseLong(goodsId));
		return count;
	}
	@GetMapping("/listGoodsEvaluate&goodsId={goodsId}")
	@ResponseBody
	public List<GoodsEvaluateDTO> listGoodsEvaluate(@PathVariable String goodsId) {
		List<GoodsEvaluateDTO> list = goodsEvaluateFacade.listByGoodsId(Long.parseLong(goodsId));
		return list;
	}
}

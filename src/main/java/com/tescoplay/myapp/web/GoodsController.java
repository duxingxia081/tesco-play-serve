package com.tescoplay.myapp.web;

import com.tescoplay.myapp.entity.Goods;
import com.tescoplay.myapp.entity.GoodsImages;
import com.tescoplay.myapp.entity.GoodsType;
import com.tescoplay.myapp.service.GoodsImagesService;
import com.tescoplay.myapp.service.GoodsService;
import com.tescoplay.myapp.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

	public static final String ROOT = "upload-dir";

	private final ResourceLoader resourceLoader;

	@Autowired
	private GoodsTypeService goodsTypeService;
	@Autowired
	private GoodsService goodsService;
	@Autowired
	private GoodsImagesService goodsImagesService;
	@GetMapping("/type")
	@ResponseBody
	@Transactional(readOnly = true)
	public List<GoodsType> goodsTypes() {
		List list = goodsTypeService.findAll();
		return list;
	}
	@GetMapping("/listGoods")
	@ResponseBody
	@Transactional(readOnly = true)
	public List<Goods> listGoods() {
		List list = goodsService.findAll();
		System.out.println("goodList");
		return list;
	}
	@Autowired
	public GoodsController(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	@GetMapping( "/image/{file}/{filename:.+}")
	@ResponseBody
	public ResponseEntity<?> getFile(@PathVariable String file,@PathVariable String filename) {

		try {
			return ResponseEntity.ok(resourceLoader.getResource("file:" + Paths.get("/home/weizh/img/"+file+"/", filename).toString()));
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
}

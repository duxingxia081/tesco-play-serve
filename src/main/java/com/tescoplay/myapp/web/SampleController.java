/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tescoplay.myapp.web;

import com.tescoplay.myapp.entity.GoodsType;
import com.tescoplay.myapp.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class SampleController {

	@Autowired
	private GoodsTypeService goodsTypeService;

	@GetMapping("/type")
	@ResponseBody
	@Transactional(readOnly = true)
	public List<GoodsType> helloWorld() {
		List list = goodsTypeService.findAll();
		/*List<GoodsTitle> list = new ArrayList<GoodsTitle>();
		GoodsTitle goodsTitle = new GoodsTitle();
		goodsTitle.setTitle("热门推荐");
		list.add(goodsTitle);
		goodsTitle = new GoodsTitle();
		goodsTitle.setTitle("医药保健");
		list.add(goodsTitle);
		goodsTitle = new GoodsTitle();
		goodsTitle.setTitle("家乡特产");
		list.add(goodsTitle);*/
		return list;
	}

}

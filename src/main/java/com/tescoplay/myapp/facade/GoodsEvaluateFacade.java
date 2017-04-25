package com.tescoplay.myapp.facade;


import com.tescoplay.myapp.dto.GoodsEvaluateDTO;
import com.tescoplay.myapp.entity.GoodsEvaluate;
import com.tescoplay.myapp.service.GoodsEvaluateService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GoodsEvaluateFacade{

    @Autowired
    private GoodsEvaluateService goodsEvaluateService;

    @Transactional(readOnly = true)
    public int count(Long goodsId)
    {
        return goodsEvaluateService.count(goodsId);
    }

    @Transactional(readOnly = true)
    public List<GoodsEvaluateDTO> listByGoodsId(Long goodsId)
    {
        List<GoodsEvaluate> list = goodsEvaluateService.listByGoodsId(goodsId);
        if(!CollectionUtils.isEmpty(list))
        {
            List<GoodsEvaluateDTO> listDto = new ArrayList<GoodsEvaluateDTO>();
            for (GoodsEvaluate goodsEvaluate:list) {
                GoodsEvaluateDTO dto = new GoodsEvaluateDTO();
                BeanUtils.copyProperties(goodsEvaluate,dto);
                listDto.add(dto);
            }
            return listDto;
        }
        return null;
    }
}

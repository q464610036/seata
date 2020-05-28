package com.product.product.service.impl;

import com.product.product.dao.TProductDao;
import com.product.product.po.TProduct;
import com.product.product.service.TProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 陈孟飞
 * @date 2020/5/19
 */
@Service
public class TProductServiceImpl implements TProductService {
    @Resource
    private TProductDao tProductDao;

    @Override
    public void init(){
        TProduct po = new TProduct();
        po.setName("奥利奥");
        po.setNum(100);
        po.setId(1L);
        tProductDao.saveAndFlush(po);
    }

    @Override
    public TProduct save(TProduct po){
        return tProductDao.save(po);
    }

    @Override
    public int decreaseNum(Integer decreaseNum, Long id) {
        return tProductDao.decreaseNum(decreaseNum, id);
    }
}

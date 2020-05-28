package com.product.product.service;

import com.product.product.po.TProduct;

/**
 * @author 陈孟飞
 * @date 2020/5/19
 */
public interface TProductService {
    public TProduct save(TProduct po);

    public void init();

    public int decreaseNum(Integer decreaseNum, Long id);
}

package com.product.product.controller;

import com.product.product.po.TProduct;
import com.product.product.service.TProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    private TProductService tProductService;

    @RequestMapping("/init")
    public String init(){
        TProduct tAccount = new TProduct();
        tAccount.setNum(100);
        tAccount.setName("奥利奥");
        tAccount.setId(1L);
        tProductService.save(tAccount);
        return "Success";
    }

    @RequestMapping("/save")
    public String save(){
        TProduct tAccount = new TProduct();
        tAccount.setNum(100);
        tAccount.setName("奥利奥");
        tProductService.save(tAccount);
        return "Success";
    }

    /**
     * 数量自减
     * @return
     */
    @RequestMapping("/decreaseNum")
    public String decreaseNum(Integer decreaseNum, Long id){
//        int a = 1/0;
        tProductService.decreaseNum(decreaseNum, id);
        return "Success";
    }
}

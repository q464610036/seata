package com.order.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 陈孟飞
 * @date 2020/5/19
 */
@FeignClient(value = "seata-product",path = "/product")
public interface ProductFeginClient {
    @RequestMapping("/decreaseNum")
    String decreaseNum(@RequestParam("decreaseNum") Integer decreaseNum, @RequestParam("id") Long id);
}

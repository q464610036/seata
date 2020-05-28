package com.order.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 陈孟飞
 * @date 2020/5/19
 */
@FeignClient(value = "seata-account",path = "/account")
public interface AccountFeginClient {
    @RequestMapping("/decreaseMoney")
    String decreaseMoney(@RequestParam("decreaseMoney") Double decreaseMoney, @RequestParam("id") Long id);
}

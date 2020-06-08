package com.order.order.controller;

import com.order.order.po.TOrder;
import com.order.order.service.TOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private TOrderService orderService;

    /**
     * 下单
     * @param num
     * @return
     */
    @RequestMapping("/create")
    public TOrder create(int num){
        Double unitPrice = 1D;
        String orderName = "奥利奥"+num+"个";
        Long userId = 1L;

        TOrder tOrder = new TOrder();
        tOrder.setUserId(userId);
        tOrder.setOrderNo(createOrderCode().toString());
        tOrder.setOrderName(orderName);
        tOrder.setMoney(unitPrice * num);
        tOrder.setProductId(1L);
        tOrder.setStatus(0);
        tOrder.setNum(num);
        tOrder.setCreateTime(new Date());
        TOrder result = orderService.save(tOrder);
        return result;
    }

    /**
     * 订单号生成
     * @return
     */
    public synchronized static Long createOrderCode(){
        //获得机器码
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String msg =df.format(new Date());
        Long id = Long.parseLong(msg+"0000");
        Long orderNo = id + getIndex();
        return orderNo;
    }
    /**
     * 获得序号
     * @return
     */
    private static int index = 1;
    private static synchronized int getIndex(){
        index %= 1000;
        return index++;
    }
}

package com.order.order.service.impl;

import com.order.order.dao.TOrderDao;
import com.order.order.feign.AccountFeginClient;
import com.order.order.feign.ProductFeginClient;
import com.order.order.po.TOrder;
import com.order.order.service.TOrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @author 陈孟飞
 * @date 2020/5/19
 */
@Service
public class TOrderServiceImpl implements TOrderService {
    @Resource
    private TOrderDao tOrderDao;

    @Resource
    private AccountFeginClient accountFeginClient;

    @Resource
    private ProductFeginClient productFeginClient;

    @Override
//    @Transactional
    @GlobalTransactional
    public TOrder save(TOrder po){
        //扣余额
        Long accountId = 1L;
        String result = accountFeginClient.decreaseMoney(po.getMoney(), accountId);
        System.out.println("扣余额:"+result+" money:"+po.getMoney()+" accountId:"+accountId);
        //扣库存
        result = productFeginClient.decreaseNum(po.getNum(), po.getProductId());
        System.out.println("扣库存:"+result+" num:"+po.getNum()+" productId:"+po.getProductId());
        //下单
        TOrder order = tOrderDao.save(po);
        System.out.println("下单:success");
        return order;
    }
}

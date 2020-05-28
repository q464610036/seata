package com.order.order.dao;

import com.order.order.po.TOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

/**
 * @author 陈孟飞
 * @date 2020/5/18
 */
public interface TOrderDao extends JpaRepository<TOrder, Long> {

    @Override
    TOrder getOne(Long id);

}

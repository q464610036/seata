package com.product.product.dao;

import com.product.product.po.TProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

/**
 * @author 陈孟飞
 * @date 2020/5/18
 */
public interface TProductDao extends JpaRepository<TProduct, Long> {

    @Override
    TProduct getOne(Long id);

    TProduct saveAndFlush(TProduct po);

    @Transactional
    @Modifying(clearAutomatically = true) //表示增删改
    @Query(value = "update t_product set num= num - ?1 where id = ?2", nativeQuery=true) //nativeQuery=false表示使用HQL
    int decreaseNum(Integer decreaseMum, Long id);

}

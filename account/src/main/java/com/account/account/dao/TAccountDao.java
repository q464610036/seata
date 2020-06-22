package com.account.account.dao;

import com.account.account.po.TAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author 陈孟飞
 * @date 2020/5/18
 */
public interface TAccountDao extends JpaRepository<TAccount, Long> {

    @Override
    TAccount getOne(Long id);

    int deleteAllByUserId(Long userId);

    @Transactional //使用@query做DML操作时，需要加@Transactional和@Modifying注解，否则会报错
    @Modifying(clearAutomatically = true) //表示增删改
    @Query(value = "update t_account set money = money - ?1 where id = ?2", nativeQuery=true) //nativeQuery=false表示使用HQL
    int decrMoney(Double decrMoney, Long id);

    @Transactional //使用@query做DML操作时，需要加@Transactional和@Modifying注解，否则会报错
    @Modifying(clearAutomatically = true) //表示增删改
    @Query(value = "update t_account set money = money + ?1 where id = ?2", nativeQuery=true) //nativeQuery=false表示使用HQL
    int incrMoney(Double incrMoney, Long id);

    @Query(value = "select * from t_account where id = ?1 for update", nativeQuery=true) //nativeQuery=false表示使用HQL
//    @Query(value = "select * from t_account where id = ?1", nativeQuery=true) //nativeQuery=false表示使用HQL
    TAccount get(Long id);
}

package com.account.account.dao;

import com.account.account.po.TAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author 陈孟飞
 * @date 2020/5/18
 */
public interface TAccountDao extends JpaRepository<TAccount, Long> {

    @Override
    TAccount getOne(Long id);

    int deleteAllByUserId(Long userId);

    @Transactional
    @Modifying(clearAutomatically = true) //表示增删改
    @Query(value = "update t_account set money = money - ?1 where id = ?2", nativeQuery=true) //nativeQuery=false表示使用HQL
    int decrease(Double decreaseMoney, Long id);

}

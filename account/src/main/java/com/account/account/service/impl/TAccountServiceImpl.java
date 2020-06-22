package com.account.account.service.impl;

import com.account.account.dao.TAccountDao;
import com.account.account.po.TAccount;
import com.account.account.service.TAccountService;
import io.seata.spring.annotation.GlobalLock;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @author 陈孟飞
 * @date 2020/5/19
 */
@Service
public class TAccountServiceImpl implements TAccountService {
    @Resource
    private TAccountDao accountDao;

    @Override
    public TAccount save(TAccount po){
        return accountDao.save(po);
    }

    @Override
    public boolean init() {
        TAccount po = new TAccount();
        po.setId(1L);
        po.setUserId(1L);
        po.setMoney(1000D);
        accountDao.saveAndFlush(po);
        return true;
    }

    @Override
    public int deleteAllByUserId(Long userId){
        return accountDao.deleteAllByUserId(userId);
    }

    @Transactional
    @Override
    public int decrMoney(Double decreaseMoney, Long id) {
        return accountDao.decrMoney(decreaseMoney, id);
    }

    @GlobalTransactional
    @Override
    public int incrMoney(Double incrMoney, Long id) {
        int n = accountDao.incrMoney(incrMoney, id);
        return n;
    }

    @GlobalTransactional
    @Override
    public TAccount get(Long id) {
        TAccount po = accountDao.get(id);
        return po;
    }
}

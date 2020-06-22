package com.account.account.service;

import com.account.account.po.TAccount;

/**
 * @author 陈孟飞
 * @date 2020/5/19
 */
public interface TAccountService {
    public TAccount save(TAccount po);

    public boolean init();

    public int deleteAllByUserId(Long userId);

    public int decrMoney(Double decrMoney, Long id);

    public int incrMoney(Double incrMoney, Long id);

    public TAccount get(Long id);
}

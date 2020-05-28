package com.account.account.controller;

import com.account.account.po.TAccount;
import com.account.account.service.TAccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Resource
    private TAccountService accountService;


    @RequestMapping("/init")
    public String init(){
        accountService.init();
        return "Success";
    }

    @RequestMapping("/save")
    public String save(){
        TAccount tAccount = new TAccount();
        tAccount.setMoney(1000D);
        tAccount.setUserId(1L);
        accountService.save(tAccount);
        return "Success";
    }

    /**
     * 金额自减
     * @return
     */
    @RequestMapping("/decreaseMoney")
    public String decreaseMoney(Double decreaseMoney, Long id){
        accountService.decreaseMoney(decreaseMoney, id);
        return "Success";
    }
}

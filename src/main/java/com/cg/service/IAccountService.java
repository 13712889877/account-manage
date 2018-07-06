package com.cg.service;

import com.cg.entity.generate.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAccountService {
    //接口创建一个查找所有用户信息的方法
    List<Account> findAccount();


    //接口通过id查找单个用户信息的方法
    Account getAccount(int accountId);

    //接口创建一个保存用户信息的方法
    void saveAccount(Account account);

    //接口创建一个更新用户信息的方法
    void insert(Account account);

    //接口通过id删除用户信息的方法
    void deleteAccount(int accountId);

    //接口通过用户名查询用户信息的方法
    Account getAccountName(String accountName);
}

package com.cg.service.impl;

import com.cg.entity.generate.Account;
import com.cg.mapper.generate.AccountMapper;
import com.cg.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    public AccountMapper accountMapper;

    @Override
    public List<Account> findAccount() {
        return null;
    }

    @Override
    public Account getAccount(int accountId) {
        return null;
    }

    @Override
    public void saveAccount(Account account) {

    }

    @Override
    public void insert(Account account) {
        accountMapper.insert(account);
    }

    @Override
    public void deleteAccount(int accountId) {

    }

    @Override
    public Account getAccountName(String accountName) {
        return accountMapper.selectAccount(accountName);
    }
}

package cn.tx.mapper;

import cn.tx.domain.Account;

import java.util.List;

/**
 * @author GYP
 * @date 2021/4/20 21:17
 * @description TODO
 */
public interface AccountMapper {
    //多对一查询
    public List<Account> findAll();
}

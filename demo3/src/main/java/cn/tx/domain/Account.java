package cn.tx.domain;

import java.io.Serializable;

/**
 * @author GYP
 * @date 2021/4/20 21:14
 * @description 账户实体类
 */
public class Account implements Serializable {
    //主键
    private Integer id;
    //外键
    private Integer uid;
    //金额
    private Double money;
    //用户
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                ", user=" + user +
                '}';
    }
}

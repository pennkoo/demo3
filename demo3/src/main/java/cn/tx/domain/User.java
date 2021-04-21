package cn.tx.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 *
 * 用户实体类
 */
public class User implements Serializable {
    //主键
    private Integer id;
    //用户名
    private String username;
    //生日
    private Date birthday;
    //性别
    private String sex;
    //地址
    private String address;
    //id集合
    private List<Integer> ids;
    //订单集合
    private List<Account> accounts;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", ids=" + ids +
                ", accounts=" + accounts +
                '}';
    }
}

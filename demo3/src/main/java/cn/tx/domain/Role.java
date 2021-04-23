package cn.tx.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author GYP
 * @date 2021/4/23 18:56
 * @description TODO
 */
public class Role implements Serializable {
    //主键
    private Integer id;
    //角色名称
    private String role_name;
    //角色描述
    private String role_desc;
    //一个角色可以被多个用户所拥有
    private List<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_desc() {
        return role_desc;
    }

    public void setRole_desc(String role_desc) {
        this.role_desc = role_desc;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role_name='" + role_name + '\'' +
                ", role_desc='" + role_desc + '\'' +
                ", users=" + users +
                '}';
    }
}

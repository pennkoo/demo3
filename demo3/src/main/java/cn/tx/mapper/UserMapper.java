package cn.tx.mapper;

import cn.tx.domain.User;

import java.util.List;

public interface UserMapper {
    //通过id主键查询一条数据 select * from user where id = ?
    public User findUserById(int id);
    //删除
    public void delete(int id);
    //测试if标签
    public List<User> findByIf(User user);
    //测试foreach标签
    public List<User> findByForeach(User user);
    //一对多查询
    public List<User> findAll();
}

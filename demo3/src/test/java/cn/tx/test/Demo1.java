package cn.tx.test;

import cn.tx.domain.User;
import cn.tx.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author GYP
 * @date 2021/4/16 21:30
 * @description TODO
 */
public class Demo1 {

    private InputStream inputStream = null;
    private SqlSession session = null;
    private UserMapper mapper = null;

    @Before
    public void init() throws IOException {
        //加载配置文件
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取到SqlSession对象
        session = factory.openSession();
        //开启事务自动提交
        //session = factory.openSession(true);
        //获取到代理对象
        mapper = session.getMapper(UserMapper.class);
    }

    @After
    public void destroy() throws IOException {
        session.close();
        inputStream.close();
    }

    /**
     * 测试根据id查询
     */
    @Test
    public void testFindUserById() throws IOException {
        //调用方法
        User user = mapper.findUserById(1);
        //打印
        System.out.println(user);
    }

    /**
     * 测试事务
     */
    @Test
    public void testDelete(){
        mapper.delete(10);
    }

    /**
     * 测试If标签
     */
    @Test
    public void testIf(){
        User user = new User();
        user.setUsername("%熊%");
        user.setSex("女");
        List<User> list = mapper.findByIf(user);

        for (User user1 : list) {
            System.out.println(user1);
        }
    }

    /**
     * 测试foreach标签
     */
    @Test
    public void testForeach(){
        User user = new User();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        user.setIds(ids);

        List<User> list = mapper.findByForeach(user);

        for (User user1 : list) {
            System.out.println(user1);
        }
    }

    /**
     * 一对多查询
     */
    @Test
    public void testFindAll(){
        List<User> list = mapper.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
}

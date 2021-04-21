package cn.tx.test;

import cn.tx.domain.Account;
import cn.tx.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author GYP
 * @date 2021/4/20 21:31
 * @description TODO
 */
public class Demo2 {
    private InputStream inputStream = null;
    private SqlSession session = null;
    private AccountMapper mapper = null;

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
        mapper = session.getMapper(AccountMapper.class);
    }

    @After
    public void destroy() throws IOException {
        session.close();
        inputStream.close();
    }

    /**
     * 多对一查询所有
     */
    @Test
    public void testFindAll(){
        List<Account> list = mapper.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }
}

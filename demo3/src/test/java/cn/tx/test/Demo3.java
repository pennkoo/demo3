package cn.tx.test;

import cn.tx.domain.Role;
import cn.tx.mapper.RoleMapper;
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
public class Demo3 {
    private InputStream inputStream = null;
    private SqlSession session = null;
    private RoleMapper mapper = null;

    @Before
    public void init() throws IOException {
        //加载配置文件
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取到SqlSession对象
        session = factory.openSession();
        //获取到代理对象
        mapper = session.getMapper(RoleMapper.class);
    }

    @After
    public void destroy() throws IOException {
        session.close();
        inputStream.close();
    }

    /**
     * 多对多查询
     */
    @Test
    public void testFindAll(){
        List<Role> list = mapper.findAll();
        for (Role role : list) {
            System.out.println(role);
        }
    }
}

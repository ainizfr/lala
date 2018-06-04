package com.zfr.course.c06.dao;

import com.zfr.course.c06.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.InputStream;

public class UserDAO {
    public User findUserById(int id) throws Exception {
        String resource ="mybatis-config.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession =sqlSessionFactory.openSession();
        User user =sqlSession.selectOne("com.zfr.course.c06.mapper.UserMapper.findUserById",id);
        sqlSession.close();
        return user;
    }

}

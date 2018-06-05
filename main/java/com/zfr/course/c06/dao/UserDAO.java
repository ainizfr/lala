package com.zfr.course.c06.dao;

import com.zfr.course.c06.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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


    //根据用户名称来模糊查询用户信息列表
    public List<User> findUserByName(String s) throws Exception{
        String resource ="mybatis-config.xml";
        InputStream inputStream =Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        List<User> users=sqlSession.selectList("com.zfr.course.c06.mapper.UserMapper.findUserByname",s);
        sqlSession.close();
        return users;
    }


    public void addUser(User user) throws Exception{
        String resource ="mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession= sqlSessionFactory.openSession();
        //执行SqlSession的插入方法，返回的是SQL语句影响的行数
        int rows=sqlSession.insert("com.zfr.course.c06.mapper.UserMapper.addUser",user);
        //通过返回结果判断插入操作是否执行成功
        if(rows>0){
            System.out.println("您成功插入了"+rows+"条数据");
        }else{
            System.out.println("执行插入操作失败！！！");
        }
        //提交事务
        sqlSession.commit();
        //关闭SqlSession
        sqlSession.close();
    }


    //更新用户
    public  void updataUser(User user) throws IOException {
        String resource ="mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession= sqlSessionFactory.openSession();
        int rows=sqlSession.delete("com.zfr.course.c06.mapper.UserMapper.updateUser",user);
        if(rows>0){
            System.out.println("您成功修改了"+rows+"条数据");
        }else{
            System.out.println("执行修改操作失败！！！");
        }
        //提交事务
        sqlSession.commit();
        //关闭SqlSession
        sqlSession.close();
    }


    //删除用户
    public void deleteUser(int id) throws IOException {
        String resource ="mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession= sqlSessionFactory.openSession();

        int rows=sqlSession.delete("com.zfr.course.c06.mapper.UserMapper.deleteUser",id);
        //通过返回结果判断插入操作是否执行成功
        if(rows>0){
            System.out.println("您成功删除了"+rows+"条数据");
        }else{
            System.out.println("执行删除称、操作失败！！！");
        }
        //提交事务
        sqlSession.commit();
        //关闭SqlSession
        sqlSession.close();
    }
}


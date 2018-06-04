package com.zfr.course.c04;

import com.zfr.course.c01.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcTemplateUtil {
    private JdbcTemplate jdbcTemple;
    private String errorTest;

    public void setJdbcTemple(JdbcTemplate jdbcTemple) {
        this.jdbcTemple = jdbcTemple;
    }

    public void createTable(){
        jdbcTemple.execute("DROP TABLE IF EXISTS user");

        jdbcTemple.execute("CREATE TABLE user (\n" +
            "id int(11) NOT NULL AUTO_INCREMENT,\n"+
                "name varchar(50) DEFAULT NULL,\n"+
                "sex varchar(2) DEFAULT NULL,\n"+
                "email varchar(125) DEFAULT NULL,\n"+
                "PRIMARY KEY (`id`)\n"+
                ")"
        );

    }
    public void  addUser(Student student){
        String sql ="insert into user(name,sex,email) values(?,?,?)";
        jdbcTemple.update(sql,student.getName(),student.getSex(),student.getEmail());
       //errorTest.length();//故意执行一个初始化对系那个的方法
    }
    public void deleteUser(int id){
        String sql ="delete from user where id=?";
        jdbcTemple.update(sql,id);
    }
    public  void  updateUser(Student student){
        String sql="updata user set name=?,sex=?,email=? where id =?";
        jdbcTemple.update(sql,student.getName(),student.getSex(),student.getEmail(),student.getId());
    }
    //简单查询，按照id查询，返回字符串
    public String searchUserName(int id){
        String sql = "select name form user where id=?";
        return jdbcTemple.queryForObject(sql,String.class,id);
    }
    //复杂查询返回List集合
    public List<Student> findAll(){
        String sql ="select *from user";
        return jdbcTemple.query(sql,new StudentRowMapper());
    }
    //根据id查询
    public Student searchUser(int id){
        String sql ="select *from user where id=?";
        return jdbcTemple.queryForObject(sql,new StudentRowMapper(),id);
    }
    class StudentRowMapper implements RowMapper<Student>{
        public Student mapRow(ResultSet rs,int rowNum)throws SQLException {
            Student student=new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setSex(rs.getString("sex"));
            //student.getSex(rs.getString("sex"));
            student.setEmail(rs.getString("email"));
            return student;

        }
    }



}

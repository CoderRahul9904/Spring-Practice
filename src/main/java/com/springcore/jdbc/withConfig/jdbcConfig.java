package com.springcore.jdbc.withConfig;

import com.springcore.jdbc.withConfig.dao.StudentDao;
import com.springcore.jdbc.withConfig.dao.StudentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.springcore.jdbc.withConfig.dao"})
public class jdbcConfig {
    @Bean("ds")
    public DataSource getDriverManagerDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/student_management");
        dataSource.setUsername("root");
        dataSource.setPassword("Rahul@9904");
        return dataSource;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDriverManagerDataSource());
    }

//    @Bean("StudentDao")
//    public StudentDao getStudentDao() {
//        JdbcTemplate jdbcTemplate = getJdbcTemplate();
//        StudentDaoImpl studentDao = new StudentDaoImpl();
//        studentDao.setJdbcTemplate(jdbcTemplate);
//        return studentDao;
//    }
}

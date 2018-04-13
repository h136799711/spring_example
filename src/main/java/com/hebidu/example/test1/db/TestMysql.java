package com.hebidu.example.test1.db;


import com.hebidu.example.test1.entity.BsBookCategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestMysql {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TestMysql(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void test() {
        Integer cnt = this.jdbcTemplate.queryForObject("SELECT  count(*) as cateName FROM bs_book_category WHERE ID = 1", Integer.class);
        System.out.println(cnt);
        Integer id = 1;
        BsBookCategoryEntity bookCategory = this.jdbcTemplate.queryForObject("SELECT  * FROM bs_book_category WHERE ID = ?", new BeanPropertyRowMapper<>(BsBookCategoryEntity.class), id);
        System.out.println(bookCategory.toString());
    }

}

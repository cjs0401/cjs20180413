package com.itheima.springboot;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// 使用junit测试Spring Boot 应用，需要加此注解；并可指定引导类
@SpringBootTest(classes = Application.class)
public class C3p0DataSourceTest {

	@Autowired
	private DataSource dataSource;

	@Test
	public void test() {
		try {
			System.out.println("111111111111111111111111111111");
			Connection connection = dataSource.getConnection();
			System.out.println("222222222222222222222222222222" + connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

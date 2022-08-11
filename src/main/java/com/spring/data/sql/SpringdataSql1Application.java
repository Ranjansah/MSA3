package com.spring.data.sql;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class,XADataSourceAutoConfiguration.class})
public class SpringdataSql1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringdataSql1Application.class, args);
	
	}

}

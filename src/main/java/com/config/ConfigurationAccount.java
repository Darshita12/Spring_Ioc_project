package com.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.dao")

public class ConfigurationAccount {

	@Bean
	public DataSource dataSource()
	{
		 DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 dataSource.setDriverClassName("org.postgresql.Driver");
	        dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/public");
	        dataSource.setUsername("postgres");
	        dataSource.setPassword("1234");
	        
		return dataSource;
		
	}
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource)
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate;
		
		
	}
	
}

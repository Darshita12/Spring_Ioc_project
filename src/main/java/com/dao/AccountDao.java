package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.AccountBean;

@Repository("acdao")
public class AccountDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int addAccount()
	{
		return jdbcTemplate.update("insert into account(acname)values('darshita')");
	}
	public int deleteAccount()
	{
		return jdbcTemplate.update("delete from account where acid=1");
	}
	//public int updateAccount()
	public List<AccountBean> getData()
	{
	return jdbcTemplate.query("select * from Account", new Rmapper());
	}

	public static final class Rmapper implements RowMapper<AccountBean>
	{
			public AccountBean mapRow(ResultSet rs, int rowNum) throws SQLException 
			{
				AccountBean accountBean=new AccountBean();
				accountBean.setAcid(rs.getInt(1));
				accountBean.setAcname(rs.getString(2));
			return accountBean;
			}
	}
		
}

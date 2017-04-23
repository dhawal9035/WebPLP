package edu.asu.plp.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	String query;
	JdbcTemplate jdbc;
	public void saveUser(String emailId, String firstName, String lastName) {
		// TODO Auto-generated method stub
		query = "insert into user_info (email, first_name, last_name) values (?,?,?) on duplicate key update first_name=?, last_name=? ";
		jdbc.update(query, new Object[]{emailId,firstName,lastName,firstName,lastName});
	}

}

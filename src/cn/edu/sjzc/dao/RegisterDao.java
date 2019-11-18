package cn.edu.sjzc.dao;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.*;

import cn.edu.sjzc.DBUtils.JDBCUtil;
import cn.edu.sjzc.domain.UserBean;

// 增加用户
public class RegisterDao {
	
	public boolean insertUser(UserBean user){
		boolean flag=true;
		Connection conn = JDBCUtil.getConnection();
		
		String sql = "insert into users (username,password,email) values (?,?,?)";
		PreparedStatement preStat = null;
		try {
			preStat = conn.prepareStatement(sql);
			preStat.setString(1, user.getUsername());
			preStat.setString(2, user.getPassword());
			preStat.setString(3, user.getEmail());
			flag = preStat.execute();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	

		
		return flag;
	}
	

	
}

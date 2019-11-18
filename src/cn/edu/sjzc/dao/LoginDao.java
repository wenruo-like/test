package cn.edu.sjzc.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

//import com.sun.org.apache.bcel.internal.generic.NEW;

import cn.edu.sjzc.DBUtils.JDBCUtil;
import cn.edu.sjzc.domain.UserBean;

public class LoginDao {
	public UserBean login(String username,String password){
		UserBean user = null;
		
		String sql = "select * from users where username=? and password=?";
		QueryRunner qr = new QueryRunner();
		Object[] param = {
				username,
				password
		};
		Object obj;
		try {
			obj = qr.query(JDBCUtil.getConnection(),sql,param,new BeanHandler(UserBean.class));
			user = (UserBean)obj;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
}

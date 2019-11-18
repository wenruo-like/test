package cn.edu.sjzc.dao;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.edu.sjzc.DBUtils.JDBCUtil;
import cn.edu.sjzc.domain.UserBean;

public class UserDao {
	public List<UserBean> findAllUser(){
		List<UserBean> users = new LinkedList<UserBean>();
		String sql = "select * from users";
		
		QueryRunner qr = new QueryRunner();
		Object obj=null;
		try {
			obj = qr.query(JDBCUtil.getConnection(), sql, new BeanListHandler(UserBean.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		users = (List<UserBean>)obj;
		return users;
	}
	/**
	 * 删除用户
	 */
	public void deleteUser(String username){
		List<UserBean> users = new LinkedList<UserBean>();
		String sql = "delete from users where username = ?";
		Object[] params = {
				username
		};
		QueryRunner qr = new QueryRunner();
		try {
			qr.execute(JDBCUtil.getConnection(), sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 根据username修改password和email，username不变
	 * @param userBean
	 */
	public void modifyUser(UserBean userBean){

		String sql = "update users set password=?,email=? where username = ?";
		Object[] params = {
				userBean.getPassword(),
				userBean.getEmail(),
				userBean.getUsername()
		};
		QueryRunner qr = new QueryRunner();
		try {
			qr.update(JDBCUtil.getConnection(), sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public UserBean findUserByName(String username){
		UserBean ub = new UserBean();
		String sql = "select * from users where username=?";
		Object[] params = {
			username
		};
		QueryRunner qr = new QueryRunner();
		try {
			Object obj = qr.query(JDBCUtil.getConnection(), sql, params, new BeanHandler(UserBean.class));
			ub = (UserBean)obj;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ub;
	}
}

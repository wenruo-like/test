package cn.edu.sjzc.domain;

import java.util.HashMap;
import java.util.Map;

// ע��ҳ��������������ݣ�������������ȷ��
public class RegisterFormBean {
	private String username;
	private String password1;
	private String password2;
	private String email;
	
	// ��ȷ�Լ���ʱ���������Ϣ
	public Map<String,String> errors = new HashMap<String, String>();
	
	// �Ա�������ȷ�Լ���
	public boolean validate(){
		boolean flag = true;
		// �û���Ϊ��
		if (username == null || username.trim().equals("")){
			errors.put("username", "请输入用户名");
			flag = false;
		}
		
		// ����Ϊ��
		if (password1==null || password1.trim().equals("")){
			errors.put("password1", "请输入密码");
			flag = false;
		}
		
		// �������벻��ͬ
		if (!password1.equals(password2)){
			errors.put("password2", "两次密码不一致！");
			flag = false;
		}
		
		String em = "[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+";
		// �����ַ��ʽ����
		if (email==null || email.trim().equals("")){
			errors.put("email", "请输入邮箱");
			flag=false;
		}else if(!email.matches(em)){
			errors.put("email", "格式错误");
			flag=false;
		}
		
		return flag;
	}
	public Map<String,String> getErrorsMap(){
		return this.errors;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

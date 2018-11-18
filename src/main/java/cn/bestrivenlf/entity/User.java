package cn.bestrivenlf.entity;


/**
 * 
 *<p>title:User</p>
 *<p>Description:用户信息类与数据库中User_tb对应</p>
 *<p>college:HYIT</p>
 * @author 刘凡
 * @date 2017年7月25日
 */
public class User {
	private int id;
	private String username;
	private String uuid;
	private String password;
	private String email;
	private String emailconfirm;
	private String del_flag;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailconfirm() {
		return emailconfirm;
	}
	public void setEmailconfirm(String emailconfirm) {
		this.emailconfirm = emailconfirm;
	}
	public String getDel_flag() {
		return del_flag;
	}
	public void setDel_flag(String del_flag) {
		this.del_flag = del_flag;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public User() {
		super();
	}
	
}

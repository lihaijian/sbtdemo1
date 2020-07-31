package cn.lhj.sbtdemo1.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import cn.lhj.sbtdemo1.model.Address;

@ConfigurationProperties(prefix = "user")
public class MyProperties {
	private int userId;
	
	private String passwd;
	private String username;
	private boolean sex;
	private List<String> hobbies;
	private Map<String, Object> map;
	private Address address;
	
	
	
	public MyProperties() {
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getPasswd() {
		return passwd;
	}



	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public boolean isSex() {
		return sex;
	}



	public void setSex(boolean sex) {
		this.sex = sex;
	}



	public List<String> getHobbies() {
		return hobbies;
	}



	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}



	public Map<String, Object> getMap() {
		return map;
	}



	public void setMap(Map<String, Object> map) {
		this.map = map;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "MyProperties [userId=" + userId + ", passwd=" + passwd + ", username=" + username + ", sex=" + sex
				+ ", hobbies=" + hobbies + ", map=" + map + ", address=" + address + "]";
	}
	
	
}

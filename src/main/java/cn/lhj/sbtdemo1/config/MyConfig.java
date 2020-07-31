package cn.lhj.sbtdemo1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import cn.lhj.sbtdemo1.model.Address;
import cn.lhj.sbtdemo1.model.User;

@Configuration
@EnableConfigurationProperties(MyProperties.class)
public class MyConfig {
	/*
	 * @Bean public Address address(MyProperties myProperties) { Address addr = new
	 * Address(); addr.setId(myProperties.getId());
	 * addr.setDetail(myProperties.getAddressDetail()); return addr; }
	 */
	@Bean
	public User user(MyProperties myProperties) {
		User user = new User();
		user.setId(myProperties.getUserId());
		user.setUsername(myProperties.getUsername());
		user.setAddress(myProperties.getAddress());
		user.setHobbies(myProperties.getHobbies());
		user.setMap(myProperties.getMap());
		user.setPasswd(myProperties.getPasswd());
		user.setSex(myProperties.isSex());
		return user;
	}
}

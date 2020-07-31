package cn.lhj.sbtdemo1;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import cn.lhj.sbtdemo1.model.Address;
import cn.lhj.sbtdemo1.model.User;

@SpringBootTest
class Sbtdemo1ApplicationTests {

	
	@Autowired
	private User user;
	@Test
	void contextLoads() {
		System.out.println(user);
	}

}

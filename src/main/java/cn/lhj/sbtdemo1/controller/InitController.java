package cn.lhj.sbtdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InitController {

	@ResponseBody
	@RequestMapping(value={"/","/index"},method = RequestMethod.GET)
	public String hello() {
		return "helloworld";
	}
}

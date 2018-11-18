package cn.bestrivenlf.serviceImpl;

import org.springframework.stereotype.Service;

import cn.bestrivenlf.service.SayHelloService;

@Service
public class SayHelloServiceImpl implements SayHelloService {

	public String sayHello() {
		// TODO Auto-generated method stub
		return "hello world";
	}

}

package java.zyf.com.service;

import java.zyf.com.dao.User;

import com.alibaba.dubbo.config.annotation.Service;
@Service
public class SayHello {
	User user;
	private void knight() {
	
	System.out.println("hello word!"+user.getName());

	
	
	}
	public static void main(String[] args) {
		
	}
}

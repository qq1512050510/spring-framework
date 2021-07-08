package com.learn.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service("UserSerivce")
public class UserSerivce {
	public boolean login(String userName, String pwd) {
		Integer random = new Random().nextInt(10);
		System.out.println(random);
		if (random < 9) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		UserSerivce userSerivce = new UserSerivce();
		System.out.println(userSerivce.login("1", "2"));

	}
}

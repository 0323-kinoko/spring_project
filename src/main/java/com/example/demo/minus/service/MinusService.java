package com.example.demo.minus.service;

import org.springframework.stereotype.Service;

@Service
public class MinusService {

	public int minus(int num1, int num2) {

		int answer  = num1 - num2;

		return answer;

	}

}
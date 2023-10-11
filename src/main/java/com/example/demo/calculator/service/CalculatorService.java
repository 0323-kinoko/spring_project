package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public int calculator(int num1, int num2, String option) {

		switch (option) {

		case "plus":
			return num1 + num2;

		case "minus":
			return num1 - num2;

		case "times":
			return num1 * num2;

		default:
			return num1 / num2;
		}
	}
}
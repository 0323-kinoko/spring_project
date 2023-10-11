package com.example.demo.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.CalculatorService;

@Controller
public class CalculatorController {

	@GetMapping("/calculator")
	public String showCalculator() {
		return "calculator";
	}

	private final CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@PostMapping("/calculate")
	public String calculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2,
			@RequestParam("cal") String option, Model model) {

		int result = calculatorService.calculator(num1, num2, option);

		model.addAttribute("result", result);

		return "calculator";
	}
}
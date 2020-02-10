package com.Bare;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String SayHi() {
		return "Hi";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/add")
	public int add(int num1,int num2) {
		int sum = num1 + num2 ;
		return sum;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/multiply")
	public int multiply(int num1, int num2) {
		int sum = num1 * num2;
		return sum;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/subtract")
	public int subtract(int num1, int num2) {
		int sum = num1 - num2;
		return sum;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/divide")
	public double divide (double num1, double num2) {
		double sum = num1 / num2;
		return sum;
	}
}

//add?num1=10&num2=10
//multiply?num1=10&num2=10
//subtract?num1=10&num2=10
//divide?num1=10&num2=10
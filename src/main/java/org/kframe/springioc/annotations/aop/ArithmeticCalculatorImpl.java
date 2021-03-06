package org.kframe.springioc.annotations.aop;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

	@Override
	public int add(int i, int j) {
		System.out.println("The method add begins with["+i+","+j+"]");
		int result = i + j;
		System.out.println("The method add ends with"+result);
		return result;
	}
	@Override
	public int sub(int i, int j) {
		System.out.println("The method sub begins with["+i+","+"]");
		int result = i - j;
		System.out.println("The method sub ends with"+result);
		return result;
	}
	@Override
	public int mul(int i, int j) {
		System.out.println("The method mul begins with["+i+","+j+"]");
		int result = i * j;
		System.out.println("The method mul ends with"+result);
		return result;
	}
	@Override
	public int div(int i, int j) {
		System.out.println("The method div begins with["+i+","+j+"]");
		int result = i / j;
		System.out.println("The method div ends with"+result);
		return result;
	}

}

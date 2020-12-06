package com.rpete.calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperandOne(10.5);
		c.setOperation("+");
		c.setOperandTwo(5.2);
		c.performOperation();
		c.getResults();
		
		c.setOperandOne(2.2);
		c.setOperation("-");
		c.setOperandTwo(1.1);
		c.performOperation();
		c.getResults();
		
		c.setOperandOne(4.4);
		c.setOperation("*");
		c.setOperandTwo(4.4);
		c.performOperation();
		c.getResults();
		
	}
}

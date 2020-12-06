package com.rpete.calculator;

@SuppressWarnings("serial")
class Calculator implements java.io.Serializable {
	private double x;
	private double y;
	private String symbol;
	private String result;
	
	public Calculator() {
		
	}
	
	public void setOperandOne(double num) {
		x = num;
		System.out.println("Value of x is: " + x);
	}
	
	public double getOperandOne() {
		return x;
	}
	
	public void setOperandTwo(double num) {
		y = num;
		System.out.println("Value of y is: " + y);
	}
	
	public double getOperandTwo() {
		return y;
	}
	
	public void setOperation(String symbolInput) {
		symbol = symbolInput;
		System.out.println("The type of operation you chose is: " + symbol);
	}
	
	public String getOperation() {
		return symbol;
	}
	
	public void performOperation() {
		if (getOperation() == "+") {
			double additionOperation = getOperandOne() + getOperandTwo();
			result = String.valueOf(additionOperation);
		} else if (getOperation() == "-") {
			double subtractionOperation = getOperandOne() - getOperandTwo();
			result = String.valueOf(subtractionOperation);
		} else {
			System.out.println("That type of operation is not currently supported...");
		}
	}
	
	public void getResults() {
		if (getOperation() == "+" || getOperation() == "-") {
			System.out.println(x + " " + symbol + " " + y + " = " + result);
		}
	}
}

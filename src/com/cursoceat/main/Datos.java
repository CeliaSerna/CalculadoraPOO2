package com.cursoceat.main;

public class Datos {

	private double num1;
	private double num2;
    //private double resultado;
	
public Datos(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

public Datos() {
}

public double getNum1() {
	return num1;
}

public void setNum1(double num1) {
	this.num1 = num1;
}

public double getNum2() {
	return num2;
}

public void setNum2(double num2) {
	this.num2 = num2;
}
public double suma(double num1, double num2) {
	
	double resultado = num1 + num2;
	return resultado;
}
public double resta(double num1, double num2) {

	double resultado = num1 - num2;
	return resultado;

	}
public double multiplicacion(double num1, double num2) {

	double resultado = num1 * num2;
	return resultado;

	}
public double division(double num1, double num2) {

	double resultado = num1 / num2;
	return resultado;

	}
public double potencia(double num1, double num2) {

	double resultado = Math.pow(num1, num2);
	return resultado;

	}
public double resto(double num1, double num2) {

	double resultado = num1%num2;
	return resultado;

	}



}

package com.cursoceat.ui;

import java.util.Scanner;

import com.cursoceat.main.Datos;

public class Menu {
static double num1, num2;
static Scanner entrada = new Scanner(System.in);

static	Datos miDatos = new Datos();
	
	static public void menuPrincipal() {
		int opcion;
		
		do {
			System.out.println("---------------------");
			System.out.println("-----Calculadora-----");
			System.out.println("---------------------");
			System.out.println("  1- Sumar ");
			System.out.println("  2- Restar");
			System.out.println("  3- Multiplicar");
			System.out.println("  4- Dividir");
			System.out.println("  5- Calcular resto");
			System.out.println("  6- Potencia");
			System.out.println("---------------------");
			System.out.println("  7- Salir");
			System.out.println("---------------------");
		opcion = new Scanner(System.in).nextInt();
		}while (opcion >7 || opcion <1);
		
		if(opcion ==7) {
			System.out.println("  Hasta luego");
		}else {
		System.out.println("Escriba un número");
		num1= entrada.nextDouble();
		miDatos.setNum1(num1);
		System.out.println("Escriba otro número");
		num2= entrada.nextDouble();
		miDatos.setNum1(num1);
		
		switch (opcion) {
		case 1-> {
			System.out.println(miDatos.suma(num1, num2));
			menuPrincipal();
		}
		case 2-> {
		System.out.println(miDatos.resta(num1, num2));
		menuPrincipal();
		}
		case 3->{
			System.out.println(miDatos.multiplicacion(num1, num2));
			menuPrincipal();
		}
		case 4-> {
		System.out.println(miDatos.division(num1, num2));
		menuPrincipal();
		}
		case 5->{
		System.out.println(miDatos.resto(num1, num2));
		menuPrincipal();
		}
		case 6->{
		System.out.println(miDatos.potencia(num1, num2));
		menuPrincipal();
		}
		default ->System.err.println("Opción no correcta");
		
		}
		}	
	}
}

package ar.unlam.edu.tp;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
 do{
	 System.out.println("Ingrese su operaci�n /n 1 para multiplicar /n 2 para dividir /n 3 para sumar /n 4 para restar");
	 opcion = teclado.next();
 } 
 while(opcion < 1 && opcion > 4)
 	
	System.out.println("Ingrese el primer numero");
	a = teclado.next();
	System.out.println("Ingrese el segundo numero");
	a = teclado.next();
 
 switch(opcion) 
 {
	 case 1:
		 resultado = a * b;
		 break;
	 case 2:
		 resultado = a / b;
		 break;
	 case 3:
		 resultado = a + b;
		 break;
	 case 4:
		 resultado = a - b;
		 break;
 } 
 
 System.out.println("El resultado es " + resultado.toString());
 }
}
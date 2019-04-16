package ar.unlam.edu.tp;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Float a;
		Float b;
		Integer opcion;
		Float resultado;
 do{
 System.out.println("Ingrese su operación /n 1 para multiplicar /n 2 para dividir /n 3 para sumar /n 4 para restar  /n 5 para radicar");
 opcion = teclado.next();
 } 
 while(opcion < 1 && opcion > 5)
 System.out.println("Ingrese el primer numero(o el radicando si es radicacion");
 a = teclado.next();
 System.out.println("Ingrese el segundo numero(o el indice si es radicacion");
 a = teclado.next();
 
 switch(opcion) {
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
 case 5:
	 resultado = (float) Math.pow(a,1/b);
 } 
 
 System.out.println("El resultado es " + resultado.toString());
 }
}

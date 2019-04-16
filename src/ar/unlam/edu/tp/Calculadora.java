package ar.unlam.edu.tp;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
 do{
 System.out.println("Ingrese su operación /n 1 para multiplicar /n 2 para dividir /n 3 para sumar /n 4 para restar  /n 5 para potenciar");
 opcion = teclado.next();
 } 
 while(opcion < 1 && opcion > 5)
 System.out.println("Ingrese el primer numero(o la base si es potencia");
 a = teclado.next();
 System.out.println("Ingrese el segundo numero(o el exponente si es potencia");
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
	 resultado = (int) Math.pow(a,b);
 } 
 
 System.out.println("El resultado es " + resultado.toString());
 }
}
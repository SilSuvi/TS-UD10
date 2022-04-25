package UD10.Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		start();
	}


	public static void start() {
		Scanner ask = new Scanner(System.in);
		System.out.println("Vamos a iniciar este programa... Diga sí, si quiere continuar, no para salir");
		String respuesta = ask.nextLine();
		respuesta = respuesta.toLowerCase();
		if(respuesta.equals("si") || respuesta.equals("sí")) init();
		else System.out.println("Adiós");
	}
	
	public static void init() {
		System.out.println("**INICIANDO**");
		Scanner ask = new Scanner(System.in);
		System.out.println("Adivine un número del 1 al 50: prueba suerte:");
		try {
			int number = ask.nextInt();
			Numeros numero = new Numeros(number);
			numero.setRandomNumber();
			numero.randomVerified();
			do {
				System.out.println("Siga probando suerte...");
				try {
					number = ask.nextInt();
					numero.setNumber(number);
					numero.randomVerified();
					numero.printVerification();
				}catch(InputMismatchException e) {
					System.out.println("No ha introducido un nº entero");
					break;	
				}
			}while(numero.isNotNull());
		}catch(InputMismatchException e) {
			System.out.println("No ha introducido un nº entero");
	}
	}		
}

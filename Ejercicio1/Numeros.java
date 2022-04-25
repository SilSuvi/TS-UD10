package UD10.Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numeros {

	private int number;
	private final int MIN = 1;
	private final int MAX = 50;
	private int randomNumber;
	private int counterIntents;

	//CONSTRUCTORES
	
	public Numeros() {
		number = 0;
		randomNumber = 0;
		counterIntents = 0;
	}

	public Numeros(int number) {
		this.number = number;
	}

	//GETTERS Y SETTERS
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
	// NÚMERO ALEATORIO
	
	public void setRandomNumber() {
		this.randomNumber = (int) (Math.random() * (MAX - MIN));
		System.out.println(this.randomNumber);
	}

	// VERIFICACIÓN
	
	public void randomVerified() {
		if (this.number == this.randomNumber) {
			System.out.println("¡NÚMERO CORRECTO!");
		} else {
			this.counterIntents++;
			System.out.println("Intentos realizados hasta ahora " + this.counterIntents);
			if (this.number > this.randomNumber) {
				System.out.println("El número que busca es menor que el indicado");
			} else {
				System.out.println("El número que busca es mayor que el indicado");
			}
		}
	}

	public boolean isNotNull() {
		if (this.number != this.randomNumber) {
			return true;
		}
		return false;
	}

	public void printVerification() {
		if (!isNotNull()) {
			System.out.println("El número de intentos ha sido igual a " + this.counterIntents);
		}
	}
}

package Controladores;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import Servicios.ImplemetacionCalculadora;
import Servicios.InterfazCalculadora;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		InterfazCalculadora inter= new ImplemetacionCalculadora();
		int opcion=0;
		double num1=0;
		double num2=0;
		double resultado=0;
	try {
		do {
		System.out.println("1-Suma");
		System.out.println("2-Resta");
		System.out.println("3-Multiplicacion");
		System.out.println("4-Division");
		System.out.println("5-Resto");
		System.out.println("6-Exponente");
		System.out.println("0-Salir");
		System.out.println("Introduzca una opcion: ");
		opcion=leer.nextInt();
		
		if(opcion>0&&opcion<7) {
			System.out.println("Numero 1:");
			num1=leer.nextDouble();
			System.out.println("Numero 2:");
			num2=leer.nextDouble();
		}
		else if(opcion>0) {
			System.out.println("Introdujo una opcion que no esta en el menu");
		}
		
		switch(opcion) {
		case 1:
			resultado+=inter.suma(num1, num2);
			break;
		case 2:
			resultado+=inter.resta(num1, num2);
			break;
		case 3:
			resultado+=inter.multiplicacion(num1, num2);
			break;
		case 4:
			resultado+=inter.division(num1, num2);
			break;
		case 5:
			resultado+=inter.resto(num1, num2);
			break;
		case 6:
			resultado+=inter.exponente(num1, num2);
			break;
		}
		if(opcion>0&&opcion<7) {
			System.out.println("El resultado es: "+resultado);
			int opcion2=0;
			do {
			System.out.println("¿Quieres guardar el resultado para la proxima cuenta?");
			System.out.println("1-Si");
			System.out.println("2-No");
			opcion2=leer.nextInt();
			if(opcion==2)
				resultado=0;
			}while(opcion2!=1&&opcion2!=2);
		}
			
		}while(opcion!=0);
	}catch(InputMismatchException im) {
		System.out.println("Error: Formato incorrecto "+im.getMessage());	
	}catch(NoSuchElementException  nse) {
		System.out.println("Error: El input esta exausto "+nse.getMessage());	
	}catch(Exception e) {
		System.out.println("Error: "+e.getMessage());	
	}
		leer.close();

	}

}

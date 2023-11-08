package edu.calculadoraAritmetica.servicios;

import java.util.Scanner;

public class menuImplementacion implements menuInterfaz {

	Scanner sc = new Scanner(System.in);
	
	public int MostrarMenuYSeleccion() {
	
	int opcion;
	
	
	 System.out.println("******************************");
     System.out.println("*       Menú Principal       *");
     System.out.println("******************************");
     System.out.println("0. Salir");
     System.out.println("1. Suma");
     System.out.println("2. Resta ");
     System.out.println("3. Multiplicación");
     System.out.println("4. División");
    
     System.out.print("Selecciona una opción: ");
     opcion= sc.nextInt();
     
		return opcion;
	}


	public int PedirNumerosOperaciones() {
		int numero;
		System.out.println("Introduzca los dos numeros para realizar la opcion seleccionada: ");
		numero = sc.nextInt();
		return numero;
	}


	
}
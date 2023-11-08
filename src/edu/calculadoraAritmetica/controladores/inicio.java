 package edu.calculadoraAritmetica.controladores;

import edu.calculadoraAritmetica.servicios.*;

public class inicio {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	menuInterfaz menuI = new menuImplementacion();

	int opcion;
	boolean cerrarMenu = false;
	
	
	while(!cerrarMenu) {
		
		opcion=menuI.MostrarMenuYSeleccion();
		
		
		switch(opcion) 
		{
		case 0:
			System.out.println("[INFO] Se cerrará el menú");
			cerrarMenu=true;
			break;
		case 1:
			int numUno, numDos;
			
				numUno=menuI.PedirNumerosOperaciones();
				numDos=menuI.PedirNumerosOperaciones();
				
				System.out.println("La suma de "+ numUno + " y " + numDos + " es " + (numUno+numDos));
			break;
		case 2:
			int restUno, restDos;
			
				restUno=menuI.PedirNumerosOperaciones();
				restDos=menuI.PedirNumerosOperaciones();
				
				System.out.println("La resta de "+ restUno + " y " + restDos + " es " + (restUno-restDos));
			break;
		case 3:
			int multUno, multDos;
			
				multUno=menuI.PedirNumerosOperaciones();
				multDos=menuI.PedirNumerosOperaciones();
				System.out.println("La multiplicación de "+ multUno + " y " + multDos + " es " + (multUno*multDos));
			break;
		case 4:
			int dividendo, divisor;
				
				dividendo=menuI.PedirNumerosOperaciones();
				divisor=menuI.PedirNumerosOperaciones();
				System.out.println("La division de "+ dividendo + " entre " + divisor + " es " + (dividendo/divisor) + " y resto " + (dividendo%divisor));
				
			break;
		default:
			System.out.println("[ALERT Has introducido un caracter incorrecto]");
			break;
		}
		
		
		
		
	}
	
	
		
	}

}

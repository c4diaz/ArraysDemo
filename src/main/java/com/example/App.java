package com.example;

/**
 * Hello world!
 *[]
 */
public class App 
{
    public static void main( String[] args )
    {
        //como declara el array de la mejor forma.
    	
    	int[] numeros = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    	
    	//un array de nombres seria:
    	
    	String[] nombres = {"Tamara","Jessica","Carlos","Adrian","Maria Lopez","Rosa","Pablo","Ivan","Maria Jose","Marly"};
    	
    	//para mostrar por consola los elementos del array de nombres 
    	// VARIANTE #1 utilizando una funcion println, mostrar cada elemento del array
    	
    	System.out.println(nombres[0]);
    	System.out.println(nombres[1]);
    	
    	//y como podran apreciar la variante 1 no sirve para nada.
    	
    	//VARIANTE #2 Implica utilizar una sentencia de control de flujo
    	//para recorrer el array y lo veremos en la barra  "sentenciasdecontroldeflujo"
    }
}

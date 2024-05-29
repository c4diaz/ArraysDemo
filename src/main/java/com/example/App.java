package com.example;

import javax.swing.JOptionPane;

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
    	
    	String[] nombres = {"Tamara", "Jessica", "Carlos", "Adrian", "Maria Lopez", "Rosa", "Pablo", "Ivan", "Maria Jose", "Marly"};
    	
    	//para mostrar por consola los elementos del array de nombres 
    	
    	
    	// Esta VARIANTE #1 Implica utilizar una sentencia de control de flujo
    	//para recorrer el array y lo veremos en la barra  "sentenciasdecontroldeflujo"
    	
    	
    	//recorremos en bucle todos los nombres con la sentencia FOR de toda la vida o clasica .
    	//for (declaramos la variable int = 0 "iniciar en 0 para tener en cuenta el inicio del array" ; 
    	// despues del punto y coma va la condicion que tiene que cumplirse = (haremos la condicion para recorrer los nombres))
    	// ; i aumenta desde cero sea menor hasta la cantidad del array. es decir con el .length que indica que recorrera los nombres 
    	//la condicion de ; i = i + 1 empezara a recorrer en el bucle, lo notaremos asi= i++
    	
    	//¿que diferenia hay entre utilizar el operador i++ o ++i?
    	// para solucionar este problema clasico de un lenguaje de programacion utilizaremos un JSHELL, que es un como un shell de python
    	// que antes java no tenia.
    	// ++j no es lo mismo que j++ ver imagenes power shell
    	
    	
    
    	
    	 for(int i = 0; i < nombres.length; i++) {
    		 
    		//System.out.println(nombres[i]);
    		
    	 }
    	 
    	//CUANDO UTILIZAR ESTE FOR CLASICO= cuando queremos recorrer el indice y queremos recorrer un indice especificado. ejemplo:
    	 
    	 	 for(int i = 0; i < numeros.length; i++) {
    	 		 if (i % 2 == 0) // == es el simbolo = 
					System.out.println("el elemento de indice " + i + ", es par");
    	 		 else
    	 			System.out.println("el elemento de indice " + i + ", es impar");
    	 	 }
    	
    	 /* solamente mostrar los nombres que tienen mas de 4 caracteres*/
    	 
    	 for(int i = 0; i < nombres.length; i++) {
    		 //lengt() entre parentesis es un metodo
    		 if (nombres[i].length() > 4) {
    			 //System.out.println(nombres[i]);
    		 }
    		 
     		
     		
     	 }
    	 
    	
    	//recorrido con FOR mejorado en ocasiones MAL llamado for each (por cada) y digo mal llamado por que la sentencia 
    	//forEach existe.
    	
    	 
    	 
    	
    }
}



package com.example;


/**
 * Actividad del Jueves 30 de Mayo

Ejercicio # 1.

Modificar el proyecto ArraysDemo para que reciba 4 argumentos y el cuarto sea un valor de tipo double para
asignarlo a una variable static de tipo double en la clase que contiene el metodo main.

Mostrar el valor de la variable que a la cual le hemos asignado el argumento.
 *[]
 */
public class App 
{
	
	private static int ARRAY_SIZE;
	private static String nombre;
	private static double cuartoArgumento;
	
    public static void main( String[] args )
    {

    	if(args.length == 0 ) {
    		System.out.println("No se han recibido los argumentos esperados");}
    	
    	else if (args.length != 4){
    		System.out.println("No se han recibido tres argumentos");}
    	
    	else {
    		System.out.println("ya tenemos cuatro o mas argumentos");}
    		
    	
    	for(String argumento : args)
    			System.out.println(argumento);
    		
    	
    	ARRAY_SIZE = Integer.parseInt(args[1]);
    		System.out.println("el segundo argumento es \n" + ARRAY_SIZE);
    	
    	
    	cuartoArgumento = Double.parseDouble(args[3]);
    		System.out.println("el cuarto  argumento es \n" + cuartoArgumento);
    		
    	
   }
}



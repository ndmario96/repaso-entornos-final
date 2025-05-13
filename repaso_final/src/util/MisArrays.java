package util;

import java.util.Arrays;

public class MisArrays {
	/**
	 * 
	 * Calcula la media de las notas que hay dentro del array
	 * @param  arrayDecimal
	 * @return float
	 * @throws IllegalArgumentException
	 */
	public static float mediaNotas(float []arrayDecimal) throws IllegalArgumentException{
		float media = 0;
		
		
		
	   for (int i = 0; i < arrayDecimal.length; i++) {
		   if(arrayDecimal[i] < 0 || arrayDecimal[i] > 10) {
			   throw new IllegalArgumentException ("Numero fuera de rango");
		   }
		   media += arrayDecimal[i];	
	}
		return media/arrayDecimal.length;
	}
	
	/**
	 * Función que calcula la mediana del array compuesto por notas. 
	 * @param arrayDecimal
	 * @return Devuelve la mediana de tipo float
	 * @throws IllegalArgumentException
	 */
	
	public static float medianaNotas(float []arrayDecimal) throws IllegalArgumentException{
		float mediana = 0;
		
		int mitad = arrayDecimal.length/2;
		
		for (int i = 0; i < arrayDecimal.length; i++) {
			if (arrayDecimal[i] < 0 || arrayDecimal[i]>10) {
				throw new IllegalArgumentException ("Numero fuera de rango");
			}
		}
		Arrays.sort(arrayDecimal);
		if(arrayDecimal.length%2 == 0) {
			
			
			mediana = (arrayDecimal[mitad] + arrayDecimal[mitad-1])/2;
		}else {
			mediana = arrayDecimal[mitad];
		}
		return mediana;
	}
	
	/**
	 * Función que devuelve la nota máxima que hay en el interior del array
	 * @param arrayDecimal
	 * @return Devuelve la nota máxima tipo int
	 * @throws IllegalArgumentException
	 */
	
	public static int maximaNota (float []arrayDecimal)throws IllegalArgumentException {
		float maximaNota= 0;
		
		for (int i = 0; i < arrayDecimal.length; i++) {
			if (arrayDecimal[i] < 0 || arrayDecimal[i]>10) {
				throw new IllegalArgumentException ("Numero fuera de rango");
			}
			if (arrayDecimal[i]> maximaNota) {
				maximaNota = arrayDecimal[i];
			}
			
		}
		return (int) maximaNota;
		
	}
	
	/**
	 * 
	 * Función que devuelve la nota 
	 * @param arrayDecimal
	 * @return Devuelve la nota minima de tipo int
	 */
	
	public static int minimaNota (float []arrayDecimal)throws IllegalArgumentException {
		float minimaNota= 10;
		
		for (int i = 0; i < arrayDecimal.length; i++) {
			if (arrayDecimal[i] < 0 || arrayDecimal[i]>10) {
				throw new IllegalArgumentException ("Numero fuera de rango");
			}
			if (arrayDecimal[i] < minimaNota) {
				minimaNota = arrayDecimal[i];
			}		
		}
		return (int) minimaNota;
		
	}
}

// Autor: André Oliveira de Sousa - Mat.: 11325684
// Trabalho 1 de APA
// Professor: Bruno Petrato Bruck

import java.util.Arrays;

public class InsertionSort {
	
	private static void insertionSort(int[] array, int tam) {			
		int i, j = 0, aux = 0;
		
		for (i = 1; i < tam; i++) {
			aux = array[i];
			j = i - 1;
		
			while ((j >= 0) && (aux < array[j])) {
				array[j+1] = array[j];
				j--;
			}
			array[j + 1] = aux;		
		}
		
	}

	public static void main(String[] args) {
		
		int []array1 = {3, 2, 10, 10, 567, 100, 98, 83, 92, 82, 1, 4, -1, -3, -2, 5, 8, 7};
		int []array2 = {1, 9, 8, 10, 25, 49, 13, 109, 88};
		int []array3 = {4, 2000, 14, 17, 1999, 23, 45, 94, 31, 840, 950, 749, 11, 27, 40, 39, 77, 62, 25};

		System.out.println();
		System.out.println("Valores informados no array 1: " + Arrays.toString(array1));		
		insertionSort(array1, array1.length);		
		System.out.print("Apos chamar o Insertion Sort: " + Arrays.toString(array1));	
		System.out.println("\n");

		System.out.println("Valores informados no array 2: " + Arrays.toString(array2));		
		insertionSort(array2, array2.length);		
		System.out.print("Apos chamar o Insertion Sort: " + Arrays.toString(array2));
		System.out.println("\n");
		
		System.out.println("Valores informados no array 3: " + Arrays.toString(array3));		
		insertionSort(array3, array3.length);		
		System.out.print("Apos chamar o Insertion Sort: " + Arrays.toString(array3));
		System.out.println();
	}
	
}

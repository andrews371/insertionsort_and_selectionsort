import java.util.Arrays;

public class SelectionSort {
	
	private static void selectionSort(int[] array, int tam) {
		int menor = 0, aux = 0;
		for (int i = 0; i < tam; i++) {
			menor = i;
			for (int j = i + 1; j < tam; j++) {
				if (array[j] < array[menor]) {
					menor = j;
				}
			}
			if (array[i] != array[menor]) {
				aux = array[i];
				array[i] = array[menor];
				array[menor] = aux;
			}
		}
	}

	public static void main(String[] args) {
		int []array1 = {3, 2, 409, 408, 10, 100, 98, 83, 92, 82, 1, 4, 5, 8, 7};
		int []array2 = {1, 9, 8, 0, 408, 10, 25, -1, -3, -3, -2, 49, 13, 109, 88};
		int []array3 = {4, 2000, 14, 17, 1999, 23, 45, 408, 94, 31, 840, 950, 749, 11, 27, 40, 39, 77, 62, 25};
		
		System.out.println();		
		System.out.println("Valores informados no array 1: " + Arrays.toString(array1));		
		selectionSort(array1, array1.length);		
		System.out.print("Apos chamar o selection Sort: " + Arrays.toString(array1));	
		System.out.println("\n");

		System.out.println("Valores informados no array 2: " + Arrays.toString(array2));		
		selectionSort(array2, array2.length);		
		System.out.print("Apos chamar o selection Sort: " + Arrays.toString(array2));
		System.out.println("\n");
		
		System.out.println("Valores informados no array 3: " + Arrays.toString(array3));		
		selectionSort(array3, array3.length);		
		System.out.print("Apos chamar o selection Sort: " + Arrays.toString(array3));
		System.out.println();

	}

}

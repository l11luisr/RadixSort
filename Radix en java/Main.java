public class Main {
	
	public static void main(String[] args) {
		
		Ordenamiento ordenar = new Ordenamiento();
		Pasos steps = new Pasos();
		int vector[] = {345, 721, 425, 572, 836, 467, 672, 194, 365, 236}; // Arreglo de 10 elementos
		System.out.println("\n\t Método Radix Sort");
		System.out.println("\n Arreglo original: ");
		ordenar.mostrarArreglo(vector); // Mostramos arreglo original
		steps.muestraPasos(); // Mostramos pasos
		ordenar.Radix(vector); // Se aplica el método Radix
		
	}

}

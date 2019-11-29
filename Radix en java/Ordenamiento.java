public class Ordenamiento {
	
	// Atributos
	int i, j, x, temp;
	
	// Implementación método Radix Sort
	public void Radix(int [] arreglo) {
		
		// Los números de bits usados para representar un valor entero de dos complementos binarios
		// Es decir: 32 bits - 1
		for(x = Integer.SIZE - 1; x >= 0; x--) {
			
			int aux[] = new int[arreglo.length]; // Arreglo aux del mismo tamano de arreglo.length
			j = 0;
			
			for(i = 0; i < arreglo.length; i++) {
				
				// Mueve lo que tenga arreglo en su posición i
				boolean mover = arreglo[i] << x >= 0; // Se asigna si x es mayor o igual a cero, regresa verdadero o falso
				
				/* if(x > y) 
                mayor = x;        // Mejor utilizamos el operador ternario
             else 
     	         mayor = y; */
				
				// Utilizando operador ternario ? en caso de que sea correcto
				if(x == 0 ? !mover:mover) {   // Evalua la negación de mover y lo compara con lo contrario
					aux[j] = arreglo[i]; // Se asigna lo que tenga arreglo en la posición i
					j++;
					
				} else {
					
					arreglo[i-j] = arreglo[i]; // En caso contrario se asigna a arreglo en posición i - j
				}
			}
			
			// Va copiando lo que tengamos en arreglo aux
			for(i = j; i < aux.length; i++) {
				
				aux[i] = arreglo[i-j]; // Se asigna lo que tiene arreglo de i - j
			}
			
			arreglo = aux;   // Se copia lo de auxiliar a arreglo iterativamente tomando en cuenta las unidades, decenas y centenas
		}
		
		System.out.println("\n Arreglo ordenado: ");
		mostrarArreglo(arreglo); // Muestra arreglo ordenado
		
	}
	
	public void mostrarArreglo(int [] arreglo) {
		
		// Atributo local
		int k;
		
		for(k = 0; k < arreglo.length; k++) {
			
			System.out.print(" [ " + arreglo[k] + " ] ");
		}
		
		System.out.println("");
	}

}

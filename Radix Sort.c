/*     ALGORITMOS Y ESTRUCTURA DE DATOS

  ---PRUEBA DE METODO DE ORDENAMIENTO-----
                RADIX SORT

    21/11/19
    2019-2

    Elaborado por:
        - Cruz Sanchez Miriam Fernanda
        - Rodriguez Muñoz Jose Luis

*/

#include <stdio.h>
#define MAX 10    // MAX de elementos dentro de la lista
#define N 10      // Número de dígitos

// FUNCIONES PROTOTIPO
void muestraArreglo(int a[]);
void radixsort(int a[]);


int main()
{
    int i;

    // ARREGLO DE 10 ELEMENTOS
    int arr[MAX]={35,1,425,572,86,46,672,1940,3,26};

    // ARREGLO DE 20 ELEMENTOS
    //int arr[MAX]={120,13,16,3,46,99,146,345,678,567,5778,12,34,89,56,39,78,100,569,300};

    // PEOR DE LOS CASOS
    //int arr[MAX]={1940,672,572,425,83,46,35,26,3,1};

	// MEJOR DE LOS CASOS
	//int arr[MAX]={1,3,26,35,46,83,425,572,672,1940};

    printf("\nOriginal:\n");
    muestraArreglo(arr);
    printf("Exponente\n");

    radixsort(arr);

    printf("\nOrdenados:\n");
    muestraArreglo(arr);
    printf("\n");

    return 0;
}

/* CUERPO DE FUNCIONES */

void muestraArreglo(int a[])
{
    int i;
    for (i = 0; i < MAX; i++)
        printf("[%d]\t", a[i]);
    //PRUEBA CON  ARREGLO 20 printf("%d. [%d]\n",i,a[i]);
}


void radixsort(int a[])
{
    int i, m = 0, exp = 1, cont = 0;
    int b[MAX] = {0};

    // PASO 1: Determina cual es el mayor en cifras
    for (i = 0; i < MAX; i++)
    {
        if (a[i] > m)
            m = a[i];
    }


    // PASO 2: MIENTRAS QUE EL MAYOR ENCONTRADO ENTRE EL EXPONENTE SEA MAYOR A CERO
    while (m / exp > 0)
    {
        int bucket[N] = {0}; // Arreglo de 10 para en cada espacio guardar el numero correspondiente


        // PASO 3:EN ARREGLO SACO EL MENOS SIGNIFICATIVO Y AGREGO CUANTOS TIENE
        for (i = 0; i <MAX; i++)
        {
                                                      // int pos=0;
            bucket[a[i] / exp % 10]++;                 /* pos= a[i]/exp%10;
                                                      bucket[pos]++; */
        }

        /*
        printf("\nContenido de las cubetas separadas\n");
        muestraArreglo(bucket,N);*/

    // PASO 4: SE SUMA LO QUE SE TIENE PARA ENCONTRAR POSICION
    for (i = 1; i < MAX; i++)
        bucket[i] += bucket[i - 1];



    // PASO 5: SE TIENE UN ARREGLO AUX b QUE AYUDA A ENCONTRAR LA  EL INDICE A ORDENAR
    for (i = MAX - 1; i >= 0; i--)
        b[--bucket[a[i] / exp % 10]] = a[i];


    // PASO 6: PASAMOS EL CONTENIDO DEL AUX AL ARREGLO ORIGINAL
    for (i = 0; i < MAX; i++)
        a[i] = b[i];


    // PASO 7: cont SE AUMENTA para tener un control de iteraciones
        cont++;

    // PASO 8: SE IMPRIME Y SE MUESTRA EL ORDENAMIENTO EN CADA ITERACION
        printf("\nNo. Iteracion %d:\n", cont);
        muestraArreglo(a);
        printf("%d", exp);


    // PASO 9: SE MULTIPLICA EL EXPONENTE PARA OBTENER U,D,C
    exp *= 10; //incremento de 1 10 100

    }
}

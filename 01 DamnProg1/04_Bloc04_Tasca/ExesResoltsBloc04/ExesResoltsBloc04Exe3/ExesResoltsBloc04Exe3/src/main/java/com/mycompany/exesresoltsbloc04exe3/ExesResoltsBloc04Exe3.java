package com.mycompany.exesresoltsbloc04exe3;

import com.mycompany.utilitatsarray.UtilitatsArray;

/**
 * Exercicis resolts Bloc 4 Exercici 3
 *
 * @author dsb i avf
 */
public class ExesResoltsBloc04Exe3 {

    public static int[] generaArray(int longitud, int valor) {
        int[] vector = new int[longitud];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = valor;
        }
        return vector;
    }

    public static int sumaArray(int[] valors) {
        int suma = 0;
        for (int i = 0; i < valors.length; i++) {
            suma += valors[i];
        }
        return suma;
    }

    public static int producteArray(int[] valors) {
        int producte = 1;
        for (int i = 0; i < valors.length; i++) {
            producte *= valors[i];
        }
        return producte;
    }

    public static void dobleArray(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i] * 2;
        }
    }

    public static void main(String[] args) {

        System.out.println("Primer vector: ");
        int[] vector1 = generaArray(10, 1);
        UtilitatsArray.mostraArray(vector1);
        int suma = sumaArray(vector1);
        System.out.println("La suma dels elements de l'array és: " + suma);
        int producte = producteArray(vector1);
        System.out.println("El producte dels elements de l'array és: " + producte);
        dobleArray(vector1);
        System.out.println("Array doblat:");
        UtilitatsArray.mostraArray(vector1);
        suma = sumaArray(vector1);
        System.out.println("La suma dels elements de l'array una vegada doblat és: " + suma);
        producte = producteArray(vector1);
        System.out.println("El producte dels elements de l'array una vegada doblat és: " + producte);

        System.out.println("\nSegon vector: ");
        int[] vector2 = generaArray(5, 2);
        UtilitatsArray.mostraArray(vector2);
        suma = sumaArray(vector2);
        System.out.println("La suma dels elements de l'array és: " + suma);
        producte = producteArray(vector2);
        System.out.println("El producte dels elements de l'array és: " + producte);
        System.out.println("Array doblat:");
        dobleArray(vector2);
        UtilitatsArray.mostraArray(vector2);
        suma = sumaArray(vector2);
        System.out.println("La suma dels elements de l'array una vegada doblat és: " + suma);
        producte = producteArray(vector2);
        System.out.println("El producte dels elements de l'array una vegada doblat és: " + producte);

    }
}

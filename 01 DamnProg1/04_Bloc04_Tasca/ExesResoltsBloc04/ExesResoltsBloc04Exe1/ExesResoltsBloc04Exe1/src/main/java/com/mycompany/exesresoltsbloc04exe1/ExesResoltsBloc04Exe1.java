package com.mycompany.exesresoltsbloc04exe1;

public class ExesResoltsBloc04Exe1 {
    
/**
 * Exercicis resolts Bloc 4 Exercici 1
 * @author dsb i avf
 */

    public static void main(String[] args) {

        int[] vector = new int[10];

	//Inicialització
        for (int index = 0; index < vector.length; index++) {
            vector[index] = 100 + (int) (Math.random() * 101);
        }

        //Mostrar-los per pantalla
        for (int index = 0; index < vector.length; index++) {
            System.out.print(vector[index] + "\t");
        }
        System.out.println();
    }
}

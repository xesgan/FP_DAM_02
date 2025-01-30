package com.mycompany.exesresoltsbloc04exe2;

public class ExesResoltsBloc04Exe2 {
   
/**
 * Exercicis resolts Bloc 4 Exercici 2 
 * @author dsb i avf
 */

    public static void main(String[] args) {
        
        int[][] m = new int[4][4];
        
        /*1.La inicialitza de forma que cada casella tengui la suma de les seves 
         coordenades.*/
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = i + j;
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        
        /*2. Mostra la diagonal principal, [1,1], [2,2]... */
        System.out.println("Diagonal principal");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][i] + "\t");
        }
        System.out.println();

        /*3. Mostra la diagonal secundària [4,1][3,2]...*/
        System.out.println("Diagonal secundaria");
        for (int i = 0, j = m.length - 1; i < m.length; i++, j--) {
            System.out.print(m[i][j] + "\t");
        }
        System.out.println();
    }
}

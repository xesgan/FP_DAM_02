package com.mycompany.exesresoltsbloc04exe4;

/**
 * Exercicis resolts Bloc 4 Exercici 3
 *
 * @author dsb i avf
 */
public class ExesResoltsBloc04Exe4 {
    
    public static int comptaAs(String paraula) {
        int count = 0;
        for (int i = 0; i < paraula.length(); i++) {
            if ((paraula.charAt(i) == 'a') || (paraula.charAt(i) == 'A') || (paraula.charAt(i) == 'à') || (paraula.charAt(i) == 'À')) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        String[] paraules = {"paraula", "abecedari", "Anastàsia", "Cicle", "Formatiu", "Grau", "Àgora"};
        
        System.out.println("Llista de paraules amb el nombre de As:");
        for (int i = 0; i < paraules.length; i++) {
            System.out.println(paraules[i] + "  conté: " + comptaAs(paraules[i]));
        }
    }
}

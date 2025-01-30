package com.mycompany.concessionari;

/**
* Classe que gestiona un array de màxim maximVehicles de la classe Vehicle
* @author avf i dsb
*/

public class ArrayVehicles {
    
    private Vehicle[] vehicles;
    private int numVehicles;

    // Constructor
    public ArrayVehicles(int maximVehicles) {
        vehicles = new Vehicle[maximVehicles];
        numVehicles = 0;
    }
    
    public Vehicle[] getVehicles() {
        Vehicle[] nou = new Vehicle[numVehicles];
        for (int i = 0; i < numVehicles; i++) {
            nou[i] = vehicles[i];
        }
        return nou;
    }

    public int getNumVehicles() {
        return numVehicles;
    }

    public boolean afegirVehicle(Vehicle nou) {
        if (numVehicles < vehicles.length) {
            vehicles[numVehicles] = nou;
            numVehicles++;
            return true;
        } else {
            return false;
        }
    }
    
    public int comptarVehiclesDeMarca(String marca) {
        int comptador=0;
        for (int i=0; i<numVehicles; i++) {
            if (vehicles[i].getMarca().equals(marca)) {
                comptador++;
            }
        }
        return comptador;
    }
    
    public void canviarMarca( String marca, String marcaNova) {
        for (int i=0; i<numVehicles; i++) {
            if (vehicles[i].getMarca().equals(marca)) {
                vehicles[i].setMarca(marcaNova);
            }
        }
    }
   

    
}

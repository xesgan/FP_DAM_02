package com.mycompany.concessionari;
/**
 * Implementació de la classe Vehicle
 * @author avf i dsb
 */
public class Vehicle {
    
    private String marca;
    private int potencia;
    private int velocitat;
    private int velocitatMaxima;
    
    public Vehicle() {
    }
    
    public Vehicle(String marca, int potencia, int velocitat, int velocitatMaxima) {
        this.marca = marca;
        this.potencia = potencia;
        this.velocitat = velocitat;
        this.velocitatMaxima = velocitatMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }

    public int getVelocitatMaxima() {
        return velocitatMaxima;
    }

    public void setVelocitatMaxima(int velocitatMaxima) {
        this.velocitatMaxima = velocitatMaxima;
    }
    
    public void augmentarVelocitat (int increment) {
        this.velocitat = this.velocitat + increment;
    }

    public void reduirVelocitat (int decrement) {
        this.velocitat = this.velocitat - decrement;
    } 

    @Override
    public String toString() {
        return "Vehicle{" + "marca=" + marca + ", potencia=" + potencia + ", velocitat=" + velocitat + ", velocitatMaxima=" + velocitatMaxima + '}';
    }
    
    
    
}

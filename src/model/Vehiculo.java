package model;

public class Vehiculo implements Registrable {

    private String patente;
    private String modelo;
    private int capacidad;


    /**
     *
     * Constructor sin parametros
     */


    public Vehiculo(){
        this.patente = "Sin Patente";
        this.modelo = "Sin Modelo";
        this.capacidad = 0;
    }

    /**
     *
     * Constructor con parametros
     */

    public Vehiculo(String patente, String modelo, int capacidad){
        this.patente = patente;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    //Getters

    public String getPatente() {
        return patente;
    }
    public String getModelo() {
        return modelo;
    }
    public int getCapacidad() {
        return capacidad;
    }

    //Setters

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * To string para devolver la informacion del vehiculo en formato de texto
     */

    @Override
    public String toString() {
        return "Patente : " + patente + ", Modelo : " + modelo + ", Capacidad : " + capacidad;
    }

    /**
     * Metodo mostrarResumen()
     * muestra el resumen del Vehiculo
     *
     */

    @Override
    public void mostrarResumen() {
        System.out.println("Patente: " + patente +  ", Modelo: " + modelo + ", Capacidad: " + capacidad + " pasajeros");

    }
}

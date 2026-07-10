package model;

public class ServicioTuristico {

protected String nombre;
protected int duracionHoras;


//Constructores sin parametros

public ServicioTuristico() {

    this.nombre = "Sin nombre";
    this.duracionHoras = 0;
}

//constructores con parametros

    public ServicioTuristico(String nombre, int duracionHoras) {

    this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    //Getters

    public String getNombre() {
    return nombre;
    }

    public int getDuracion() {
    return duracionHoras;
    }

    //setters

    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
    public void setDuracion(int duracion) {
    this.duracionHoras = duracion;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre
                + ", Duración: " + duracionHoras
                + " horas";
    }

}
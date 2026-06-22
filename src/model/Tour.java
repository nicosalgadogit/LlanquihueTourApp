package model;


/**
 *
 * Clase que representa la información básica de cada paquete turístico:
 *
 */
public class Tour {

    private String nombre;
    private String tipo;
    private int reservas;


    /**
     *
     * Constructores sin parametros
     *
     */

    public Tour() {
        this.nombre = "Sin nombre";
        this.tipo = "Sin tipo";
        this.reservas = 0;
    }

    /**
     *  Constructores con parametros
     *
     */
    public Tour(String nombre, String tipo, int reservas) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.reservas = reservas;
    }

    /**
     *     getters y setters
     */


    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getReservas() {
        return reservas;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setReservas(int reservas){
        this.reservas = reservas;
    }

    /**
     *
     * To string para devolver la informacion de la persona en formato de texto
     *
     */

    @Override
    public String toString(){
        return "Tour: " + nombre + ", Tipo: " + tipo + ", reservas: " + reservas;
    }
}

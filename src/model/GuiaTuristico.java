package model;
/**
 * Clase composicion de la clase Tour que representa el guia turistico
 */
public class GuiaTuristico {

    private String nombre;
    private String cargo;
    private int experiencia;



    /**
     *
     * Constructores sin parametros
     *
     */

    public GuiaTuristico() {

        this.nombre = "Sin nombre";
        this.cargo = "Sin cargo";
        this.experiencia = 0;


    }
    /**
     *
     * Constructores con parametros
     *
     */

    public GuiaTuristico(String nombre, String cargo, int experiencia){

        this.nombre = nombre;
        this.cargo = cargo;
        this.experiencia = experiencia;
    }

    /**
     * Gettters
     */

    public String getNombre(){

        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public int getExperiencia() {

        return experiencia;
    }

    /**
     * Setters
     */

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }

    /**
     * To string para devolver la informacion del guia turistico en formato de texto
     */
    @Override
    public String toString(){
        return "Nombre: " + nombre +
                ", Cargo: " + cargo +
                ", Años de experiencia: " + experiencia;

    }
}

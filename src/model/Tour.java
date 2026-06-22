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
    private GuiaTuristico guiaTuristico;
    private Direccion direccion;


    /**
     *
     * Constructores sin parametros
     *
     */

    public Tour() {
        this.nombre = "Sin nombre";
        this.tipo = "Sin tipo";
        this.reservas = 0;
        this.guiaTuristico = new GuiaTuristico();
        this.direccion = new Direccion();
    }

    /**
     *  Constructores con parametros
     *
     */
    public Tour(String nombre, String tipo, int reservas, GuiaTuristico guiaTuristico, Direccion direccion) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.reservas = reservas;
        this.guiaTuristico = guiaTuristico;
        this.direccion = direccion;
    }

    /**
     *     getters y setters
     */

// Getters
    public String getNombre() {

        return nombre;
    }

    public String getTipo() {

        return tipo;
    }

    public int getReservas() {

        return reservas;
    }

    public GuiaTuristico getGuiaTuristico() {
        return guiaTuristico;
    }
    public Direccion getDireccion(){
        return direccion;
    }

   // Setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setReservas(int reservas){
        this.reservas = reservas;
    }
    public void setGuiaTuristico(GuiaTuristico guiaTuristico){
        this.guiaTuristico = guiaTuristico;
    }
    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }

    /**
     *
     * To string para devolver la informacion del tour en formato de texto
     *
     */

    @Override
    public String toString(){
        return "Tour: " + nombre +
                ", Tipo: " + tipo +
                ", reservas: " + reservas +
                ", Guia turistico --> " + guiaTuristico +
                ", Direccion: " + direccion;
    }
}

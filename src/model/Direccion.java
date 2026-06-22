package model;

/**
 *Clase que representa la direccion del Tour
 */
public class Direccion {
    private String calle;
    private String ciudad;
    private String comuna;
    /**
     *
     * Constructores sin parametros
     *
     */
    public Direccion() {
        this.calle = "Sin calle";
        this.ciudad = "Sin ciudad";
        this.comuna = "Sin comuna";
    }
    /**
     *
     * Constructores con parametros
     *
     */
    public Direccion(String calle, String ciudad, String comuna) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.comuna = comuna;
    }

    /**
     * Gettters
     */
    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getComuna() {
        return comuna;
    }

    /**
     * Setters
     */

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    /**
     * To string para devolver la informacion del tour en formato texto
     */
    @Override
    public String toString() {
        return calle + ", " +
                ciudad + ", " +
                comuna;
    }
}

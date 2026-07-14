package model;

public class ColaboradorExterno implements Registrable {

    private String nombre;
    private String servicioPrestado;
    private String empresa;

    /**
     * Constructor sin parametros
     */
    public ColaboradorExterno() {
        this.nombre = "Sin nombre";
        this.servicioPrestado = "Sin servicio";
        this.empresa = "Sin empresa";
    }

    /**
     * Constructor con parametros
     */
    public ColaboradorExterno(String nombre, String servicioPrestado, String empresa) {
        this.nombre = nombre;
        this.servicioPrestado = servicioPrestado;
        this.empresa = empresa;
    }

    /**
     * Getters
     */
    public String getNombre() {
        return nombre;
    }

    public String getServicioPrestado() {
        return servicioPrestado;
    }

    public String getEmpresa() {
        return empresa;
    }

    /**
     * Setters
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setServicioPrestado(String servicioPrestado) {
        this.servicioPrestado = servicioPrestado;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * To string para devolver la informacion del colaborador en formato de texto
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Servicio: " + servicioPrestado + ", Empresa: " + empresa;
    }

    /**
     /**
     * Metodo mostrarResumen()
     * muestra el resumen del ColaboradorExterno
     *
     */

    @Override
    public void mostrarResumen() {
        System.out.println("Colaborador externo: " + nombre + " | Servicio: " + servicioPrestado
                + " | Empresa: " + empresa);
    }
}

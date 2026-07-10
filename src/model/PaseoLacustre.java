package model;

public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre() {
        super();
        this.tipoEmbarcacion = "Sin embarcacion";
    }

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String gettipoEmbarcacion() {
        return tipoEmbarcacion;
    }
    public void settipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo embarcacion: " + tipoEmbarcacion;
    }
}

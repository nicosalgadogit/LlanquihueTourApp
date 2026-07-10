package model;

public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;


    public ExcursionCultural() {
        super();
        this.lugarHistorico = "Sin lugar";
    }

    public ExcursionCultural(String lugarHistorico, int duracionHoras, String nombre) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lugar historico: " + lugarHistorico;
    }
}

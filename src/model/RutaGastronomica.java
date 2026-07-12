package model;

public class RutaGastronomica extends  ServicioTuristico {

    private int numeroDeParadas;

    //constructores sin parametros

    public  RutaGastronomica() {
        super();
        this.numeroDeParadas = 0;
    }

    //constructores con parametros

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    //getter
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    //setter
    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }


    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de paradas: " + this.numeroDeParadas);
    }

    @Override
    public String toString() {
        return super.toString() + ", Paradas gastronomicas: " + numeroDeParadas;
    }

}

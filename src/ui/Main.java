package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

/**
 * Clase Main que se encarga de cargar los datos de Tour desde el archivo .txt y los muestra en consola en forma de texto
 */
public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        //Ruta del archivo dentro de resources
        ArrayList<Tour> tours = gestor.cargarTours("resources/tours.txt");

        //Recorrido: muestra todos los elementos
        System.out.println("=== Listado completo de tours ===");
        for (Tour t : tours) {
            System.out.println(t);
        }

        //Filtrado: tours con más de 100 reservas
        System.out.println("\n=== Tours con más de 100 reservas ===");
        for (Tour t : tours) {
            if (t.getReservas() > 100) {
                System.out.println(t);
            }
        }

        //Filtrado: tours de tipo gastronómico
        System.out.println("\n=== Tours gastronómicos ===");
        for (Tour t : tours) {
            if (t.getTipo().equalsIgnoreCase("Gastronómico")) {
                System.out.println(t);
            }
        }
    }
}
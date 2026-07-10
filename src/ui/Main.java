package ui;

import data.GestorServicios;
import model.ServicioTuristico;
import java.util.ArrayList;

/**
 * Clase Main que se encarga de crear los servicios turísticos
 * mediante GestorServicios y mostrarlos en consola en formato de texto
 */
public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();
        ArrayList<ServicioTuristico> servicios = gestor.crearServicios();

        System.out.println("=== Listado de servicios turísticos ===");
        for (ServicioTuristico s : servicios) {
            System.out.println(s);
        }
    }
}
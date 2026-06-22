package data;

/**
 * Clase que se encarga de la lectura de los datos de tours.txt
 */

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    /**
     * Lee el archivo .txt y crea la lista de objetos Tour
     */

    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.isBlank()) continue;


                 //Separa los datos usando ; como delimitador

                String[] datos = linea.split(";");

                String nombre = datos[0];
                String tipo = datos[1];
                int reservas = Integer.parseInt(datos[2]);

                /**
                 * Crea el objeto y lo agrega a la colección
                 */

                Tour tour = new Tour(nombre, tipo, reservas);
                tours.add(tour);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return tours;
    }
}
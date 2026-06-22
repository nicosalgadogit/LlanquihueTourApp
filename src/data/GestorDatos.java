package data;

/**
 * Clase que se encarga de la lectura de los datos de tours.txt
 */

import model.Direccion;
import model.GuiaTuristico;
import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;

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
                String nombreGuia = datos[3];
                String cargoGuia = datos[4];
                int expGuia = Integer.parseInt(datos[5]);
                String calle = datos[6];
                String ciudad = datos[7];
                String comuna = datos[8];

                GuiaTuristico guia = new GuiaTuristico(nombreGuia, cargoGuia, expGuia);
                Direccion dir = new Direccion(calle, ciudad, comuna);
                Tour tour = new Tour(nombre, tipo, reservas, guia, dir);

                // Crea el objeto y lo agrega a la colección

                tours.add(tour);
            }

            // catchs en caso de los errores (Try-catch)
        } catch (FileNotFoundException e) {
            System.out.println("Error Archivo no encontrado");
            System.out.println("Error especifico: " + e.getMessage());


        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            System.out.println("Error especifico: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error en formato de número");
            System.out.println("Error específico: " + e.getMessage());

        }
        return tours;
    }
}

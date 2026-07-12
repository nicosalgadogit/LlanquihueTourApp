package data;

/**
 *
 * Clase que se encarga de crear las instancias de prueba
 * de los distintos servicios turísticos (herencia y polimorfismo)
 */

import model.RutaGastronomica;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.ServicioTuristico;
import java.util.ArrayList;
import java.util.List;


public class GestorServicios {


    public List<ServicioTuristico> crearServicios(){

        List<ServicioTuristico> servicios=new ArrayList();

        //Ruta Gastronomica
        servicios.add(new RutaGastronomica("Ruta del salmon", 3, 4));
        servicios.add(new RutaGastronomica("Ruta del vacuno", 4, 5));

        //Ruta lacustres
        servicios.add(new PaseoLacustre("Paseo Lago Llanquihue", 4, "Yate"));
        servicios.add(new PaseoLacustre("Paseo Lago Yelcho", 3, "Bote a motor"));

        //Excursiones culturales

        servicios.add(new ExcursionCultural("Montaña del salto", 3, "Excursion Salto del laja"));
        servicios.add(new ExcursionCultural("Volcan Ardiente",4, "Excursion Volcan Villarica"));

        return servicios;
    }
}
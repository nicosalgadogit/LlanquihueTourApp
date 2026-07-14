package data;

/**
 * Clase que se encarga de gestionar las distintas entidades del sistema
 * (guías turísticos, vehículos, colaboradores externos) mediante
 * la interfaz Registrable, usando polimorfismo y validación de tipos.
 */

import model.ColaboradorExterno;
import model.Registrable;
import model.Vehiculo;
import model.GuiaTuristico;
import java.util.ArrayList;

public class GestorEntidades {

    public ArrayList<Registrable> crearEntidades() {
        ArrayList<Registrable> entidades = new ArrayList<>();

        //Guias turisticas

        entidades.add(new GuiaTuristico("Nicolas Salgado", "Guia del sendero", 3));
        entidades.add(new GuiaTuristico("Juan Carlos", "Guia del lago", 4));

        //Vehiculos

        entidades.add(new Vehiculo("MJQF25", "Bus Toyota", 20));
        entidades.add(new Vehiculo("JIEJ23", "MiniBan Ford", 15));

        //Colaborador externo

        entidades.add(new ColaboradorExterno("Javier Donoso", "Chef profesional", "Casino Las Condes"));
        entidades.add(new ColaboradorExterno("Camila Torres", "Fotografa profesional", "El Clarin"));

        return entidades;
    }


    public void mostrarEntidades(ArrayList<Registrable> entidades) {
        for (Registrable r : entidades) {

            r.mostrarResumen();

            if (r instanceof GuiaTuristico) {
                GuiaTuristico guia = (GuiaTuristico) r;
                System.out.println(" -> Es un guia turistico con " + guia.getExperiencia() + " años de experiencia.");

            } else if (r instanceof Vehiculo) {
                Vehiculo v = (Vehiculo) r;
                System.out.println(" -> Es un vehiculo con capacidad para: " + v.getCapacidad() + "Pasajeros.");

            } else if (r instanceof ColaboradorExterno) {
                ColaboradorExterno c = (ColaboradorExterno) r;
                System.out.println(" -> Es un colaborador externo de la empresa: " + c.getEmpresa() + ".");
            }

            System.out.println("--------");
        }
    }

}

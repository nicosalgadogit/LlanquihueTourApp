package ui;

import data.GestorServicios;
import model.*;
import data.GestorEntidades;

import java.util.List;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Clase Main que se encarga de crear los servicios turísticos
 * mediante GestorServicios y mostrarlos en consola en formato de texto,
 * y de mostrar una interfaz gráfica para registrar entidades del sistema.
 */
public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();
        List<ServicioTuristico> servicios = gestor.crearServicios();

        System.out.println("=== Listado de servicios turísticos ===");
        for (ServicioTuristico s : servicios) {
            s.mostrarInformacion();
            System.out.println("-----");
        }

        /**
         * Entidades del sistema que se mostrarán
         */

        GestorEntidades gestorEntidades = new GestorEntidades();
        ArrayList<Registrable> entidades = gestorEntidades.crearEntidades();

        System.out.println("=== Listado de entidades ==");
        gestorEntidades.mostrarEntidades(entidades);


        JFrame menu = new JFrame("Llanquihue Tour");
        menu.setSize(320, 320);
        menu.setLayout(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnRegistrarGuia = new JButton("Registrar Guia Turistico");
        btnRegistrarGuia.setBounds(60, 30, 190, 30);

        JButton btnRegistrarVehiculo = new JButton("Registrar Vehiculo");
        btnRegistrarVehiculo.setBounds(60, 80, 190, 30);

        JButton btnMostrarEntidades = new JButton("Mostrar todas las entidades");
        btnMostrarEntidades.setBounds(60, 130, 200, 30);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(60, 180, 190, 30);

        menu.add(btnRegistrarGuia);
        menu.add(btnRegistrarVehiculo);
        menu.add(btnMostrarEntidades);
        menu.add(btnSalir);

        // Ventana: Registrar Guía Turístico
        btnRegistrarGuia.addActionListener(e -> {

            JFrame registrarGuia = new JFrame("Registrar Guia Turistico");
            registrarGuia.setSize(320, 320);
            registrarGuia.setLayout(null);

            JLabel lblNombre = new JLabel("Nombre:");
            lblNombre.setBounds(80, 20, 140, 20);

            JTextField campoNombre = new JTextField();
            campoNombre.setBounds(80, 40, 140, 30);

            JLabel lblCargo = new JLabel("Cargo:");
            lblCargo.setBounds(80, 80, 140, 20);

            JTextField campoCargo = new JTextField();
            campoCargo.setBounds(80, 100, 140, 30);

            JLabel lblAños = new JLabel("Años de experiencia:");
            lblAños.setBounds(80, 140, 140, 20);

            JTextField campoAños = new JTextField();
            campoAños.setBounds(80, 160, 140, 30);

            JButton btnGuardar = new JButton("Registrar");
            btnGuardar.setBounds(50, 220, 90, 30);

            JButton btnCancelar = new JButton("Cancelar");
            btnCancelar.setBounds(160, 220, 90, 30);

            btnGuardar.addActionListener(ev -> {
                try {
                    String nombre = campoNombre.getText();
                    String cargo = campoCargo.getText();
                    int años = Integer.parseInt(campoAños.getText());

                    GuiaTuristico nuevoGuia = new GuiaTuristico(nombre, cargo, años);
                    entidades.add(nuevoGuia);

                    JOptionPane.showMessageDialog(registrarGuia, "Guía registrado correctamente.");
                    registrarGuia.dispose();

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(registrarGuia, "Los años de experiencia deben ser un número.");
                }
            });

            btnCancelar.addActionListener(ev -> registrarGuia.dispose());

            registrarGuia.add(lblNombre);
            registrarGuia.add(campoNombre);
            registrarGuia.add(lblCargo);
            registrarGuia.add(campoCargo);
            registrarGuia.add(lblAños);
            registrarGuia.add(campoAños);
            registrarGuia.add(btnGuardar);
            registrarGuia.add(btnCancelar);

            registrarGuia.setLocationRelativeTo(menu);
            registrarGuia.setVisible(true);
        });

        // Ventana: Registrar Vehículo
        btnRegistrarVehiculo.addActionListener(e -> {

            JFrame registrarVehiculo = new JFrame("Registrar Vehiculo");
            registrarVehiculo.setSize(320, 320);
            registrarVehiculo.setLayout(null);

            JLabel lblPatente = new JLabel("Patente:");
            lblPatente.setBounds(80, 20, 140, 20);

            JTextField campoPatente = new JTextField();
            campoPatente.setBounds(80, 40, 140, 30);

            JLabel lblModelo = new JLabel("Modelo:");
            lblModelo.setBounds(80, 80, 140, 20);

            JTextField campoModelo = new JTextField();
            campoModelo.setBounds(80, 100, 140, 30);

            JLabel lblCapacidad = new JLabel("Capacidad de pasajeros:");
            lblCapacidad.setBounds(80, 140, 160, 20);

            JTextField campoCapacidad = new JTextField();
            campoCapacidad.setBounds(80, 160, 140, 30);

            JButton btnGuardar = new JButton("Registrar");
            btnGuardar.setBounds(50, 220, 90, 30);

            JButton btnCancelar = new JButton("Cancelar");
            btnCancelar.setBounds(160, 220, 90, 30);

            btnGuardar.addActionListener(ev -> {
                try {
                    String patente = campoPatente.getText();
                    String modelo = campoModelo.getText();
                    int capacidad = Integer.parseInt(campoCapacidad.getText());

                    Vehiculo nuevoVehiculo = new Vehiculo(patente, modelo, capacidad);
                    entidades.add(nuevoVehiculo);

                    JOptionPane.showMessageDialog(registrarVehiculo, "Vehículo registrado correctamente.");
                    registrarVehiculo.dispose();

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(registrarVehiculo, "La capacidad debe ser un número.");
                }
            });

            btnCancelar.addActionListener(ev -> registrarVehiculo.dispose());

            registrarVehiculo.add(lblPatente);
            registrarVehiculo.add(campoPatente);
            registrarVehiculo.add(lblModelo);
            registrarVehiculo.add(campoModelo);
            registrarVehiculo.add(lblCapacidad);
            registrarVehiculo.add(campoCapacidad);
            registrarVehiculo.add(btnGuardar);
            registrarVehiculo.add(btnCancelar);

            registrarVehiculo.setLocationRelativeTo(menu);
            registrarVehiculo.setVisible(true);
        });

        // Mostrar todas las entidades
        btnMostrarEntidades.addActionListener(e -> {
            String resumen = "";
            for (Registrable r : entidades) {
                resumen = resumen + r.toString() + "\n";
            }
            JOptionPane.showMessageDialog(menu, resumen, "Entidades registradas", JOptionPane.INFORMATION_MESSAGE);
        });

        // Salir
        btnSalir.addActionListener(e -> System.exit(0));

        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }

}
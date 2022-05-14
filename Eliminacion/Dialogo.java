package Eliminacion;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.io.*;

public class Dialogo {

    String dialogo;

    public Dialogo() {
    }

    public int obtenerOpcionMenu() throws IOException {
        dialogo = "MENU DE PROGRAMA PASAJEROS\n";
        dialogo += "1.  Insertar pasajero\n";
        dialogo += "2.  Modificar pasajero\n";
        dialogo += "3.  Listar los pasajeros\n";
        dialogo += "4.  Eliminar pasajero\n";
        dialogo += "5.  Salir\n";
        dialogo += "Escoja Opción:\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogo));
    }

    public String obtenerIdentificacionPasajero() throws IOException {
        dialogo = "Introduzca Identificacion de pasajero\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    // Completamos aquí la petición de datos
    public String obtenerNombrePasajero() throws IOException {
        dialogo = "Introduzca Nombre de pasajero\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerApellidosPasajero() throws IOException {
        dialogo = "Introduzca Apellidos de pasajero\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerEmailPasajero() throws IOException {
        dialogo = "Introduzca email de pasajero\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerCelularPasajero() throws IOException {
        dialogo = "Introduzca Celular de pasajero\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public int obtenerEdadPasajero() throws IOException {
        dialogo = "Introduzca Edad de pasajero\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogo));
    }

    public void mostrarMensaje(String mensaje) {
        JFrame frame = new JFrame("Mensaje");
        JOptionPane.showMessageDialog(frame, mensaje);
    }

    public void cerrarPrograma() {
        JFrame frame = new JFrame("Final del programa");
        JOptionPane.showMessageDialog(frame, "Gracias por usar este programa. Fin");
        System.exit(0);
    }
}
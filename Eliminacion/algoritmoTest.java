package Eliminacion;

import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.Iterator;

public class algoritmoTest {

    public static void main(String[] Args) throws IOException {

        int opcionEligeUsuario = 0;
        List<Pasajero> listaDePasajeros = new ArrayList<Pasajero>();
        Dialogo opcionesUsuario = new Dialogo();
        Dialogo mensajeVent = new Dialogo();

        while (opcionEligeUsuario != 5) {

            opcionEligeUsuario = opcionesUsuario.obtenerOpcionMenu();

            // Registrar la información de pasajero opción 1
            if (opcionEligeUsuario == 1) {

                Pasajero tmpPasajero = new Pasajero();
                tmpPasajero.SetIdentificacion(opcionesUsuario.obtenerIdentificacionPasajero());
                tmpPasajero.SetNombre(opcionesUsuario.obtenerNombrePasajero());
                tmpPasajero.SetApellidos(opcionesUsuario.obtenerApellidosPasajero());
                tmpPasajero.SetEmail(opcionesUsuario.obtenerEmailPasajero());
                tmpPasajero.SetCelular(opcionesUsuario.obtenerCelularPasajero());
                tmpPasajero.SetEdad(opcionesUsuario.obtenerEdadPasajero());
                // Terminamos guardando el objeto pasajero
                listaDePasajeros.add(tmpPasajero);
            }
            // Fin opción 1 registro información de pasajero

            // Modificar la información de un pasajero opción 2
            if (opcionEligeUsuario == 2) {
                String identPasajeroBuscado = opcionesUsuario.obtenerIdentificacionPasajero();
                boolean pasajeroEncontrado = false;

                Iterator<Pasajero> it = listaDePasajeros.iterator();
                Pasajero tmpAnalizando;

                while (it.hasNext()) { // Utilizamos el método hasNext de los objetos tipo Iterator

                    tmpAnalizando = it.next(); // Utilizamos el método next de los objetos tipo Iterator

                    if (tmpAnalizando.getIdentificacion().equals(identPasajeroBuscado)) {
                        pasajeroEncontrado = true;
                        String mensaje = tmpAnalizando.getStringPasajero();
                        mensaje = mensaje + "\n\n\n";
                        mensaje = mensaje + "A continuación introduzca nuevos datos para este pasajero";

                        mensajeVent.mostrarMensaje(mensaje);

                        // Aquí código para pedir nuevos datos para el pasajero

                        mensajeVent.mostrarMensaje("La identificación no puede ser modificada, indique resto de datos");
                        tmpAnalizando.SetNombre(opcionesUsuario.obtenerNombrePasajero());
                        tmpAnalizando.SetApellidos(opcionesUsuario.obtenerApellidosPasajero());
                        tmpAnalizando.SetEmail(opcionesUsuario.obtenerEmailPasajero());
                        tmpAnalizando.SetCelular(opcionesUsuario.obtenerCelularPasajero());
                        tmpAnalizando.SetEdad(opcionesUsuario.obtenerEdadPasajero());

                        mensaje = tmpAnalizando.getStringPasajero();
                        mensajeVent.mostrarMensaje(mensaje);

                    } else {
                    } // else vacío. No hay acciones a ejecutar.

                } // Cierre del while

                if (pasajeroEncontrado == false) {
                    mensajeVent.mostrarMensaje("No se encontró el pasajero con esa identificación");
                }
            } // Fin opción 2 registro información de pasajero

            // Opción 3 listar pasajeros
            if (opcionEligeUsuario == 3) {

                String listado = "";

                Iterator<Pasajero> it2 = listaDePasajeros.iterator();
                Pasajero tmpAnalizando;

                while (it2.hasNext()) { // Utilizamos el método hasNext de los objetos tipo Iterator
                    tmpAnalizando = it2.next(); // Utilizamos el método next de los objetos tipo Iterator
                    listado = listado + tmpAnalizando.getStringPasajero();
                    listado = listado + "\n\n\n";
                } // Cierre del while

                mensajeVent.mostrarMensaje(listado);

            } // Fin opción 3 listar pasajeros

            // Eliminar un pasajero opción 4
            if (opcionEligeUsuario == 4) {
                String identPasajeroBuscado = opcionesUsuario.obtenerIdentificacionPasajero();
                boolean pasajeroEncontrado = false;

                Iterator<Pasajero> it = listaDePasajeros.iterator();
                Pasajero tmpAnalizando;

                while (it.hasNext() && pasajeroEncontrado == false) { // Utilizamos el método hasNext de los objetos
                                                                      // tipo Iterator

                    tmpAnalizando = it.next(); // Utilizamos el método next de los objetos tipo Iterator

                    if (tmpAnalizando.getIdentificacion().equals(identPasajeroBuscado)) {
                        pasajeroEncontrado = true;
                        String mensaje = tmpAnalizando.getStringPasajero();
                        mensaje = mensaje + "\n\n\n";
                        mensaje = mensaje + "Se procede al borrado de datos de este pasajero\n\n";

                        mensajeVent.mostrarMensaje(mensaje);

                        // Aquí código para pedir nuevos datos para el pasajero
                        listaDePasajeros.remove(tmpAnalizando);
                        pasajeroEncontrado = true;

                    } else {
                    } // else vacío. No hay acciones a ejecutar.

                } // Cierre del while

                if (pasajeroEncontrado == false) {
                    mensajeVent.mostrarMensaje("No se encontró el pasajero con esa identificación");
                }
            } // Fin opción 2 registro información de pasajero

        }

        opcionesUsuario.cerrarPrograma();

    } // Cierra main

} // Cierra clase
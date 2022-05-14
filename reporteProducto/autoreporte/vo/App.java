package reporteProducto.autoreporte.vo;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    static public void main(String[] args) {
        try {
            FuenteDatosDAO fuenteDatosDAO = new FuenteDatosDAO();
            EmpleadosDAO empleadosDAO = new EmpleadosDAO();
            ArrayList<reporteProducto.autoreporte.DatosReporteProductos> datos = fuenteDatosDAO.generarDatos();
            ArrayList<DatosReporteEmpleados> empleados = empleadosDAO.datosEmpleados();

            Reporte reporte = new Reporte();

            reporte.crearPaginaReporte(datos, DatosReporteProductos.class, "Reporte de Productos");

            reporte.grabarReporte(new File("reporte.xlsx"));

        } catch (ParseException | IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
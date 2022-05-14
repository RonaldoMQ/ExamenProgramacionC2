package reporteProducto.autoreporte.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpleadosDAO {
    public ArrayList<DatosReporteEmpleados> datosEmpleados() {
        ArrayList<DatosReporteEmpleados> datos = new ArrayList<>();

        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

            DatosReporteEmpleados e1 = new DatosReporteEmpleados();
            e1.setEmpleado("Juan");
            e1.setFechaContrato(formato.parse("2020-01-05"));
            e1.setId(555);

            DatosReporteEmpleados e2 = new DatosReporteEmpleados();
            e2.setEmpleado("Pedro");
            e2.setFechaContrato(formato.parse("2020-01-15"));
            e2.setId(558);

            DatosReporteEmpleados e3 = new DatosReporteEmpleados();
            e3.setEmpleado("Pablo");
            e3.setFechaContrato(formato.parse("2020-01-18"));
            e3.setId(525);

            datos.add(e1);
            datos.add(e2);
            datos.add(e3);

        } catch (ParseException ex) {
            Logger.getLogger(EmpleadosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }
}
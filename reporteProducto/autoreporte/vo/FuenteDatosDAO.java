package reporteProducto.autoreporte.vo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import reporteProducto.autoreporte.DatosReporteProductos;

public class FuenteDatosDAO {

    public ArrayList<DatosReporteProductos> generarDatos() throws ParseException {
        ArrayList<DatosReporteProductos> datos = new ArrayList<>();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaInicial = formato.parse("2000-01-01");
        BigDecimal cien = new BigDecimal("100");

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fechaInicial);

        for (int i = 0; i < 500; i++) {
            DatosReporteProductos registro = new DatosReporteProductos();

            Date fecha = new Date(calendario.getTimeInMillis());
            registro.setFecha(fecha);
            registro.setInventario(i);

            BigDecimal denom = cien.multiply(new BigDecimal(i));
            BigDecimal cambio = denom.divide(new BigDecimal("500"), MathContext.DECIMAL32);
            registro.setCambioEstadistico(cambio);

            registro.setProducto("Producto numero: " + i);

            calendario.add(Calendar.DAY_OF_MONTH, 1);

            datos.add(registro);
        }
        return datos;
    }
}

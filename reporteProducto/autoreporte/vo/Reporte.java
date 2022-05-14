package reporteProducto.autoreporte.vo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import reporteProducto.autoreporte.DatosReporteProductos;

/**
 *
 * @author david
 */
public class Reporte {

    final XSSFWorkbook libro;
    private Class<? extends TipoGenerico> claseDatos;
    private Class<? extends TipoGenerico> clase;

    public Reporte() {
        libro = new XSSFWorkbook();
    }

    public void grabarReporte(File archivo) throws FileNotFoundException, IOException {
        try (FileOutputStream salida = new FileOutputStream(archivo)) {
            libro.write(salida);
        }

    }

    protected void redimencionar(Sheet pagina) {
        Field[] campos = claseDatos.getDeclaredFields();
        int numeroColumnas = 0;

        for (Field campo : campos) {
            ColumnaReporte columna = campo.getAnnotation(ColumnaReporte.class);
            if (columna != null) {
                numeroColumnas++;
            }
        }

        numeroColumnas++;

        for (int i = 0; i < numeroColumnas; i++) {
            pagina.autoSizeColumn(i);
        }

    }

    protected void agregarDatos(Row fila, TipoGenerico dato)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        dato.getClass();
        Field[] campos = clase.getDeclaredFields();
        int numCelda = 0;

        for (Field campo : campos) {
            ColumnaReporte columna = campo.getAnnotation(ColumnaReporte.class);
            Cell celda = fila.createCell(numCelda);

            if (columna != null) {
                this.agregarDato(celda, PropertyUtils
                        .getSimpleProperty((reporteProducto.autoreporte.vo.TipoGenerico) dato, campo.getName()));
                numCelda++;
            }
        }
    }

    protected void agregarDato(Cell celda, Object dato) {
        if (dato instanceof BigDecimal) {
            BigDecimal d = (BigDecimal) dato;
            celda.setCellValue(d.doubleValue());
        }

        if (dato instanceof Integer) {
            Integer i = (Integer) dato;
            celda.setCellValue(i);
        }

        if (dato instanceof String) {
            String i = (String) dato;
            celda.setCellValue(i);
        }

        if (dato instanceof Date) {
            CellStyle cellStyle = libro.createCellStyle();
            CreationHelper createHelper = libro.getCreationHelper();

            String i = (String) dato;
            celda.setCellValue(i);

        }
    }

    {
    }

    {
    }

    public void crearPaginaReporte(ArrayList<DatosReporteProductos> datos,
            Class<reporteProducto.autoreporte.vo.DatosReporteProductos> class1, String string) {
    }
}

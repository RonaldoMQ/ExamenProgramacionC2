package reporteProducto.autoreporte.vo;

import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class XSSFWorkbook {

    public void write(FileOutputStream salida) {
    }

    public Sheet createSheet(String nombrePagina) {
        return null;
    }

    public CellStyle createCellStyle() {
        return null;
    }

    public CreationHelper getCreationHelper() {
        return null;
    }

    public <o> void crearPaginaReporte(Reporte reporte, ArrayList<TipoGenerico> datos, Class tipoGenerico,
            String nombrePagina) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Sheet pagina = createSheet(nombrePagina);
        int numFila = 0;

        Row encabezado = pagina.createRow(numFila);
        encabezado.crearEncabezado(tipoGenerico);

        numFila = 1;
        for (TipoGenerico dato : datos) {
            Row filaDato = pagina.createRow(numFila);
            reporte.agregarDatos(filaDato, dato);
            numFila++;
        }

        reporte.redimencionar(pagina);
    }

}

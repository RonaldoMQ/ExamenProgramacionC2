package reporteProducto.autoreporte.vo;

import java.lang.reflect.Field;

public class Row {

    public Cell createCell(int numCelda) {
        return null;
    }

    protected void crearEncabezado(Class claseDatos) {
        Field[] campos = claseDatos.getDeclaredFields();
        int numCelda = 0;

        for (Field campo : campos) {
            ColumnaReporte columna = campo.getAnnotation(ColumnaReporte.class);
            if (columna != null) {
                Cell celda = createCell(numCelda);
                celda.setCellValue(columna.nombreColumna());
                numCelda++;
            }
        }
    }

}

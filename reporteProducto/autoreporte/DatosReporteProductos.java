package reporteProducto.autoreporte;

import java.math.BigDecimal;
import java.util.Date;

import reporteProducto.autoreporte.vo.ColumnaReporte;

public class DatosReporteProductos {
    @ColumnaReporte(nombreColumna = "Fecha del producto")
    private Date fecha;

    @ColumnaReporte(nombreColumna = "Nombre Producto")
    private String producto;

    @ColumnaReporte(nombreColumna = "Inventario a la fecha")
    private Integer inventario;

    @ColumnaReporte(nombreColumna = "Cambio estadistico (%)")
    private BigDecimal cambioEstadistico;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }

    public BigDecimal getCambioEstadistico() {
        return cambioEstadistico;
    }

    public void setCambioEstadistico(BigDecimal cambioEstadistico) {
        this.cambioEstadistico = cambioEstadistico;
    }
}

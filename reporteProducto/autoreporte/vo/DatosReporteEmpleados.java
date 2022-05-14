package reporteProducto.autoreporte.vo;

import java.util.Date;

public class DatosReporteEmpleados {
    @ColumnaReporte(nombreColumna = "Fecha del contrato")
    private Date fechaContrato;

    @ColumnaReporte(nombreColumna = "Nombre del Empleado")
    private String empleado;

    @ColumnaReporte(nombreColumna = "ID Empleado")
    private Integer id;

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
package crud.pregunta3;

public class Repaso {

    String mes = "";
    String[] meses = new String[12];

    public void nombre_mes() {

        mes = "abril";
        mes = "noviembre";
        System.out.println("nombre de mes: " + mes);
    }

    public static void main(String[] args) {
        Repaso r = new Repaso();
        r.nombre_mes();
        System.out.println("dd" + r.nombre_meses());
        for (String a : r.arreglo_meses())
            System.out.println("arreglo: " + a);

    }

    public String nombre_meses() {

        meses[0] = "Enero";
        meses[1] = "Febrero";
        meses[2] = "Marzo";
        meses[3] = "Abril";
        meses[4] = "Mayo";
        meses[5] = "Junio";
        meses[6] = "Julio";
        meses[7] = "Agosto";
        meses[8] = "Setiembre";
        meses[9] = "Octubre";
        meses[10] = "Noviembre";
        meses[11] = "Diciembre";
        return "";
    }

    public String[] arreglo_meses() {

        meses[0] = "Enero";
        meses[1] = "Febrero";
        meses[2] = "Marzo";
        meses[3] = "Abril";
        meses[4] = "Mayo";
        meses[5] = "Junio";
        meses[6] = "Julio";
        meses[7] = "Agosto";
        meses[8] = "Setiembre";
        meses[9] = "Octubre";
        meses[10] = "Noviembre";
        meses[11] = "Diciembre";

        return meses;
    }

}
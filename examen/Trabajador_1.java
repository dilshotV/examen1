/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author dilsh
 */
class Trabajador {
    
    private String nombre;
    private String cedula;
    private String codigo;
    private String sucursal;
    private boolean tieneVehiculo;

    private Factura factura1;
    private Factura factura2;
    private Factura factura3;
    private Factura factura4;
    private Factura factura5;

    private int contadorFacturas = 0;

    public Trabajador(String nombre, String cedula, String codigo, String sucursal, boolean tieneVehiculo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.tieneVehiculo = tieneVehiculo;
    }

    public void agregarFactura(Factura f) {
        contadorFacturas++;
        switch (contadorFacturas) {
            case 1: factura1 = f; break;
            case 2: factura2 = f; break;
            case 3: factura3 = f; break;
            case 4: factura4 = f; break;
            case 5: factura5 = f; break;
            default: System.out.println("Máximo de facturas alcanzado.");
        }
    }

    public double calcularTotalVentas() {
        double total = 0;
        if (factura1 != null) total += factura1.getMonto();
        if (factura2 != null) total += factura2.getMonto();
        if (factura3 != null) total += factura3.getMonto();
        if (factura4 != null) total += factura4.getMonto();
        if (factura5 != null) total += factura5.getMonto();
        return total;
    }

    public double calcularTotalComisiones() {
        double total = 0;
        if (factura1 != null) total += factura1.calcularComision();
        if (factura2 != null) total += factura2.calcularComision();
        if (factura3 != null) total += factura3.calcularComision();
        if (factura4 != null) total += factura4.calcularComision();
        if (factura5 != null) total += factura5.calcularComision();

        if (contadorFacturas > 3 || calcularTotalVentas() > 300000) total += 20000;
        return total;
    }

    public int calcularTotalPuntos() {
        int total = 0;
        if (factura1 != null) total += factura1.calcularPuntos();
        if (factura2 != null) total += factura2.calcularPuntos();
        if (factura3 != null) total += factura3.calcularPuntos();
        if (factura4 != null) total += factura4.calcularPuntos();
        if (factura5 != null) total += factura5.calcularPuntos();
        return total;
    }

    public String resumen() {
        String mesNombre = convertirMes(factura1 != null ? factura1.getMes() : 1);
        return "Agente Trabajador: " + nombre + " Código: " + codigo + "\n" +
               "Sucursal: " + sucursal + "\n" +
               "Vehículo propio: " + (tieneVehiculo ? "Sí" : "No") + "\n" +
               "Mes: " + mesNombre + "\n" +
               "Total vendido: " + calcularTotalVentas() + "\n" +
               "Comisiones: " + calcularTotalComisiones() + "\n" +
               "Puntos obtenidos: " + calcularTotalPuntos() + "\n" +
               "BONO EXTRA: " + ((contadorFacturas > 3 || calcularTotalVentas() > 300000) ? "Sí" : "No");
    }

    private String convertirMes(int mes) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return (mes >= 1 && mes <= 12) ? meses[mes - 1] : "Mes inválido";
    }
}
    


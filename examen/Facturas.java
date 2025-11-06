/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author dilsh
 */
public class Facturas {
    
    public class Factura {
    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private int productosElectricos;
    private int productosAutomotrices;
    private int productosConstruccion;
    private double monto;
    private int mes;

    public Factura(String nombreCliente, String cedulaCliente, String codigoFactura,int productosElectricos, int productosAutomotrices, int productosConstruccion,
                   double monto, int mes) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.productosElectricos = productosElectricos;
        this.productosAutomotrices = productosAutomotrices;
        this.productosConstruccion = productosConstruccion;
        this.monto = monto;
        this.mes = mes;
    }

    public double getMonto() { return monto; }
    public int getMes() { return mes; }
    public int getElectricos() { return productosElectricos; }
    public int getAutomotrices() { return productosAutomotrices; }
    public int getConstruccion() { return productosConstruccion; }

    public double calcularComision() {
        double comision = 0;
        boolean todos = productosElectricos > 0 && productosAutomotrices > 0 && productosConstruccion > 0;

        if (todos) {
            comision += monto * 0.10;
        } else {
            comision += (productosElectricos >= 3 ? monto * 0.04 : monto * 0.02);
            comision += (productosAutomotrices > 4 ? monto * 0.04 : monto * 0.02);
            if (productosConstruccion > 0) comision += monto * 0.08;
        }

        if (monto > 50000) comision += monto * 0.05;

        return comision;
    }

    public int calcularPuntos() {
        int puntos = 0;
        boolean todos = productosElectricos > 0 && productosAutomotrices > 0 && productosConstruccion > 0;

        if (todos) puntos += 3;
        if (productosElectricos > 0) puntos += 1;
        if (productosAutomotrices > 0) puntos += 1;
        if (productosConstruccion > 0) puntos += 2;
        if (monto > 50000) puntos += 1;

        return puntos;
    }
}
    }



    
 


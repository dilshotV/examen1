/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;
import examen.Facturas.Factura;
import javax.swing.JOptionPane;
/**
 *
 * @author dilsh
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        String nombre = JOptionPane.showInputDialog("Nombre del vendedor:");
        String cedula = JOptionPane.showInputDialog("Cédula del vendedor:");
        String codigo = JOptionPane.showInputDialog("Código del vendedor:");
        String sucursal = JOptionPane.showInputDialog("Sucursal:");
        int tieneVehiculo = JOptionPane.showConfirmDialog(null, "¿Tiene vehículo propio?", "Vehículo", JOptionPane.YES_NO_OPTION);

        Vendedor vendedor = new Vendedor(nombre, cedula, codigo, sucursal, tieneVehiculo == JOptionPane.YES_OPTION);

        while (true) {
            String nombreCliente = JOptionPane.showInputDialog("Nombre del cliente:");
            String cedulaCliente = JOptionPane.showInputDialog("Cédula del cliente:");
            String codFactura = JOptionPane.showInputDialog("Código de factura:");
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Monto de la factura:"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes (1-12):"));
            int electrico = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos eléctricos:"));
            int auto = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos automotrices:"));
            int construccion = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos construcción:"));

            Factura f = new Factura(nombreCliente, cedulaCliente, codFactura, electrico, auto, construccion, monto, mes);
                    vendedor.agregarFactura(f);

            int continuar = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra factura?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (continuar != JOptionPane.YES_OPTION) break;
        }

        JOptionPane.showMessageDialog(null, vendedor.resumen());
    }
}
       
  
  
      
        
   
       

     
        

        
        
        
    

    
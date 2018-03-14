/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

/**
 *
 * @author 00140291
 */
public class ClientePrimium extends Cliente{
    private String nombre;
    private String direccion;
    private double antiguedad;
    private double descuento1;
    private double tasa1;
    

    @Override
    public void Descuento(double montoCompra, double tasa, char tipo) {
        
        System.out.println("introduce si es cliente especial");
        
        tasa1=tasa/100;
        descuento1= tasa/montoCompra-1000;
        
        
        
      }

    public ClientePrimium(String nombre, String direccion, double antiguedad, double descuento1, double tasa1) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.antiguedad = antiguedad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getAntiguedad() {
        return antiguedad;
    }
    
    
    
}

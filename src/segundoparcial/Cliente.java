/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;
 

public abstract class Cliente {
    
    private double montoCompra;
    private double tasa;
    private char tipo;
    private double tasabase;
      
    abstract public void Descuento(double montoCompra, double tasa, char tipo);
                
}
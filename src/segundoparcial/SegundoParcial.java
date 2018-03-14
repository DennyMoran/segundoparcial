
package segundoparcial;

import java.util.Scanner;


public class SegundoParcial {

   
    public static void main(String[] args) {
       
        
       String nombre;
       String Direccion;
       String antiguedad;
       double montoCompra;
       double tasa;
       
       Scanner entradas=new Scanner(System.in);
        System.out.println("diga su Nombre"); nombre=entrada.next();
        System.out.println("diga su direccion"); direccion=entrada.next();
        System.out.println("diga su antiguadad"); antiguedad=entrada.next();
        System.out.println("diga su monto de compra"); montoCompra=entrada.next();
        System.out.println("diga la tasa"); tasa=entrada.next();
        
        ClientePrimium calculo=new ClientePrimium(nombre,Direccion);
        calculo.Descuento(montoCompra, tasa, 0);
    }
}
       
       
     
        
    

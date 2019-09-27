
package p01mod3ventas;

import java.util.ArrayList;
import modelo.ColeccionVentas;
import modelo.Venta;


public class P01Mod3Ventas {

    
    public static void main(String[] args) {
        
        ColeccionVentas lista = new ColeccionVentas();
        Venta venta;
        String codigo;
        
        //Agregar
        venta = new Venta("Ve001", 2000, 1);
        lista.Agregar(venta);
        venta = new Venta("Ve002", 3000, 2);
        lista.Agregar(venta);
        venta = new Venta("Ve003", 3500, 3);
        lista.Agregar(venta);
        ListarVenta(lista.Listar());
        
        //Modificar
        venta = new Venta("Ve001", 3500, 1);
        lista.Modificar(venta);
        ListarVenta(lista.Listar());
        
        //Eliminar
        codigo= "Ve002";   
        lista.Eliminar(codigo);           
        ListarVenta(lista.Listar());
        
    }
    
    public static void ListarVenta(ArrayList<Venta> lista){
            for(Venta obj:lista)
            {
                System.out.println("Codigo : "+obj.getCodigo());
                System.out.println("Precio : "+obj.getPrecio());
                System.out.println("Cantidad : "+obj.getCantidad());
            }
        }
    
}

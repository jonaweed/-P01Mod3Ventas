
package modelo;

import junit.framework.Assert;
import org.junit.Test;


public class TestEliminar {

    public TestEliminar() {
    }
    
    @Test
    public void testEliminar() {

        System.out.println("Eliminar");
        String codigo="Ve002";
        Venta venta = new Venta("Ve002", 3000, 2);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado = true;
        boolean obtenido = instance.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);
    }
}

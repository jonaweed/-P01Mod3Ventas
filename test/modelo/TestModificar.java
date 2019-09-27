
package modelo;

import junit.framework.Assert;
import org.junit.Test;


public class TestModificar {

    public TestModificar() {
    }
    
    @Test
    public void testModificar(){
        
        
        System.out.println("Modificar");
        Venta venta = new Venta("Ve001", 2000, 1);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado = true;
        venta = new Venta("Ve001", 3500, 1);
        boolean obtenido = instance.Modificar(venta);
        Assert.assertEquals(esperado, obtenido);
    }
}

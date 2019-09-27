
package modelo;

import junit.framework.Assert;
import org.junit.Test;


public class TestAgregar {

    public TestAgregar() {
    }
    
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Venta venta = new Venta("Ve001", 2000, 1);
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado = true;
        boolean obtenido = instance.Agregar(venta);
        Assert.assertEquals(esperado, obtenido);
    }
}

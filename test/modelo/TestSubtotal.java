
package modelo;
import junit.framework.Assert;
import org.junit.Test;


public class TestSubtotal {

    public TestSubtotal() {
    }
    
    @Test
    public void TestSubtotal(){
        System.out.println("SUBTOTAL");
        String codigo = "Ve001";
        Venta venta= new Venta("Ve001", 2000, 2);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        int esperado = 4000;
        int obtenido = instance.subTotal(codigo);
        Assert.assertEquals(esperado, obtenido);
    }
    
}

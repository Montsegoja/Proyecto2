
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FacturaTest {
    
    public FacturaTest() {
    }
       
    @Test
    public void testFatura() {
        System.out.println("getTotalFatura");
        Factura instance = new Factura("1","A",2,-2.0);
        double expResult = 0.0;
        System.out.println("Precio: "+ instance.getPrecio());
        System.out.println("Cantidad: "+ instance.getCantidad());
        double result = instance.getTotalFatura();
        System.out.println("Monto: "+ result);
        assertEquals(expResult,result,0);
        
    }
    
}

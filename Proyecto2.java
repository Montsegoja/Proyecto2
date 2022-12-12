
import java.util.Scanner;

public class Proyecto2 {

    public static void main(String[] args) {
      
Factura c=new Factura();
        Scanner sc = new Scanner(System.in);
        int res = 0;

        do {
            System.out.println("1) Comprar");
            System.out.println("2) Salir");
            System.out.print("Selecciona una opción: ");
            res = sc.nextInt();
            switch(res) {
                case 1: {
                    System.out.print("Descripcion: ");
                    c.setDescripcion(sc.next());
                    System.out.print("Cantidad ");
                    c.setCantidad(sc.nextInt());
                    System.out.print("Precio ");
                    c.setPrecio(sc.nextDouble());
                    System.out.println("Monto: "+c.getTotalFatura());
                    break;
                }                
                case 2: {
                    System.out.println("FIN ");
                    break;
                }
                default:
                    System.out.println("continuar");
            }
        } while ( res != 2);
    }
             
    
}

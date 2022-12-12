public class Factura {
    String numero, descripcion;
    int cantidad;
    Double precio;

    public Factura(String numero, String descripcion, int cantidad, Double precio) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        
    }

    public Factura() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

  
    public double getTotalFatura(){

         if(getPrecio()<0){
            precio=0.0;
            System.out.println("Precio invalido");
            
        }             
         return cantidad*getPrecio();         
}
    

}
     

  


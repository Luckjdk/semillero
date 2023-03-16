public class Factura extends Precio {
    public String emisor;
    public String cliente;
    public Factura(int valor, String emisor, String cliente) {
        super(valor);
        this.emisor = emisor;
        this.cliente = cliente;

    }
    public void imprimirFactura(){
        System.out.println("Su factura emitida por " + emisor+ " para "+ cliente);

        System.out.println("tiene un valor de :"+ valor);
    }
}

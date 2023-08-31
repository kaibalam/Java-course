import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        OrdenCompra ordenUno = new OrdenCompra();
        Cliente clienteUno = new Cliente("Ricardo","Valenzuela");
        ordenUno.setFecha(new Date());
        ordenUno.setClientes(clienteUno);
        ordenUno.addProducto(new Producto("Nido","Leche",30))
                .addProducto(new Producto("Nestlé","ConrFlakes",40))
                .addProducto(new Producto("Naturas","Salsa Ranchera", 3))
                .addProducto(new Producto("Palmolive", "Shampoo", 40));


        System.out.println("Descripción orden uno = " + ordenUno.getDescription());
        
        OrdenCompra ordenDos = new OrdenCompra();
        Cliente clienteDos = new Cliente("Cesia", "Ramírez");
        ordenDos.setFecha(new Date());
        ordenDos.setClientes(clienteDos);
        ordenDos.addProducto(new Producto("Quaker","Avena Molida",14))
            .addProducto(new Producto("Mattel","Boligrafo",34))
            .addProducto(new Producto("HP","mouse",45))
            .addProducto(new Producto("Splenda","Azucar",45));

        System.out.println("Descripción order dos = " + ordenDos.getDescription());

        OrdenCompra ordenTres = new OrdenCompra();
        Cliente clienteTres = new Cliente("Daniela","Valenzuela");
        ordenTres.setFecha(new Date());
        ordenTres.setClientes(clienteTres);
        ordenTres.addProducto(new Producto("Kellogs","Choco Krispis",5))
                .addProducto(new Producto("Molinero","Arroz",4))
                .addProducto(new Producto("Albay", "Frijol",5))
                .addProducto(new Producto("superior","Algodón",23));

        OrdenCompra[] ordenes = {ordenUno, ordenDos, ordenTres};

        for (OrdenCompra orden: ordenes) {
            System.out.println("Factura: " + orden.getIdentificador());
            System.out.println("Cliente: " + orden.getClientes());
            System.out.println("Descripcion: " + orden.getDescription());
            System.out.println("fecha = " + orden.getFecha());
            System.out.println("Gran Total = " +  orden.getGranTotal());

            int i =1;
            for (Producto p: orden.getProductos()) {
                System.out.println(" Producto " + i + ": "+ p.getNombre() +" "+p.getFabricante()+" precio Q."+p.getPrecio() );
                i++;
            }
            System.out.println("----------------------------Siguiente----------------------------");

        }

        System.out.println("Descripción orden tres = " + ordenTres.getDescription());

    }
}


import java.text.SimpleDateFormat;
import java.util.Date;

public class OrdenCompra {
    private int identificador;
    private String description;
    private Date fecha;
    private Cliente clientes;
    private int indexProd = 0;

    private static int ultimoId;

    private Producto[] productos = new Producto[4];

    public OrdenCompra() {
        this.description = "";
        this.identificador = ++ultimoId;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        String fechaStr = sd.format(this.fecha);
        double total = 0;
        sb.append("\nCliente: " + this.clientes.getNombre() + " " + this.clientes.getApellido()).append(" id: ").append(this.identificador)
                .append("\nFecha emisión:").append(fechaStr);
        sb.append("\ndetalle: ");
        sb.append("\n======================");
        if (getProductos() != null) {
            sb.append("\nProductos de la orden:");
            sb.append("\n======================");
            for (Producto p : this.getProductos()) {
                sb.append("\n").append(p.getNombre()).append(", ").append(p.getFabricante()).append(", ").append(p.getPrecio());
                total = sumaTotalProductos(p.getPrecio());
            }
            sb.append("\n======================");
            sb.append("\nTotal:" + total + "\n\n");
        }
        return sb.toString();
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public OrdenCompra addProducto(Producto producto) {
        if (indexProd < this.productos.length) {
            this.productos[indexProd++] = producto;
        }
        return this;
    }

    public int sumaTotalProductos(int precio) {
        int total = 0;
        if (precio >= 0) {
            for (Producto p : getProductos()) {
                total += p.getPrecio();
            }
        }
        return total;
    }

    public int getGranTotal() {
        int total = 0;

        for (Producto p : getProductos()) {
            total += p.getPrecio();
        }

        return total;
    }

}

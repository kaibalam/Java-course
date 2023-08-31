package org.rvalenzuela.appfacturas;

import org.rvalenzuela.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNif("555-55");
        cliente1.setNombre("Ricardo");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la descripciónd e la factura: ");
        String desc = sc.nextLine();
        Factura factura1 = new Factura(desc, cliente1);

        Producto producto;
       /* String nombre;
        float precio;
        int cantidad;*/

        System.out.println();
        for(int i=0; i < 2; i++){
            producto = new Producto();
            System.out.print("ingrese producto No." + producto.getCodigo() + " : ");
            producto.setNombre(sc.nextLine());

            System.out.print("ingrese el precio: ");
            producto.setPrecio(sc.nextFloat());

            System.out.print("ingrese la cantidad: ");
            factura1.addItemFactura(new ItemFactura(sc.nextInt(),producto));

            System.out.println();
            sc.nextLine();
        }
        System.out.println(factura1);




    }
}

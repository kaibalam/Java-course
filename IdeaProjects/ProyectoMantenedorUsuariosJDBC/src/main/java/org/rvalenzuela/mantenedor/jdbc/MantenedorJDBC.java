package org.rvalenzuela.mantenedor.jdbc;


import org.rvalenzuela.mantenedor.jdbc.modelo.Usuarios;
import org.rvalenzuela.mantenedor.jdbc.repositoiro.Repositorio;
import org.rvalenzuela.mantenedor.jdbc.repositoiro.UsuarioRepositorio;
import org.rvalenzuela.mantenedor.jdbc.util.ConexionBaseDatos;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MantenedorJDBC {
    public static void main(String[] args) {
        int opcionIndice = 0;

        Map<String, Integer> operaciones = new HashMap();
        operaciones.put("Actualizar",1);
        operaciones.put("Eliminar",2);
        operaciones.put("Agregar", 3);
        operaciones.put("listar",4);
        operaciones.put("salir",5);

        Object[] opArreglo =    operaciones.keySet().toArray();

            try (Connection conn = ConexionBaseDatos.getInstance()){
                Repositorio<Usuarios> repositorio = new UsuarioRepositorio();

            do {

                Object option = JOptionPane.showInputDialog(null,
                        "Seleccionar una operación",
                        "Mantenedor de usuarios",
                        JOptionPane.INFORMATION_MESSAGE, null, opArreglo,
                        opArreglo[0]);

                if (option == null){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar una opción!");
                } else {
                    opcionIndice = operaciones.get(option.toString());
                }
                Scanner sc = new Scanner(System.in);
                long numeroActualizar = 0;
                String nombreus = "";
                String pass = "";
                String email = "";

                    switch (opcionIndice){
                        case 1:
                            System.out.println("Ingrese un numero para actualizar");
                            numeroActualizar = sc.nextLong();
                            //System.out.println("numeroActualizar = " + numeroActualizar);
                            System.out.println("================= Actualizar =================");
                            System.out.println("ingrese nombre a editar");
                            nombreus = sc.next();
                            System.out.println("ingrese pass a editar");
                            pass = sc.next();
                            System.out.println("ingrese email a editar");
                            email = sc.next();
                            Usuarios user = new Usuarios();
                            user.setId(numeroActualizar);
                            user.setUsername(nombreus);
                            user.setPassword(pass);
                            user.setEmail(email);
                            repositorio.guardar(user);
                            JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                            break;
                        case 2:
                            System.out.println("ingrese un número para eliminar");
                            numeroActualizar = sc.nextLong();
                            System.out.println("================= Eliminar =================");
                            repositorio.eliminar(numeroActualizar);
                            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente!");
                            break;
                        case 3:
                            System.out.println("ingrese nombre");
                            nombreus = sc.next();
                            System.out.println("ingrese password");
                            pass = sc.next();
                            System.out.println("ingrese email");
                            email = sc.next();
                            System.out.println("================= Agregar =================");
                            user = new Usuarios();
                            user.setUsername(nombreus);
                            user.setPassword(pass);
                            user.setEmail(email);
                            repositorio.guardar(user);
                            JOptionPane.showMessageDialog(null, "Usuario agregado satisfactoriamente!");
                            break;
                        case 4:
                            System.out.println("================= Listar =================");
                            repositorio.Listar().forEach(System.out::println);
                            JOptionPane.showMessageDialog(null, "Usuarios listados satisfactoriamente!");
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Has salido con exito!");
                            break;
                    }

            } while (opcionIndice != 5);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import SoftwareClass.Customers;
import java.util.Scanner;

/**
 *
 * @author estefania.garces
 */
public class CustomersMenu {
    Scanner input = new Scanner(System.in);
    Customers customer = new Customers();
    int eleccion;

    public void menu(){
        while (true) {

            System.out.println(" •----------------------------------------------•");
            System.out.println("|                 M  E  N  Ú                    |");
            System.out.println(" •----------------------------------------------•");
            System.out.println(" [1] Crear cliente");
            System.out.println(" [2] Listar un cliente");
            System.out.println(" [3] Listar todos los clientes");
            System.out.println(" [4] Editar cliente");
            System.out.println(" [5] Eliminar cliente");
            System.out.println(" [0] Salir");
            System.out.print("Ingrese la acción a realizar: ");
            eleccion = input.nextInt();
            System.out.println("");

            switch (eleccion) {
                case 1:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|                CREANDO CLIENTE                |");
                    System.out.println(" •----------------------------------------------•");
                    
                    customer.createCustomers();
                    break;
                case 2:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|               LISTANDO CLIENTE                |");
                    System.out.println(" •----------------------------------------------•");
                    
                    customer.readCustomers();
                    break;
                case 3:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|               LISTANDO CLIENTES               |");
                    System.out.println(" •----------------------------------------------•");
                    
                    customer.readAllCustomers();
                    break;
                case 4:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|               EDITANDO CLIENTE                |");
                    System.out.println(" •----------------------------------------------•");
                    
                    customer.updateCustomers();
                    break;
                case 5:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|              ELIMINANDO CLIENTE               |");
                    System.out.println(" •----------------------------------------------•");
                    
                    customer.deleteCustomers();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}

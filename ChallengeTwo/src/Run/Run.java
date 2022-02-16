/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import java.util.Scanner;

/**
 *
 * @author estefania.garces
 */
public class Run {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CategoryMenu category = new CategoryMenu();
        CompanyMenu company = new CompanyMenu();
        EmployeesMenu employee = new EmployeesMenu();
        WorkstationMenu workstation = new WorkstationMenu();
        CustomersMenu customer = new CustomersMenu();
        int eleccion;

        while (true) {

            System.out.println(" •----------------------------------------------•");
            System.out.println("|                 M  E  N  Ú                    |");
            System.out.println(" •----------------------------------------------•");
            System.out.println(" [1] Compañías");
            System.out.println(" [2] Empleados");
            System.out.println(" [3] Clientes");
            System.out.println(" [4] Cargos");
            System.out.println(" [5] Categorías");
            System.out.println(" [0] Salir");
            System.out.print("¿Qué deseas modificar?: ");
            eleccion = input.nextInt();
            System.out.println("");

            switch (eleccion) {
                case 1:
                    company.menu();
                    break;
                case 2:
                    employee.menu();
                    break;
                case 3:
                    customer.menu();
                    break;
                case 4:
                    workstation.menu();
                    break;
                case 5:
                    category.menu();
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

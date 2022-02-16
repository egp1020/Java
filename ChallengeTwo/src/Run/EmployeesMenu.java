/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import SoftwareClass.Employees;
import java.util.Scanner;

/**
 *
 * @author estefania.garces
 */
public class EmployeesMenu {
    Scanner input = new Scanner(System.in);
    Employees employee = new Employees();
    int eleccion;

    public void menu(){
        while (true) {

            System.out.println(" •----------------------------------------------•");
            System.out.println("|                 M  E  N  Ú                    |");
            System.out.println(" •----------------------------------------------•");
            System.out.println(" [1] Crear empleado");
            System.out.println(" [2] Listar un empleado");
            System.out.println(" [3] Listar todos los empleados");
            System.out.println(" [4] Editar empleado");
            System.out.println(" [5] Eliminar empleado");
            System.out.println(" [0] Salir");
            System.out.print("Ingrese la acción a realizar: ");
            eleccion = input.nextInt();
            System.out.println("");

            switch (eleccion) {
                case 1:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|                CREANDO EMPLEADO               |");
                    System.out.println(" •----------------------------------------------•");
                    
                    employee.createEmployee();
                    break;
                case 2:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|               LISTANDO EMPLEADO               |");
                    System.out.println(" •----------------------------------------------•");
                    
                    employee.readEmployees();
                    break;
                case 3:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|              LISTANDO EMPLEADOS               |");
                    System.out.println(" •----------------------------------------------•");
                    
                    employee.readAllEmployees();
                    break;
                case 4:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|               EDITANDO EMPLEADO               |");
                    System.out.println(" •----------------------------------------------•");
                    
                    employee.updateEmployees();
                    break;
                case 5:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|              ELIMINANDO EMPLEADO              |");
                    System.out.println(" •----------------------------------------------•");
                    
                    employee.deleteEmployees();
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

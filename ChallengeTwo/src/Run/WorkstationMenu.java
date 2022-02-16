/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import SoftwareClass.Workstation;
import java.util.Scanner;

/**
 *
 * @author estefania.garces
 */
public class WorkstationMenu {
    Scanner input = new Scanner(System.in);
    Workstation workstation = new Workstation();
    int eleccion;

    public void menu(){
        while (true) {

            System.out.println(" •----------------------------------------------•");
            System.out.println("|                 M  E  N  Ú                    |");
            System.out.println(" •----------------------------------------------•");
            System.out.println(" [1] Crear cargo");
            System.out.println(" [2] Listar un cargo");
            System.out.println(" [3] Listar todos los cargos");
            System.out.println(" [4] Editar cargo");
            System.out.println(" [5] Eliminar cargo");
            System.out.println(" [0] Salir");
            System.out.print("Ingrese la acción a realizar: ");
            eleccion = input.nextInt();
            System.out.println("");

            switch (eleccion) {
                case 1:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|                 CREANDO CARGO                 |");
                    System.out.println(" •----------------------------------------------•");
                    
                    workstation.createWorkstation();
                    break;
                case 2:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|                LISTANDO CARGO                 |");
                    System.out.println(" •----------------------------------------------•");
                    
                    workstation.readWorkstation();
                    break;
                case 3:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|                 LISTANDO CARGOS               |");
                    System.out.println(" •----------------------------------------------•");
                    
                    workstation.readAllWorkstation();
                    break;
                case 4:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|                EDITANDO CARGO                 |");
                    System.out.println(" •----------------------------------------------•");
                    
                    workstation.updateWorkstation();
                    break;
                case 5:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|               ELIMINANDO CARGO                |");
                    System.out.println(" •----------------------------------------------•");
                    
                    workstation.deleteWorkstation();
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

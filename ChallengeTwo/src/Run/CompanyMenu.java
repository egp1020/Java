
package Run;

import SoftwareClass.Company;
import java.util.Scanner;

/**
 *
 * @author estefania.garces
 */
public class CompanyMenu {
    Scanner input = new Scanner(System.in);
    Company company = new Company();
    int eleccion;

    public void menu(){
        while (true) {

            System.out.println(" •----------------------------------------------•");
            System.out.println("|                 M  E  N  Ú                    |");
            System.out.println(" •----------------------------------------------•");
            System.out.println(" [1] Crear compañia");
            System.out.println(" [2] Listar una compañia");
            System.out.println(" [3] Listar todas las compañías");
            System.out.println(" [4] Editar compañía");
            System.out.println(" [5] Eliminar compañía");
            System.out.println(" [0] Salir");
            System.out.print("Ingrese la acción a realizar: ");
            eleccion = input.nextInt();
            System.out.println("");

            switch (eleccion) {
                case 1:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|               CREANDO COMPAÑÍA                |");
                    System.out.println(" •----------------------------------------------•");
                    
                    company.createCompany();
                    break;
                case 2:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|              LISTANDO COMPAÑÍA                |");
                    System.out.println(" •----------------------------------------------•");
                    
                    company.readCompany();
                    break;
                case 3:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|              LISTANDO COMPAÑÍAS               |");
                    System.out.println(" •----------------------------------------------•");
                    
                    company.readAllCompany();
                    break;
                case 4:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|              EDITANDO COMPAÑÍA                |");
                    System.out.println(" •----------------------------------------------•");
                    
                    company.updateCompany();
                    break;
                case 5:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|             ELIMINANDO COMPAÑÍA               |");
                    System.out.println(" •----------------------------------------------•");
                    
                    company.deleteCompany();
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

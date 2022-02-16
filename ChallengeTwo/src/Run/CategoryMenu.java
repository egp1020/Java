/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import SoftwareClass.Category;
import java.util.Scanner;

/**
 *
 * @author estefania.garces
 */
public class CategoryMenu {
    Scanner input = new Scanner(System.in);
    Category category = new Category();
    int eleccion;

    public void menu(){
        while (true) {

            System.out.println(" •----------------------------------------------•");
            System.out.println("|                 M  E  N  Ú                    |");
            System.out.println(" •----------------------------------------------•");
            System.out.println(" [1] Crear categoría");
            System.out.println(" [2] Listar una categoría");
            System.out.println(" [3] Listar todas las categorías");
            System.out.println(" [4] Editar categoría");
            System.out.println(" [5] Eliminar categoría");
            System.out.println(" [0] Salir");
            System.out.print("Ingrese la acción a realizar: ");
            eleccion = input.nextInt();
            System.out.println("");

            switch (eleccion) {
                case 1:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|               CREANDO CATEGORÍA               |");
                    System.out.println(" •----------------------------------------------•");
                    
                    category.createCategory();
                    break;
                case 2:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|              LISTANDO CATEGORÍA               |");
                    System.out.println(" •----------------------------------------------•");
                    
                    category.readCategory();
                    break;
                case 3:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|              LISTANDO CATEGORÍAS              |");
                    System.out.println(" •----------------------------------------------•");
                    
                    category.readAllCategory();
                    break;
                case 4:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|              EDITANDO CATEGORÍA               |");
                    System.out.println(" •----------------------------------------------•");
                    
                    category.updateCategory();
                    break;
                case 5:
                    System.out.println(" •----------------------------------------------•");
                    System.out.println("|             ELIMINANDO CATEGORÍA              |");
                    System.out.println(" •----------------------------------------------•");
                    
                    category.deleteCategory();
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

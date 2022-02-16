
package SoftwareClass;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author raad_
 */
public class Category {
    private String name;
    private ArrayList<Category> listCategory;
    Scanner input = new Scanner(System.in);

    public Category() {
    }

    public Category(String name) {
        this.name = name;
        this.listCategory =  new ArrayList<>();
    }
    
    public void createCategory(){
        String option = "si";
        while ("si".equals(option)){
            System.out.print(" Ingrese el nombre de la categoría a crear: ");
            String nombre = input.nextLine();
            
            Category category = new Category(nombre);
            this.listCategory.add(category);
            setListCategory(getListCategory());
            
            System.out.print(" ¿Desea crear otra categoría? [si/no]: ");
            option = input.nextLine();
            System.out.println("");
        }
        
    }
    
    public void readCategory(){
        System.out.print(" Ingrese el nombre de la categoría que desea listar: ");
        String nombre = input.nextLine();
        
        getListCategory().forEach(objeto -> {
            if(objeto.name.equals(nombre)){
                System.out.println(" Los datos de la categoría son: "+objeto.getName());
            }else{
                System.out.println(" La categoría ingresada no se encuentra.");
            }
            
        });
    }
    
    public void readAllCategory(){
        getListCategory().forEach(objeto -> {
            System.out.println(objeto.getName());
        });
    }
    
    public void updateCategory(){
        String option = "si";
        while ("si".equals(option)){
            System.out.println("");
            System.out.print(" Ingrese el nombre de la categoría a modificar: ");
            String nameCategory = input.nextLine();
            System.out.println("");
            
            for (Category objeto : getListCategory()){
                if(objeto.name.equals(nameCategory)){
                    System.out.print(" Ingrese el nuevo nombre de la categoría: ");
                    String nombre = input.nextLine();
                    System.out.println("");
                    objeto.setName(nombre);
                }else {
                    System.out.println(" La categoría ingresada no se encuentra.");
                }
            }
            
            System.out.print(" ¿Desea actualizar otra categoría? [si/no]: ");
            option = input.nextLine();
            System.out.println("");
        }
    }
    public void deleteCategory(){
        String option = "si";
        while ("si".equals(option)){
            System.out.print(" Ingrese el nombre de la categoría a eliminar: ");
            String nombre = input.nextLine();
            System.out.println("");
            
            for (int j = 0; j < getListCategory().size(); j++) {
                Category objecto = getListCategory().get(j);
                
                if (objecto.getName().equals(nombre)){
                    this.listCategory.remove(objecto);
                }else {
                    System.out.println(" La categoría ingresada no se encuentra.");
                }
            }
            setListCategory(getListCategory());
            System.out.print(" ¿Desea eliminar otra categoría? [si/no]: ");
            option = input.nextLine();
            System.out.println("");
        }
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the listCategory
     */
    public ArrayList<Category> getListCategory() {
        return listCategory;
    }

    /**
     * @param listCategory the listCategory to set
     */
    public void setListCategory(ArrayList<Category> listCategory) {
        this.listCategory = listCategory;
    }
}

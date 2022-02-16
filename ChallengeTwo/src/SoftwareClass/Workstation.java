/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareClass;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author raad_
 */
public class Workstation {
    private String name;
    private String hierarchyLevel;
    private ArrayList<Workstation> listWorkstation;
    Scanner input = new Scanner(System.in);

    public Workstation() {
    }

    public Workstation(String name, String hierarchyLevel) {
        this.name = name;
        this.hierarchyLevel = hierarchyLevel;
        this.listWorkstation = new ArrayList<>();
    }
    
    public void createWorkstation(){
        String option = "si";
        while ("si".equals(option)){
            System.out.print(" Ingrese nombre: ");
            String nombre = input.nextLine();
            System.out.print(" Ingrese nivel jerárquico: ");
            String nivel = input.nextLine();
            
            Workstation workstation = new Workstation(nombre, nivel);
            this.listWorkstation.add(workstation);
            setListWorkstation(getListWorkstation());
            
            System.out.print(" ¿Desea crear otro cargo? [si/no]: ");
            option = input.nextLine();
            System.out.println("");
        }
        
    }
    
    public void readWorkstation(){
        System.out.print(" Ingrese el nombre del cargo: ");
        String nombre = input.nextLine();
        
        getListWorkstation().forEach(objeto -> {
            if(objeto.getName().equals(nombre)){
                System.out.println(" Los datos de la persona son: ");
                System.out.println(" Nombre: "+objeto.getName());
                System.out.println(" Nivel de jerárqico: "+objeto.getHierarchyLevel());
            }else{
                System.out.println(" La cargo ingresado no se encuentra.");
            }
        });
    }
    
    public void readAllWorkstation(){
        getListWorkstation().forEach(objeto -> {
            System.out.println(" Nombre: "+objeto.getName()+" Nivel de jerárqico: "+objeto.getHierarchyLevel());
        });
    }
    
    public void updateWorkstation(){
        String option = "si";
        while ("si".equals(option)){
            System.out.println("");
            System.out.print(" Ingrese el nombre: ");
            String nombre = input.nextLine();
            System.out.println("");
            
            for (Workstation objeto : getListWorkstation()){
                if(objeto.getName().equals(nombre)){
                    System.out.print(" Ingrese nuevo nombre: ");
                    nombre = input.nextLine();
                    System.out.print(" Ingrese nuevo nivel jerárquico: ");
                    String nivel = input.nextLine();

                    System.out.println("");
                    objeto.setName(nombre);
                    objeto.setHierarchyLevel(nivel);
                }else {
                    System.out.println(" La nombre ingresado no se encuentra.");
                }
            }
            
            System.out.print(" ¿Desea actualizar otro cargo? [si/no]: ");
            option = input.nextLine();
            System.out.println("");
        }
    }
    public void deleteWorkstation(){
        String option = "si";
        while ("si".equals(option)){
            System.out.print(" Ingrese el nombre del cargo: ");
            String nombre= input.nextLine();
            System.out.println("");
            
            for (int j = 0; j < getListWorkstation().size(); j++) {
                Workstation objecto = getListWorkstation().get(j);
                
                if (objecto.getName().contains(nombre)){
                    this.listWorkstation.remove(objecto);
                }else {
                    System.out.println(" El cargo ingresado no se encuentra.");
                }
            }
            setListWorkstation(getListWorkstation());
            System.out.print(" ¿Desea eliminar otro cargo? [si/no]: ");
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
     * @return the hierarchyLevel
     */
    public String getHierarchyLevel() {
        return hierarchyLevel;
    }

    /**
     * @param hierarchyLevel the hierarchyLevel to set
     */
    public void setHierarchyLevel(String hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
    }

    /**
     * @return the listWorkstation
     */
    public ArrayList<Workstation> getListWorkstation() {
        return listWorkstation;
    }

    /**
     * @param listWorkstation the listWorkstation to set
     */
    public void setListWorkstation(ArrayList<Workstation> listWorkstation) {
        this.listWorkstation = listWorkstation;
    }
}

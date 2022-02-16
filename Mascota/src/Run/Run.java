/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;
import Relaciones.*;
import java.util.ArrayList;
/**
 *nombreLista = [1,2,3]
 * 
 * nombreLista.append(5)
 * @author estefania.garces
 */
public class Run {
    public static void main(String[] args) {
        ArrayList<Mascota> listaAnimal = new ArrayList<>(); 
        ArrayList<Perro> listaPerro = new ArrayList<>(); 
        ArrayList<Gato> listaGato = new ArrayList<>(); 
        
        Mascota mascota1 = new Mascota(001, 2015, "Firulais", "Negro", "Sano");
        Gato mascota2 = new Gato("Angora", 002, 2013, "Kiku", "Negro y blanco", "Enfermo");
        Perro mascota3 = new Perro("Criollo", false, 003, 2017, "Lucas", "Mono", "Sano");
        Perro mascota5 = new Perro("Pincher", true, 005, 2020, "Miguel", "Moreno", "Enfermo");
        Mascota mascota4 = new Mascota(004, 2021, "Perica", "Amarillo", "Enferma");
        
        listaAnimal.add(mascota1);
        listaAnimal.add(mascota2);
        listaAnimal.add(mascota3);
        listaAnimal.add(mascota4);
        
        listaPerro.add(mascota3);
        listaPerro.add(mascota5);
        listaGato.add(mascota2);
        
        
        for (Mascota i : listaAnimal) { 
            System.out.println("Nombre mascota: "+i.getNombre());
            System.out.println("Código: "+i.getCodigo());
            System.out.println("Color: "+i.getColor());
            System.out.println("Estado de salud: "+i.getEstadoSalud());
            System.out.println("Año de nacimiento: "+i.getAnioNacimiento());
            
            if(i.obtenerTipoAnimal().equals("Perro")){
                System.out.println("-----------------------------PERRO-------------------------");
                for (Perro j: listaPerro){
                    System.out.println("El perro consume pedigree: "+j.isComePedigree());
                    System.out.println("La raza del perro es: "+j.getRaza());
                }
            }else if(i.obtenerTipoAnimal().equals("Gato")){
                System.out.println("-----------------------------GATO--------------------------------");
                for (Gato k: listaGato){
                    System.out.println("La raza del gato es: "+k.getRaza());
                }
            } else{
                continue;
            }
        }
            
        
        
        
        
        System.out.println("-------------------------------------------------------------------");
        
        Doctor doctor1 = new Doctor("Pepito", "001-XXS");
        Veterinaria veterinaria1 = new Veterinaria("Luces oscuras", "Calle Colombia con la Americana 50", 270152362, doctor1);
        System.out.println("------------------------");
        String a = veterinaria1.cuidarMascota(mascota1);
        System.out.println("Mascota se encuentra en estado "+a);
        System.out.println("------------------------");
        String b = veterinaria1.cuidarMascota(mascota2);
        System.out.println("Gato se encuentra en estado "+b);
        System.out.println("------------------------");
        String c = veterinaria1.cuidarMascota(mascota3);
        System.out.println("Perro se encuentra en estado "+c);
        
        System.out.println("------------------------");
        mascota1.Sonido();
        mascota2.Sonido();
        mascota3.Sonido();
        
        System.out.println("------------------------");
        mascota3.Caminar(true);
        String text = mascota3.Caminar(10);
        System.out.println(text);
        mascota3.Caminar();
        
        System.out.println("------------------------");
        int d = mascota2.obtenerNumeroHuesos();
        System.out.println("El gato tiene "+d+" huesos.");
        int D = mascota3.obtenerNumeroHuesos();
        System.out.println("El perro tiene "+D+ " huesos.");
        
        System.out.println("------------------------");
        String A = mascota1.obtenerTipoAnimal();
        System.out.println(mascota1.getNombre()+A);
        
        String B = mascota2.obtenerTipoAnimal();
        System.out.println(mascota2.getNombre()+B);
        
        String C = mascota3.obtenerTipoAnimal();
        System.out.println(mascota3.getNombre()+C);
    }
}

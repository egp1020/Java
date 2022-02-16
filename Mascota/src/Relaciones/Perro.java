/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relaciones;

/**
 *
 * @author estefania.garces
 */
public class Perro extends Mascota {
    private String raza;
    private boolean comePedigree;

    public Perro(String raza, boolean comePedigree, int codigo, int anioNacimiento, String nombre, String color, String estadoSalud) {
        super(codigo, anioNacimiento, nombre, color, estadoSalud);
        this.raza = raza;
        this.comePedigree = comePedigree;
    }
    
    public void Caminar(){
        System.out.println(super.getNombre()+" está caminando.");
    }
    
    public String Caminar(int km){
        String texto = super.getNombre()+" está caminando "+km+" kilometros.";
        return texto;
        //System.out.println(super.getNombre()+" está caminando "+km+" kilometros.");
    }
    public void Caminar(boolean correaPerro){
        String correa = correaPerro ? "tiene correa":"no tiene correa";
        System.out.println(super.getNombre()+" "+correa);
    }
    
    @Override
    public void Sonido(){
        System.out.println(super.getNombre()+" está ladrando.");
    }
    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the comePedigree
     */
    public boolean isComePedigree() {
        return comePedigree;
    }

    /**
     * @param comePedigree the comePedigree to set
     */
    public void setComePedigree(boolean comePedigree) {
        this.comePedigree = comePedigree;
    }
    
    @Override
    public String obtenerTipoAnimal() {
        return "Perro";
    }
}

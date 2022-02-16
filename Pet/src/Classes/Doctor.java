/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author estefania.garces
 */
public class Doctor {
    // Esta clase es de tipo composición, es decir veterinary necesita de esta clase para poder sobrevivir.
    private String name;
    // Esta clase es de tipo composición, es decir veterinary necesita de esta clase para poder sobrevivir.
    private String licence;
    public Doctor(String n, String l){
        this.name = n;
        this.licence=l;
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
     * @return the licence
     */
    public String getLicence() {
        return licence;
    }

    /**
     * @param licence the licence to set
     */
    public void setLicence(String licence) {
        this.licence = licence;
    }
}

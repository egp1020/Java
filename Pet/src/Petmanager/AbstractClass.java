/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Petmanager;

import Classes.Doctor;
import Classes.Veterinary;

/**
 *
 * @author estefania.garces
 */
public class AbstractClass {
    public static void main(String[] args) {
        Doctor doct = new Doctor("Pedrito María", "LI12345");
        Veterinary vtn= new Veterinary("Veterinaria UDS", "000 358 25 25", "Calle Bolivar con la 65", doct);
        vtn.setData(vtn.getName()+" "+vtn.getAddress());
        String type = vtn.getPatientType();
        String information = vtn.getHospitalInformation();
        String surgery = vtn.Surgery();
        
        System.out.println(type);
        System.out.println(information);
        System.out.println(surgery);
    }
}

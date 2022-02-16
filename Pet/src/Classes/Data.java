/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Scanner;

/**
 *
 * @author estefania.garces
 */
public class Data {
        private String nombre, color, salud;
        private int code, año_nacimiento;
        private Scanner input;
        
        public Data(){
            input = new Scanner(System.in);
            
            System.out.print("Ingrese el nombre: ");
            nombre = input.nextLine();
            System.out.print("Ingrese el color: ");
            color = input.next();
            System.out.print("Ingrese el estado de salud: ");
            salud = input.next();
            System.out.print("Ingrese el ID: ");
            code = input.nextInt();
            System.out.print("El año de nacimiento: ");
            año_nacimiento = input.nextInt(); 
        }
}

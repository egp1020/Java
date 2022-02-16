/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrarlibro;

import java.util.Scanner;

/**
 *
 * @author Estefania.Garces
 */
public class RegistrarLibro {

    public static void main(String[] args) {
        String codigo;
        String nombre;
        String autor;
        
        String validarCodigo = "[C][L][0-9][0-9]";
        String validarTexto = "[a-z][10,]";
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese código: ");
        codigo = input.nextLine();
        System.out.print("Ingrese nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese autor: ");
        autor = input.nextLine();
        
        
        if(!codigo.matches(validarCodigo)){
            System.out.println("Código errado");
        }else if(!nombre.matches(validarTexto)){
            System.out.println("Nombre errado");
        }else if(!autor.matches(validarTexto)){
            System.out.println("Autor errado");
        }else{
            ValidarDatos validar = new ValidarDatos(codigo, nombre, autor);
            System.out.println(validar.RegistrarLibro());
        }
    }
}

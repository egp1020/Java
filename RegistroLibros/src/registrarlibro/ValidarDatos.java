/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrarlibro;

/**
 *
 * @author Estefania.Garces
 */
public class ValidarDatos {

    String codigo = "[C][L][0-9][0-9]";
    String nombre = "[a-zA-Z]";
    String autor = "[a-zA-Z]";

    public ValidarDatos(String codigo, String nombre, String autor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
    }

    public boolean validarCodigo() {
        if (codigo == null) {
            return false;
        }
        return true;
    }

    public boolean validarNombre() {
        if (nombre == null) {
            return false;
        }
        return true;
    }

    public boolean validarAutor() {
        if (autor == null) {
            return false;
        }
        return true;
    }

    public String RegistrarLibro() {
        String mensaje = "";
        if (validarCodigo() == false) {
            mensaje = "Código errado";
        } else {
            if (validarNombre() == false) {
                mensaje = "Nombre errados";
            } else {
                if (validarAutor() == false) {
                    mensaje = "Autor errado";
                } else {
                    System.out.println("Registro satisfatorio");
                }
            }
        }
        return mensaje;
    }
}

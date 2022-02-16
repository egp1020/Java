/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import Modelo.PersonaDAO;
import Vista.Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author uer
 */
public class Controlador implements ActionListener {

    PersonaDAO dao=new PersonaDAO();
    Persona p=new Persona();
    Principal principal=new Principal();
    DefaultTableModel modelo=new DefaultTableModel();
    
    public Controlador(Principal pr){
        this.principal=pr;
        this.principal.btnListar.addActionListener(this);
        this.principal.btncrear.addActionListener(this);
        this.principal.btnactualizar.addActionListener(this);
        this.principal.btnok.addActionListener(this);
        this.principal.btneliminar.addActionListener(this);
        //Para listar de forma automatica

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //Manejo con condicionales para que se active la funcionalidad de los botones.
       if(e.getSource()==principal.btnListar){
           listar(principal.tabla);
       }
       if(e.getSource()==principal.btncrear){
           agregar();
           limpiarTabla();//limpia la tabla
           listar(principal.tabla);//vuelve a listar inmediatamente, estos dos metodos ayudan a que la tabla este actualizada con los datos.
       }
       if(e.getSource()==principal.btnactualizar){
           int fila=principal.tabla.getSelectedRow();//Devuelve el numero de fila seleccionada.
           if(fila==-1){
               JOptionPane.showMessageDialog(principal,"Debe seleccionar una fila");
           }
           else{
               int documento=Integer.parseInt((String)principal.tabla.getValueAt(fila,0).toString());//Asi se muestra en las cajas de texto todos los datos que contiene la persona seleccioanda.
               String nombres=(String)principal.tabla.getValueAt(fila,1);
               String apellidos=(String)principal.tabla.getValueAt(fila,2);
               int celular=Integer.parseInt((String)principal.tabla.getValueAt(fila,3).toString());
               String correo=(String)principal.tabla.getValueAt(fila,4);
               //LLena las cajas de texto.
               principal.txtdocumento.setText(""+documento);
               principal.txtnombres.setText(nombres);
               principal.txtapellidos.setText(apellidos);
               principal.txtcelular.setText(""+celular);
               principal.txtcorreo.setText(correo);

           }
       }
       if(e.getSource()==principal.btnok){
           Actualizar();
           limpiarTabla();
           listar(principal.tabla);
       }
       if(e.getSource()==principal.btneliminar){
           int fila=principal.tabla.getSelectedRow();
           if(fila==-1){
               JOptionPane.showMessageDialog(principal,"Debe seleccionar una persona");
           }
           else{
               int documento=Integer.parseInt((String)principal.tabla.getValueAt(fila, 0).toString());
               dao.delete(documento);
               JOptionPane.showMessageDialog(principal,"Persona Eliminada con éxito");

           }
           limpiarTabla();
           listar(principal.tabla);
           
       }
    }
    void limpiarTabla(){
        for(int i=0; i<principal.tabla.getRowCount();i++){//i sera menor a la vista y con getRowCount se cuenta todas las filas de la  tabla.
            modelo.removeRow(i);//Remueve las filas.
            i=i-1;
        }
    }
    public void listar(JTable tabla){
      modelo=(DefaultTableModel)tabla.getModel();List<Persona>lista=dao.listar();
      Object[]object=new Object[5];//objectes un arreglo, y ahi está le numero de columnas de la tabla.
      for(int i=0; i<lista.size();i++){//llega hasta el limite de la cantidad de filas de la tabla.
      object[0]=lista.get(i).getDocumento();
      object[1]=lista.get(i).getNombres();
      object[2]=lista.get(i).getApellidos();
      object[3]=lista.get(i).getCelular();
      object[4]=lista.get(i).getCorreo();
      modelo.addRow(object);
      }
      principal.tabla.setModel(modelo);
      
    }
    public void agregar(){
    //Se obtienen los datos del formulario.
    Integer documento=Integer. parseInt(principal.txtdocumento.getText());
    String nombres= principal.txtnombres.getText();          
    String apellidos=principal.txtapellidos.getText();
    Integer celular=Integer. parseInt(principal.txtcelular.getText());
    String correo=principal.txtcorreo.getText();
    /*envia lo que se ingresa al txt.*/
    p.setDocumento(documento);
    p.setNombres(nombres);
    p.setApellidos(apellidos);
    p.setCelular(celular);
    p.setCorreo(correo);
    int r=dao.agregar(p);
    if(r==1){
        JOptionPane.showMessageDialog(principal, "Usuario Creado con éxito");
    }
    else{
                JOptionPane.showMessageDialog(principal, "Error, No se almaceno la informacion.");

    }
  
    }
    
    public void Actualizar(){
        //Recibe los campos.
        int documento=Integer. parseInt(principal.txtdocumento.getText());
        String nombres= principal.txtnombres.getText();          
        String apellidos=principal.txtapellidos.getText();
        Integer celular=Integer. parseInt(principal.txtcelular.getText());
        String correo=principal.txtcorreo.getText();
        
        //Se envia los datos.
        p.setDocumento(documento);
        p.setNombres(nombres);
        p.setApellidos(apellidos);
        p.setCelular(celular);
        p.setCorreo(correo);
        int r=dao.Actualizar(p);
        if(r==1){
            JOptionPane.showMessageDialog(principal,"Usuario Actualizado con éxito");
        }
        else{
            JOptionPane.showMessageDialog(principal,"Error, no se actulizo el elemento");
        }
    }
}
    
    
   


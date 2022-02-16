
package Modelo;
import java.sql.*;
//import com.mysql.cj.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

         // Data Access Object (DAO)
public class PersonaDAO {
    Conexion conectar= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar(){
        List<Persona>datos=new ArrayList<>();/*list de objeto persona*/
        String sql="select * from registro";//Sentencia sql.
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Persona p=new Persona();
                p.setDocumento(rs.getInt(1));
                p.setNombres(rs.getString(2));
                p.setApellidos(rs.getString(3));
                p.setCelular(rs.getInt(4));
                p.setCorreo(rs.getString(5));
                datos.add(p);//Se agrega a la variable datos.
                
            }
        } catch (Exception e) {
        }
        return datos;//Retorna los datos del objeto.
    }
    public Integer agregar(Persona p){
        String sql="insert into registro(Documento,Nombres,Apellidos,Celular,Correo) values(?,?,?,?,?)";
        try {
            con= conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1,p.getDocumento());
            ps.setString(2,p.getNombres());
            ps.setString(3,p.getApellidos());
            ps.setInt(4,p.getCelular());
            ps.setString(5,p.getCorreo());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    return 1;
    }
    public int Actualizar(Persona p){
        int r=0;
        String sql="update registro set Nombres=?,Apellidos=?, Celular=?,Correo=? where Documento=?";
        try {
           con=conectar.getConnection();
           ps=con.prepareStatement(sql);
           ps.setString(1, p.getNombres());
           ps.setString(2, p.getApellidos());
           ps.setInt(3, p.getCelular());
           ps.setString(4, p.getCorreo());
           ps.setInt(5, p.getDocumento());
           r=ps.executeUpdate();
           if(r==1){
               return 1;
           }
           else{
               return 0;
           }
        } catch (Exception e) {
        }
        return r;
    }
    public void delete(int Documento){
        String sql="delete from registro where Documento="+Documento;
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
   
}


package yakult;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Proceso 
{
    public void agregarRegistro(Registro reg)
    {
        String vis= "si";
        String entga="si";
        BDConection conn= new BDConection();
       try{
           Statement consulta = conn.getConnection().createStatement();
           if (reg.visita==false)
           {
               vis="no";
           }
           if(reg.entregado==false)
           {
               entga="no";
           }
           String sql= "INSERT INTO registro VALUES('" +reg.IdRegistro+"','"+reg.nombreCli+"','"+reg.domicilioCli+"','"+reg.hEntrega+"','"+vis+"','"+entga+"','"+reg.cantidadProd+"',"+reg.nombreProd+",'"+reg.fecha+"','"+reg.comentarios+"')";
           consulta .executeUpdate(sql);
           JOptionPane.showMessageDialog(null,"Venta Registrada");
           consulta.close();
           conn.desconectar();
       }catch(SQLException e)
       {
           JOptionPane.showMessageDialog(null,"Error al registrar"+e);
       }
    }
    
      public void guardarRegistro(Registro reg) {
        BDConection conn = new BDConection();
        
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql; 
            sql = "UPDATE registro SET nombreCli = '" +reg.getNombreCli()+"', domicilioCli = '" + reg.getDomicilioCli() +
                    "', hEntrega = '" +reg.gethEntrega() +"', visita= '"+reg.getVisita()+
                    "', entregado= '"+reg.getEntregado()+"', cantidadProd= "+reg.getCantidadProd()+
                    ", nombreProd= "+reg.getNombreProd()+", fecha= '"+reg.getFecha()+
                    "', comentarios= '"+reg.getComentarios()+"' WHERE IdRegistro = " + reg.getIdRegistro();
            
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Se han guardado los cambios");
            consulta.close();
            conn.desconectar();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se guardaron los cambios " + e);
        }
    }
      
      
      
       public void borrarUsuario(int IdRegistro) {
        BDConection conn = new BDConection();
        
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "DELETE FROM registro WHERE IdRegistro = " + IdRegistro; 
            
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"El registro se ha borrado");
            consulta.close();
            conn.desconectar();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se borro el registro " + e);
        }
    }
    
    public ArrayList<Registro> obtenRegistro()
    {
        ArrayList<Registro> arrReg=new ArrayList<>();
        BDConection conn= new BDConection();
        String sql= "SELECT * FROM registro";
        try
        {
            PreparedStatement st= conn.getConnection().prepareStatement(sql);
            ResultSet rs= st.executeQuery();
            
            while(rs.next())
            {
                Registro reg= new Registro(
                        rs.getInt("IdRegistro"),
                        rs.getString("nombreCli"),
                        rs.getString("domicilioCli"),
                        rs.getString("hEntrega"),
                        rs.getBoolean("visita"),
                        rs.getBoolean("entregado"),
                        rs.getInt("cantidadProd"),
                        rs.getInt("nombreProd"),
                        rs.getString("fecha"),
                        rs.getString("comentarios"));
                arrReg.add(reg);       
            }
            rs.close();
            st.close();
            conn.desconectar();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error"+ e);
        }
        return arrReg;
    }
    
}

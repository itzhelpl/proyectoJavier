package yakult;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import yakult.BDConection;

public class UsuarioDAO {
    public void agregarUuario(Usuario us )
    {
        BDConection conn= new BDConection();
        try{
            Statement consulta = conn.getConnection().createStatement();
            String sql ="INSERT INTO usuarios(nombreUs, password) VALUES('"+us.getNombreUs()+"', '"+us.getPassword()+"')";
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Se ha registrado el usuario: " + us.getNombreUs());
            consulta.close();
            conn.desconectar();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No se registró el usuario "+e);
        }
    }
    public void guardarUsuario(Usuario us)
    {
      BDConection conn= new BDConection ();
      try{
          Statement consulta = conn.getConnection().createStatement();
          String sql="UPDATE usuarios SET nombreUs= '" + us.getNombreUs() + "',password= '" +us.getPassword() +"' WHERE idUsuario= "+us.getIdUsuario();
          consulta .executeUpdate(sql);
          JOptionPane.showMessageDialog(null,"Se han guardado los cambios");
          consulta.close();
          conn.desconectar();
      }catch( SQLException e)
      {
            JOptionPane.showMessageDialog(null,"No se guardaron los cambios");
      }
    }
    
    
     public void borrarUsuario(int idUsuario)
     {
         BDConection conn= new BDConection();
         try
         {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "DELETE FROM usuarios WHERE idUsuario="+idUsuario;
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"El usuario se ha borrado");
            consulta.close();
            conn.desconectar();
         }catch(SQLException e){
              JOptionPane.showMessageDialog(null,"No se borró el  usuario ");
         }
     }
     
     
     public ArrayList<Usuario> obtenUsuarios()
     {
         ArrayList<Usuario> arrUsu= new ArrayList<Usuario>();
         BDConection conn= new BDConection();
         
         String sql= "SELECT * FROM usuarios";
         try{
             PreparedStatement st = conn.getConnection().prepareStatement(sql);
             ResultSet rs=st.executeQuery();
              
             while (rs.next())
             {
                 Usuario us = new Usuario(
                 rs.getInt("IdUsuario"),
                 rs.getString("nombreUs"),
                 rs.getString("password"));
                 arrUsu.add(us);
             }
             rs.close();
             st.close();
             conn.desconectar();
         }catch(Exception e)
         {
             
         }
         return arrUsu;
     }
     
    
}


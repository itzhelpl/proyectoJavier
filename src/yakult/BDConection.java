package yakult;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.sql.DataSource;

public class BDConection 
{
    public DataSource dataSource;
    static String bd ="itesz";
    static String login ="root";
    static String password="";
    static String url="jdbc:mysql://localhost/"+ bd;
    Connection coneccion=null;
    //Object BDConection;
//    private void inicialiceDataSource()
//    {
//        BasicDataSource basic=new BasicDataSource();
//    }
    public BDConection()
    {
        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            coneccion=DriverManager.getConnection(url,login,password);
            if (coneccion ==null)
            {
                JOptionPane.showMessageDialog(null,"Error al abrir la BD");
            }
        }catch(SQLException  e )
        {
            JOptionPane.showMessageDialog(null,"Se presdentó el siguiente error  "+ e);
        }catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"Se presdentó el siguiente error  "+ e);    
        }catch(Exception e )
        {
            JOptionPane.showMessageDialog(null,"Se presdentó el siguiente error  "+ e);
        }   
    }
    public Connection getConnection ()
    {
        return coneccion ;
    }
    public void desconectar()
    {
        coneccion = null;
    }
    
}

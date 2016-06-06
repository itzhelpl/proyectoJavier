package yakult;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static yakult.login.txtNomUsuario;
import static yakult.login.txtPassword;

public class MetodosLogin 
{
        BDConection conect=new BDConection();
    public int validar_ingreso()
    {
        String usuario=txtNomUsuario.getText();
        String pass=String.valueOf(txtPassword.getPassword());
        
        int res=0;
        
        String sql="SELECT * FROM usuarios WHERE nombreUS= '"+usuario+"' AND password= '"+pass+"'";
        Connection conn= null;
            try {
                conn=conect.getConnection();
                Statement st=conn.createStatement();
                ResultSet rs=st.executeQuery(sql);
                if(rs.next())
                {
                    res=1;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de coneccion "+ ex);
            }finally{
            try {
                if(res==1)
                {
                    conn.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de desconeccion "+ ex);
            }
            }
            return res;
    }
    
}

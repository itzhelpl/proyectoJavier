package yakult.Usuarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ClassUsuario 
{
    private String nombUsuario;
    private String password;
    private int cveTipo;
    private  String nombre;
    
    public void ClassUsuario(String strNomUsuario,String strPassword,int cvTipo,String strNombre)
    {
        this.nombUsuario=strNomUsuario;
        this.password=strPassword;
        this.cveTipo=cvTipo;
        this.nombre=strNombre;
    }
    public void setNombreUsuario(String strNomUsuario)
    {
        this.nombUsuario=strNomUsuario;
    }
    public void setPassword(String strPassword)
    {
        this.password=strPassword;
    }
    public void setTipoUsuario(int cvTipo)
    {
        this.cveTipo = cvTipo;
    }
    public void setNombre (String strNombre)
    {
        this.nombre=strNombre;
    }
     public String getNombreUsuario()
     {
         return nombUsuario;
     }
     public String getPassword()
     {
         return password;
     }
     public int getTipoUsuario()
     {
         return cveTipo;
     }
     public String getNombre()
     {
         return nombre;
     }
     public int validaUsuario(String strNomUsuario, char[] strPassword)
     {
         int tipoUsuario = 0;
         try
         {
             File archivo = new File ("usuarios.txt");
             if (archivo.exists())
             {
                 BufferedReader br= new BufferedReader(new FileReader("usuarios.txt"));
                 String linea;
                 while((linea=br.readLine())!=null)
                 {
                     StringTokenizer st=new StringTokenizer(linea,",");
                     String nombUsuario=st.nextToken().trim();
                     String password=st.nextToken().trim();
                     char[] clave= password.toCharArray();
                     if((nombUsuario.equals(strNomUsuario))&&(Arrays.equals(clave,strPassword)))
                     {
                         tipoUsuario=Integer.parseInt(st.nextToken().trim());
                     }
                 }
             }
             else
             {
                 JOptionPane.showMessageDialog(null, "El archivo de usuarios no existe");
             }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, "Se produjo un error ");
         }
         return tipoUsuario;
     }
}

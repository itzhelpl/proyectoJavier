package yakult;
public class Usuario {
    private int idUsuario;
    private String nombreUs;
    private String password;
    
    public Usuario()
    {
        
    }
     
    public Usuario (int idUsuario,String nombreUs,String password)
    {
        this.idUsuario= idUsuario;
        this.nombreUs= nombreUs;
        this.password= password;
    }
    
    public void setNombreUs(String strNombreUs)
    {
        this.nombreUs=strNombreUs;
    }
    public void setPassword(String strPassword)
    {
        this.password=strPassword;
    }
    
    public int getIdUsuario()
    {
        return idUsuario;
    }
    public String  getNombreUs()
    {
        return nombreUs;
    }
    public String getPassword()
    {
        return password;
    }
String[] getRow()
{
    String [] row= new String[3];
    row[0] =""+idUsuario;
    row[1]= nombreUs;
    row[2]= ""+password;
return row;
}
}

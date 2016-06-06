package yakult;
public class Registro 
{
    int IdRegistro;
    String nombreCli;
    String domicilioCli;
    String hEntrega;
    boolean visita;
    boolean entregado;
    int   cantidadProd;
    int nombreProd;
    String fecha;
    String comentarios;
 public Registro (int IdRegistro, String nombreCli,String domicilioCli,String hEntrega,boolean visita,
         boolean entregado,int cantidadProd,int nombreProd,String fecha,String comentarios)
    {
        this.IdRegistro=IdRegistro;
        this.nombreCli = nombreCli;
        this.domicilioCli = domicilioCli;
        this.hEntrega = hEntrega;
        this.visita = visita;
        this.entregado = entregado;
        this.cantidadProd = cantidadProd;
        this.nombreProd = nombreProd;
        this.fecha = fecha;
        this.comentarios = comentarios;
    
    }

   public Registro() 
    {
        
    }
 //**************MÉTODOS SET*************
   
 public void setNombreCli(String nombreCli)
 {
     this.nombreCli=nombreCli;
 }
 public void setDomicilioCli(String domicilioCli)
 {
     this.domicilioCli = domicilioCli;
 }
 public void sethEntrega(String hEntrega)
 {
     this.hEntrega = hEntrega;
 }
 public void setVisita(boolean visita)
 {
     this.visita = visita;
 }
 public void setEntregado(boolean entregado)
 {
     this.entregado = entregado;
 }
 public void setCantidadProd(int cantidadProd)
 {
     this.cantidadProd = cantidadProd;
 }
 public void setNombreProd(int nombreProd)
 {
     this.nombreProd= nombreProd;
 }
 public void setFecha(String fecha)
 {
     this.fecha= fecha;
 }
 public void setComentarios(String comentarios)
 {
     this.comentarios = comentarios;
 }
 
 //********MÉTODOS GET********
 public int getIdRegistro()
 {
     return IdRegistro;
 }
 public String getNombreCli()
 {
     return nombreCli;
 }
 public String getDomicilioCli()
 {
     return domicilioCli;
 }
 public String gethEntrega()
 {
     return hEntrega;
 }
 public boolean getEntregado()
 {
       return entregado;
     
 }
 public boolean getVisita()
 {
    return visita;
     
 }
 public int getCantidadProd()
 {
     return cantidadProd;
 }
 public int getNombreProd()
 {
     return nombreProd;
 }
 public String getFecha()
 {
     return fecha;
 }
 public String getComentarios()
 {
     return comentarios;
 }
 String [] getRow()
 {
     String [] row = new String[10];
     row [0]=""+(IdRegistro);
     row [1]= nombreCli;
     row [2]=domicilioCli;
     row [3]=hEntrega;
     row [4]=""+(visita);
     row [5]=""+(entregado);
     row [6]=""+(cantidadProd);
     row [7]=""+nombreProd;
     row [8]=fecha;
     row [9]=comentarios;
     return row;
 }
}

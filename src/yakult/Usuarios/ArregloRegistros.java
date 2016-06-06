package yakult.Usuarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ArregloRegistros 
{
//    private ArrayList<Registro> objRegistro;
//    
//    public ArregloRegistros()
//    {
//        objRegistro=new ArrayList<Registro>();
//    }
//    public void Agregar(Registro reg)
//    {
//        objRegistro.add(reg);
//    }
//    public void Borrar(Registro reg)
//    {
//        objRegistro.remove(reg);
//    }
//    public Registro Obtener(int pos)
//    {
//        return objRegistro.get(pos);
//    }
//    public Registro buscar(String nombreCli)
//    {
//        for(int i = 0;i<objRegistro.size();i++ )
//        {
//            if(nombreCli.equals(objRegistro.get(i).getNombreCli()))
//            {
//                return objRegistro.get(i);
//            }
//        }
//        return null;
//    }
//    public int numElementos()
//    {
//        return objRegistro.size();
//    }
//    public void leerDatos()
//    {
//        cargar();
//                
//    }
//    private void cargar()
//    {
//        try
//        {
//            File archivo= new File("Registros.txt");
//            if(archivo.exists())
//            {
//                BufferedReader br= new BufferedReader(new FileReader("Registros.txt"));
//                String linea; 
//                while ((linea=br.readLine())!=null)
//                {
//                    StringTokenizer st = new StringTokenizer(linea,",");
//                    String nombreCli = st.nextToken().trim();
//                    String domicilioCli = st.nextToken().trim();
//                    String hEntrega = st.nextToken().trim();
//                    boolean visita =Boolean.parseBoolean(st.nextToken().trim());
//                    boolean entregado=Boolean.parseBoolean(st.nextToken().trim());
//                    int cantidadProd =Integer.parseInt(st.nextToken().trim());
//                    String nombreProd = st.nextToken().trim();
//                    String fecha = st.nextToken().trim();
//                    String comentarios = st.nextToken().trim();
//                    if (objRegistro.size()==0)
//                    {
//                         Registro reg = new Registro(nombreCli,domicilioCli,hEntrega,visita,entregado,cantidadProd,
//                         nombreProd,fecha,comentarios);
//                         Agregar(reg);
//                    }
//                }
//            }
//        }catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, "Se prdujo un error "+e);
//        }
//    }
//    public void guardar ()
//    {
//        try
//        {
//            PrintWriter pw= new PrintWriter(new FileWriter("Registro.txt"));
//             for(int i = 0;i<numElementos();i++)
//             {
//                 pw.println(Obtener(i).getNombreCli()+","+Obtener(i).getDomicilioCli()+","+Obtener(i).gethEntrega()+","+Obtener(i).getVisita()+","+Obtener(i).getEntregado()+","+
//                        Obtener(i).getCantidadProd()+","+ Obtener(i).getNombreProd()+","+Obtener(i).getFecha()+","+Obtener(i).getComentarios());
//                 
//             }
//             pw.close();
//        }catch(Exception e)
//                {
//                  JOptionPane.showMessageDialog(null,"Se produjo un error "+e);  
//                }
//    }
}

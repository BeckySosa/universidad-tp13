
package universidadulp;

import java.sql.*;
import javax.swing.JOptionPane;
public class UniversidadUlp {

    public static void main(String[] args) {
      try {
            // TODO code application logic here
            Class.forName("org.mariadb.jdbc.Driver");
            String bd="jdbc:mysql://localhost:3306/universidadejemplo";
            String usuario="root";
            String password="";
            Connection con= DriverManager.getConnection(bd,usuario,password);
            
//            String sql = " INSERT INTO "
//                    + " alumno (dni, apellido, nombre, fechaNacimiento, estado) "
//                    + " VALUES (44756323,'Avaca','melchor','1992-05-26',true),"
//                    + "(37263182,'Armando','Paredes','1990-03-02',true),"
//                    + "(24736281,'Quito','Esteban','2001-05-06',true)" ;
//            
//             PreparedStatement ps=con.prepareStatement(sql);
//            String sql1 = " INSERT INTO "
//                    + " materia (nombre, año, estado) VALUES "
//                    + " VALUES ('Laboratorio1', 2024 , true),"
//                    + "('Web' , 2000 , true),"
//                    + "('EDA', 2022 , true),"
//                    + "('Java',2023,true)" ;
//            
//             PreparedStatement ps1=con.prepareStatement(sql1);
//            String sql2 = "INSERT INTO "
//                    + "inscripcion (nota,idAlumno,idMateria)"
//                    + "VALUES (5,7,1),"
//                    + "(9,7,3),"
//                    + "(10,8,2),"
//                    + "(8,8,4),"
//                    + "(6,9,1),"
//                    + "(7,9,4)";
//                    PreparedStatement ps2=con.prepareStatement(sql2);
//             int filas=ps2.executeUpdate();
//             if(filas >0){
//             
//                 JOptionPane.showMessageDialog(null, "Alumno Agregado");
//                 
//             }
//             if(filas >0){
//             
//                 JOptionPane.showMessageDialog(null, "Alumno Agregado");
//             }   
////            
//          String sql3 = "SELECT * FROM alumno JOIN inscripcion ON "
//                  + "alumno.idAlumno = inscripcion.idAlumno WHERE inscripcion.nota > ? ";
//          PreparedStatement ps3=con.prepareStatement(sql3);
//           int condicion=8;
//           ps3.setInt(1,condicion);
//           ResultSet registro=ps3.executeQuery();
//           while(registro.next()){
//            System.out.println("id "+ registro.getInt("idAlumno"));
//            System.out.println("dni "+ registro.getInt("dni"));
//            System.out.println("apellido "+ registro.getString("apellido"));
//            System.out.println("nombre "+ registro.getString("nombre"));
//            System.out.println("fecha de nacimiento "+ registro.getString("fechaNacimiento"));
//            System.out.println("estado "+ registro.getBoolean("estado"));
//        }
   String sql4="DELETE FROM inscripcion WHERE idAlumno=7 AND idMateria=1";
   PreparedStatement ps4=con.prepareStatement(sql4);
   int filas=ps4.executeUpdate(sql4);
   if(filas >0){
             
                 JOptionPane.showMessageDialog(null, "no esta inscrpto");
                 
             }
              
           
      } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargard driver");
        } catch (SQLException ex) {
            int codigoE=ex.getErrorCode();
            if(codigoE==1062){
                  JOptionPane.showMessageDialog(null, "Entrada Duplicada");
            } else if(codigoE==1049){
            JOptionPane.showMessageDialog(null, "BD Desconocida");
            }else{
                  JOptionPane.showMessageDialog(null, "Error "+ex);
            }
            
            ex.printStackTrace();
            System.out.println("codigo de error "+ex.getErrorCode());
        }
        
        
    }
    }
    


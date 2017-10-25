package swsms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConfiguration {
 static PreparedStatement pst=null;
    private final String url="";
    private static Statement stmt=null;
    private static DbConfiguration handler;
    public static Connection con=null;
    public static Connection getConnection(){
        return con;
    }
     DbConfiguration(){
        createConnection();
    }
    public static DbConfiguration getInstance(){
        if(handler==null){
            handler=new DbConfiguration();
        }
        return handler;
    }
    void createConnection(){
        try {       
            Class.forName("oracle.jdbc.OracleDriver");       
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","dummy","myoracle");
            if(con!=null)
                System.out.println("Connected");
            else
                System.out.println("not connected");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } catch (ClassNotFoundException ex) {
        }
        //Class.forName("com.mysql.jdbc.Driver");
        
    }
   
    
    public PreparedStatement execQueryPrep(String query){
        try {
            
            pst=con.prepareStatement(query);
            //pst.executeUpdate();
            return pst;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return pst;
        }
    }
    public ResultSet execQuery(String query){
        ResultSet rs=null;
        
        try {
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
            //return rs;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }finally{
            
        }
        
        return rs;
    }
    public boolean execAction(String query) {
        System.out.println(query);
        try {
            stmt=con.createStatement();
             stmt.execute(query);
             System.out.println("AFter execution");
             return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }finally{
            
        }
       
    }   
}

/****Michael Day
 * 
  Sections.java*/
package BusinessObjects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class  Sections{
   //Properties
   public Connection c1;
   public Statement stmt;
   private String StudentID;
   private String CRN;
   
   //constructor
   public Sections(String ID, String crn){
       StudentID = ID;
       CRN = crn;
   }
   
    //constructor
    public Sections(){
        StudentID = "";
        CRN = "";
    }//end constructor
    
    //set and get methods
    public void setStudentID(String STUDENTID){StudentID = STUDENTID;}
    public String getStudentID(){return StudentID;}
    
    public void setCrn(String crn){CRN = crn;}
    public String getCrn(){return CRN;}
        
    //display method
    public void display(){
        System.out.println("StudnetID #:" + StudentID );
        System.out.println("CRN: " + CRN);
        }
    
    //method to connect to mysql database
    public void connect(){
         try {

                //Load Driver
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver Loaded!!");

                //Get a Connestion
                c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration?zeroDateTimeBehavior=convertToNull","root", "dd5656");
                System.out.println("Got Connection!!");

                //Create a Statement
                stmt = c1.createStatement();
                
         }//end try
         catch (SQLException se) { System.out.println(se); }
         catch (Exception e) { System.out.println(e); }
    }//end connect
    
    //method to select studentschedule from database based on student Id
    public void selectDB(String ID){
        connect();
        try{
            //Setup SQL Statement
            String sql;
            sql = "Select * "
                 +"FROM studentschedule "
                 +"WHERE StudentID = " + ID;
            System.out.println(sql);
            
            //Execute Query
            ResultSet rs = stmt.executeQuery(sql);
            
            //Loop through data
            while(rs.next()){
                StudentID = rs.getString(1);
                CRN = rs.getString(2);                 
            }//end while
          
            //Close Connection
            c1.close();
        }catch(SQLException se){System.out.println(se);}
    }//end find
    
    //method to insert student ID and class crn to database
    public String insertDB(String ID, String crn){
        //declarations
        StudentID = ID;
        CRN = crn;
        connect();
        
        try{
           String Status = null;
           String sql;
           sql = "INSERT INTO studentschedule "
                + "VALUES('"+ StudentID + "','" + CRN + "')" ;
           System.out.println(sql);
           
           int n = stmt.executeUpdate(sql);
           if(n==1){
               Status = "true";
               System.out.println("Database Updated");
           }else{
               Status  = "false";
               System.out.println("Database Error");
           }
           //Close Connection
           c1.close();
           return Status;
       }
           catch(Exception e){
               System.out.println(e);
               return "false";
           }
    }
    
    //method to updata the database
    public String updateDB(){
        connect();
         try{
            String Status = null;
            String sql;
            sql = "UPDATE students "
                + "SET  ID = '" + getStudentID()+ "',Password = '" + getCrn() + "'"
                + " WHERE ID = '" + getStudentID() + "'";
            System.out.println(sql);
            
            int n = stmt.executeUpdate(sql);
            if(n==1){
                Status = "true";
                System.out.println("Database Updated");
            }else{
                Status = "false";
                System.out.println("Database Not Updated");
            }
            //close database
            c1.close();
            return Status;
      
        }catch(Exception e){
            System.out.println(e);
            return "false";
        }
    }
    
    //method to delete class from database
    public void deleteDB(){
        connect();
        try{
            String sql;
            sql = "DELETE FROM studentschedule "
                 +"WHERE StudentID = '" + getStudentID()+ "' and CRN = '" + getCrn() + "'";
            System.out.println(sql);
            
            int n = stmt.executeUpdate(sql);
            if(n == 1){
                System.out.println("Database Row Deleted");
            }else{
                System.out.println("Database Error");
            }
            
            //close database
            c1.close();
            
        }//end try
        catch(Exception e){System.out.println(e);}
    }
    
     public static void main(String[] args) {
        //test items 
        Sections sec1 = new Sections();
       sec1.selectDB("9");
       sec1.setCrn("30101");
       sec1.setStudentID("9");
       sec1.deleteDB();
       //sec1.insertDB("9", "30104");
       //s1.setUserID("5689");
      // sec1.setGpa(3.2);
       //s1.setCity("Hiram");
       //s1.updateDB();
        //s1.deleteDB();
       sec1.display();
       
       

    }
}


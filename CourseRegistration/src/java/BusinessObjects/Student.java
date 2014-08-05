package BusinessObjects;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
   //Properties
   public Connection c1;
   public Statement stmt;
   private String UserID;
   private String Password;
   private String FirstName;
   private String LastName;
   private String Street;
   private String City;
   private String State;
   private String Zip;
   private String Email;
   private double gpa;
     
   //constructor
   public Student(String ID, String PW, String FN, String LN, String STRT, String CTY, String ST, String ZP, String EM, Double GPA){
       UserID = ID;
       Password = PW;
       FirstName = FN;
       LastName = LN;
       Street = STRT;
       City = CTY;
       State = ST;
       Zip = ZP;
       Email = EM;
       gpa = GPA;
       
   }
   
    //constructor
    public Student(){
    
        UserID = "";
        Password = "";
        FirstName = "";
        LastName = "";
        Street = "";
        City = "";
        State = "";
        Zip = "";
        Email = "";
        gpa = 0.0;
    }//end constructor
    
    //set and get methods
    public void setUserID(String USERID){UserID = USERID;}
    public String getUserID(){return UserID;}
    
    public void setPassword(String PW){Password = PW;}
    public String getPassword(){return Password;}
    
    public void setFirstName(String FN){FirstName = FN;}
    public String getFirstName(){return FirstName;}
    
    public void setLastName(String LN){LastName = LN;}
    public String getLastName(){return LastName;}
    
    public void setStreet(String ST){Street = ST;}
    public String getStreet(){return Street;}
    
    public void setCity(String CTY){City = CTY;}
    public String getCity(){return City;}
    
    public void setState(String ST){State = ST;}
    public String getState(){return State;}
    
    public void setZip(String ZP){Zip = ZP;}
    public String getZip(){return Zip;}
    
    public void setEmail(String EM){Email = EM;}
    public String getEmail(){return Email;}
    
    public void setGpa(Double GPA){gpa = GPA;}
    public Double getGpa(){return gpa;}
    
    
    //display method
    public void display(){
        System.out.println("UserID #:" + UserID );
        System.out.println("Password: " + Password);
        System.out.println("First Name: " + FirstName);
        System.out.println("Last Name: " + LastName );
        System.out.println("Street: "+ Street);
        System.out.println("City: " + City);
        System.out.println("State: " + State);
        System.out.println("Zip: " + Zip);
        System.out.println("Email: " + Email);
        System.out.println("GPA: " + gpa);
        }
    
    //method to connect to database
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

    //method to select student from database based on student ID
    public void selectDB(String ID){
        connect();
        try{
            //Setup SQL Statement
            String sql;
            sql = "Select * "
                 +"FROM students "
                 +"WHERE ID = " + ID;
            System.out.println(sql);
            
            //Execute Query
            ResultSet rs = stmt.executeQuery(sql);
            
            //Loop through data
            while(rs.next()){
                UserID = rs.getString(1);
                Password = rs.getString(2);
                FirstName = rs.getString(3);
                LastName = rs.getString(4);
                Street = rs.getString(5);
                City = rs.getString(6);
                State = rs.getString(7);
                Zip = rs.getString(8);
                Email = rs.getString(9);
                gpa = rs.getDouble(10);                 
            }//end while
          
            //Close Connection
            c1.close();
        }catch(SQLException se){System.out.println(se);}
    }//end find
    
    //method to insert new student into database
    public String insertDB(String ID, String PW, String FN, String LN, String STR, String CTY, String ST, String zip, String EM, double GPA){
        //declarations
        UserID = ID;
        Password = PW;
        FirstName = FN;
        LastName = LN;
        Street = STR;
        City = CTY;
        State = ST;
        Zip = zip;
        Email = EM;
        gpa = GPA;
        connect();
        
        try{
           //declarations
           String Status = null;
           String sql;
           //setup sql statement
           sql = "INSERT INTO students "
                + "VALUES('"+ UserID + "','" + Password + "','" + FirstName + "','" + LastName + "','" + Street + "','" 
                   + City + "','" + State + "'," + Zip + ",'" + Email + "'," + gpa + ")" ;
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
    
    //method to updata database 
    public String updateDB(){
        connect();
         try{
            String Status = null;
            //setup sql statement
            String sql;
            sql = "UPDATE students "
                + "SET  ID = '" + getUserID()+ "',Password = '" + getPassword() + "', FirstName = '" + getFirstName()
                + "', LastName = '" + getLastName() + "', Street = '" + getStreet() + "', City = '" + getCity() + "', State = '" 
                + getState() + "', Zip = '" + getZip() + "', EMail = '" + getEmail() + "', GPA = " + getGpa()
                + " WHERE ID = '" + getUserID() + "'";
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
    
    //method to delete user from database
    public void deleteDB(){
        connect();
        try{
            //setup sql statement
            String sql;
            sql = "DELETE FROM students "
                 +"WHERE ID = '" + getUserID()+ "'";
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
        //test items for student 
        Student s1 = new Student();
       s1.selectDB("990088648");
       //s1.setUserID("5689");
       s1.setGpa(3.2);
       s1.setCity("Hiram");
       s1.updateDB();
        //s1.deleteDB();
       s1.display();
       
       Student s4 = new Student();
        s4.selectDB("990088648");
        //s4.setZip("696969");
        s4.display();

    }
}


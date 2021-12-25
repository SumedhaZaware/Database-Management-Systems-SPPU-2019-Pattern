import java.io.*;
import java.util.Scanner;
import java.sql.*;
public class TECOC342_Assignment11_Code{
    public void Display(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TECOC342_Assignment11_Code","redhat","redhat");
            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from Student_Data");
            
            while(rs.next()) System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void Insert(int i1,String nm,int i2,String ct){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TECOC342_Assignment11_Code","root","root1234");
            PreparedStatement pstmt = con.prepareStatement("insert into Student_Data values(?,?,?,?)");

            pstmt.setInt(1,i1);
            pstmt.setString(2,nm);
            pstmt.setInt(3,i2);
            pstmt.setString(4,ct);
            int i = pstmt.executeUpdate();
            con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void delete(int i){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/TECOC342_Assignment11_Code","root","root1234");
            PreparedStatement pstmt = con.prepareStatement("delete from Student_Data where Student_Id=?");

            pstmt.setInt(1,i);
            int k =pstmt.executeUpdate();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void Update(String name, int i){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TECOC342_Assignment11_Code","root","root1234");
            PreparedStatement pstmt=con.prepareStatement("update Student_Data set Student_Name=? where Student_Id=?");
            pstmt.setString(1,name);
            pstmt.setInt(2,i);
            int k =pstmt.executeUpdate();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);
        TECOC342_Assignment11_Code obj1= new TECOC342_Assignment11_Code();
        int ch;
        String n1,c1;
        int id1,id2;
        do{
            System.out.println("******JDBC-MySQL Connected******");
            System.out.println("List of operations:");
            System.out.println(" 1.Display all Records");
            System.out.println(" 2.Insert new Record");
            System.out.println(" 3.Update a Record");
            System.out.println(" 4.Delete a Record");
            System.out.println(" 5.Exit");
            System.out.println("");
            System.out.println(" Enter your Choice");
            
            ch=sc.nextInt();
            switch(ch){
            case 1: 
                obj1.Display();
                break;

            case 2: 
                System.out.println("Enter Student Id: ");
                id1=sc.nextInt();
                System.out.println("Enter Student Name: ");
                n1=sc.next();
                System.out.println("Enter Instructor Id: ");
                id2=sc.nextInt();
                System.out.println("Enter Student City: ");
                c1=sc.next();
                obj1.Insert(id1,n1,id2,c1);
                break;

            case 3: 
                System.out.println("Enter Student Id: ");
                int stid = sc.nextInt();
                System.out.println("Enter Student name: ");
                obj1.Update("harry",stid);
                break;

            case 4:
                System.out.println("Enter id of student to delete :");
                int sid = sc.nextInt();
                obj1.delete(sid);
                break;
            }
        }while(ch!=5);
    }
}

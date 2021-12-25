import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.Formatter;
import com.mongodb.*;

public class TECOC342_Assignment12_Code{
    public static MongoClient mongoClient;
    public static DB dataBase;
    public static DBCollection Employees;
    public static void DisplayRecords(){
        DBObject query=new BasicDBObject();
        DBCursor cur=Employees.find(query);
        Formatter fmt = new Formatter();
        System.out.println();
        fmt.format("%-6s %6s %12s %12s", "ID", "AGE", "First Name","Last Name");
        System.out.println(fmt);
        fmt.close();
        while (cur.hasNext()){
            DBObject nextObj=cur.next();
            fmt = new Formatter();
            fmt.format("%-6s %6s %12s %12s",nextObj.get("employeeID"),nextObj.get("age"),nextObj.get("firstName"),nextObj.get("lastName"));
            System.out.println(fmt);
            fmt.close();
        }
        System.out.println();
    }
    public static void InsertRecord(String employeeID,String age,String firstName,String lastName){
        TECOC342_Assignment12_Code obj=new TECOC342_Assignment12_Code();
        obj.setEmployeeID(employeeID);
        obj.setFirstName(firstName);
        obj.setLastName(lastName);
        obj.setAge(age);
        Employees.insert(convert(obj));
    }

    public static void UpdateRecord(String employeeID,String age,String firstName,String lastName){
        Formatter fmt;

        TECOC342_Assignment12_Code updateObj=new TECOC342_Assignment12_Code();
        updateObj.setEmployeeID(employeeID);
        updateObj.setFirstName(firstName);
        updateObj.setLastName(lastName);
        updateObj.setAge(age);

        TECOC342_Assignment12_Code query=new TECOC342_Assignment12_Code("employeeID",employeeID);
        Employees.findAndModify(query,convert(updateObj));
        DBCursor cur= Employees.find(query);
        System.out.println("Updated Employee Data :");
        DBObject nextObj=cur.one();
        fmt = new Formatter();
        fmt.format("%-6s %6s %12s %12s",nextObj.get("employeeID"),nextObj.get("age&"),nextObj.get("firstName"),nextObj.get("lastName"));
        System.out.println(fmt);
        fmt.close();
    }

    public static void DeleteRecord(String employeeID){
        TECOC342_Assignment12_Code query=new TECOC342_Assignment12_Code("EmployeeID:",employeeID);
        Employees.findAndRemove(query);
        System.out.print("Record with Employee Id: ");
        System.out.print(employeeID);
        System.out.print(" Deleted successfully!!\n\n");
    }

    public static void main(String[] args) throws UnknownHostException{
        mongoClient=new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        dataBase=mongoClient.getDB("JavaMongo-Connection");
        Employees=dataBase.getCollection("Employees");
        Scanner sc=new Scanner(System.in);
        int ch;
        String employeeID,firstName,lastName,age;
        do{
            System.out.println("--------------------------------------------");
            System.out.println(" 1.Display all Records");
            System.out.println(" 2.Insert new Record");
            System.out.println(" 3.Update a Record");
            System.out.println(" 4.Delete a Record");
            System.out.println(" 5.Exit");
            System.out.println("--------------------------------------------");
            System.out.println(" Enter your Choice");
            ch=sc.nextInt();
            switch (ch) {
                case 1: 
                    DisplayRecords();
                case 2:
                    System.out.println("Enter Employee Id: ");
                    employeeID = sc.next();
                    System.out.println("Enter Age: ");
                    age = sc.next();
                    System.out.println("Enter First Name: ");
                    firstName = sc.next();
                    System.out.println("Enter last Name: ");
                    lastName = sc.next();
                    InsertRecord(employeeID, age, firstName, lastName);
                
                case 3:
                    System.out.println("Enter Employee ID to Edit: ");
                    employeeID = sc.next();
                    System.out.println("Enter New First name: ");
                    firstName = sc.next();
                    System.out.println("Enter New Last name: ");
                    lastName = sc.next();
                    System.out.println("Enter New Age: ");
                    age = sc.next();
                    UpdateRecord(employeeID, age, firstName, lastName);
                
                case 4:
                    System.out.println("Enter id of employee to delete: ");
                    employeeID = sc.next();
                    DeleteRecord(employeeID);
            }
        }while(ch!=5);
    }

    public static DBObject convert(EmployeeObj newObject){
        return new
        BasicDBObject("employeeID",newObject.getEmployeeID()).append("firstName",newObject.getFirstName()).append("lastName",newObject.getLastName()).append("age",newObject.getAge());
    }
}
public class EmployeeObj{
    private String employeeID="";
    private String firstName="";
    private String lastName="";
    private String age="";

    public EmployeeObj(){
    }

    public String getEmployeeID(){
        return employeeID;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getAge(){
        return age;
    }

    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(String age){
        this.age = age;
    }
}

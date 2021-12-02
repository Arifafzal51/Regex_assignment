import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class data
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        String phone[]=new String[5],email[]=new String[5];
        Scanner sc=new Scanner(System.in);
        Class.forName("com.mysql.cj");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/e2_data","root","");


    }



}

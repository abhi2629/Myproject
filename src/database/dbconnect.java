package database;

import java.sql.*;
import javax.swing.JOptionPane;

public class dbconnect {
     
    public static  Connection c;
    public static  Statement st;
    public static PreparedStatement insertUser;
    public static PreparedStatement getUser;
    public static PreparedStatement updateUser;
    public static PreparedStatement insertAdmin;
    public static PreparedStatement deleteUser;
    public static PreparedStatement allaccount,getid;

    static{
        
        try{
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/coconut_bank","root","incapp");
                st= c.createStatement();
                
                insertUser = c.prepareStatement("insert into customer_accounts (ACCOUNT_NUMBER,CURRENT_DA,NAME_OF,DATE_OF_BIRTH,PHONE_NUMBER,ADDRESS,STATE,COUNTRY,OCCUPATION,AADHAR_NUMBER,GENDER,MARITAL_STATUS,MOTHER_NAME,FATHER_NAME,BALANCE,NOMINEE) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
                
                getUser = c.prepareStatement("select * from customer_accounts where ACCOUNT_NUMBER = ? ");
                
                getid = c.prepareStatement("select * from customer_accounts order by ACCOUNT_NUMBER desc limit 1 ");
                
                updateUser = c.prepareStatement("update customer_accounts set NAME_OF=?,DATE_OF_BIRTH=?,PHONE_NUMBER=?,ADDRESS=?,STATE=?,COUNTRY=?,OCCUPATION=?,AADHAR_NUMBER=?,GENDER=?,MARITAL_STATUS=?,MOTHER_NAME=?,FATHER_NAME=?,NOMINEE=? where ACCOUNT_NUMBER = ? ");
                
                insertAdmin = c.prepareStatement("insert into admin_login (username,password,name) values(?,?,?) ");
                
                deleteUser = c.prepareStatement("delete from customer_accounts where ACCOUNT_NUMBER = ? ");
                
                 allaccount=c.prepareStatement("select * from customer_accounts");
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
    }
}

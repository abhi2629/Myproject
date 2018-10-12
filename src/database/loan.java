package database;

import java.sql.*;
import javax.swing.JOptionPane;

public class loan extends dbconnect {
    public static PreparedStatement insertLoanAccount;
    public static PreparedStatement allloanaccount;
    static{
       try{
            insertLoanAccount =c.prepareStatement("insert into loan_accounts (account_number,loan_account_number,date,fmdl_account_number,company,salary,loan_type,loan_amount,rate_of_interest,no_of_installment,monthly_installment,total_amount) values(?,?,?,?,?,?,?,?,?,?,?,?) ");
             
             allloanaccount=c.prepareStatement("select * from loan_accounts");
       }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}

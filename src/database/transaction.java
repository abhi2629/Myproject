package database;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class transaction extends dbconnect{
    public static PreparedStatement insertTransaction;
    public static PreparedStatement tableTransaction;
    public static PreparedStatement insertLoanTransaction,loanTransaction;
   static{
       try{
            insertTransaction =c.prepareStatement("insert into transaction (account_number,customer_name,transaction_date,transaction_type,transaction_mode,transaction_amount,old_balance,final_balance) values(?,?,?,?,?,?,?,?) ");
             tableTransaction =c.prepareStatement("select * from transaction");
             insertLoanTransaction =c.prepareStatement("insert into loan_transaction (Loan_Account_Number,FMDL_ACCOUNT_NUMBER,DATE,MODE,AMOUNT,REMAINING_AMOUNT) values(?,?,?,?,?,?) ");
             loanTransaction = c.prepareStatement("select * from loan_transaction");
       }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

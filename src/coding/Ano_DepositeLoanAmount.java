/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ABHISHEK 
 */
public class Ano_DepositeLoanAmount extends javax.swing.JFrame {

    /**
     * Creates new form DepositeLoanAmount
     */
    public Ano_DepositeLoanAmount() {
        initComponents();
        this.setLocationRelativeTo(this);
        try{
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    java.util.Date sdate=sdf.parse(sdf.format(new java.util.Date()));
                    cd .setDate(sdate);
                    cd.setSelectableDateRange(new java.util.Date(),new java.util.Date());
    }catch(Exception e){
       l1.setText("Problem in Date");
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        fmdl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nn = new javax.swing.JButton();
        amou1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        amo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cd = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ACCOUNT TRANSFER LOAN DEPOSITE");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("*Loan Account Number :");

        lan.setBackground(new java.awt.Color(153, 255, 204));
        lan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lan.setForeground(new java.awt.Color(0, 0, 204));
        lan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lanMouseClicked(evt);
            }
        });
        lan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("GENERATE DETAILS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("*REMAINING AMOUNT");

        fmdl.setBackground(new java.awt.Color(204, 255, 204));
        fmdl.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        fmdl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fmdl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fmdlMouseClicked(evt);
            }
        });
        fmdl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmdlActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("*FMDL ACCOUNT NUMBER ");

        nn.setBackground(new java.awt.Color(255, 51, 51));
        nn.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        nn.setText("SAVE TRANSACTION");
        nn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nnActionPerformed(evt);
            }
        });

        amou1.setBackground(new java.awt.Color(204, 255, 204));
        amou1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        amou1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amou1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amou1MouseClicked(evt);
            }
        });
        amou1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amou1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("*AMOUNT");

        amo.setBackground(new java.awt.Color(204, 255, 204));
        amo.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        amo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amoMouseClicked(evt);
            }
        });
        amo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amoActionPerformed(evt);
            }
        });
        amo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amoKeyTyped(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("clear");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("check");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        l2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(0, 153, 153));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        l1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 153, 153));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DEPOSITE LOAN AMOUNT");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("*DATE :");

        cd.setBackground(new java.awt.Color(204, 255, 204));
        cd.setForeground(new java.awt.Color(255, 51, 102));
        cd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fmdl, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cd, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(amo, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(amou1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lan, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(11, 11, 11)))
                .addContainerGap())
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {amo, amou1, fmdl});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lan)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fmdl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(amo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(amou1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {amo, amou1, fmdl});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanActionPerformed
try{
        if(!lan.getText().equals("")){
         long LOAN_ACCOUNT_NUMBER =Long.parseLong(lan.getText());
         String gu=lan.getText();
            try {
                ResultSet rs= database.loan.st.executeQuery("select fmdl_account_number, monthly_installment,total_amount from loan_accounts where loan_account_number ='"+gu+"' ");
                if(rs.next()){
                        long fmdll=Long.parseLong(rs.getString(1));
                        float amount=Float.parseFloat(rs.getString(2));
                        float t_amount=Float.parseFloat(rs.getString(3));
                        fmdl.setText(String.valueOf(fmdll));
                        amo.setText(String.valueOf(amount));
                        float ffff=t_amount-amount;
                        String dd=String.valueOf(ffff);
                        amou1.setText(dd);
                        
                }else
                    l1.setText("Please check Loan Account Number !!");
            } catch (SQLException ex) {
                 l1.setText("Error While Communicating To Database!");
            }
         
        }else
            l1.setText("Provide Loan Account Number First !");
}catch(Exception e){
       l1.setText("Please Enter The Loan Account Number In Number Format!!");
}
    }//GEN-LAST:event_lanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
        if(!lan.getText().equals("")){
         long LOAN_ACCOUNT_NUMBER =Long.parseLong(lan.getText());
         String gu=lan.getText();
            try {
                ResultSet rs= database.loan.st.executeQuery("select fmdl_account_number, monthly_installment,total_amount from loan_accounts where loan_account_number ='"+gu+"' ");
                if(rs.next()){
                        long fmdll=Long.parseLong(rs.getString(1));
                        float amount=Float.parseFloat(rs.getString(2));
                        float t_amount=Float.parseFloat(rs.getString(3));
                        fmdl.setText(String.valueOf(fmdll));
                        amo.setText(String.valueOf(amount));
                        float ffff=t_amount-amount;
                        String dd=String.valueOf(ffff);
                        amou1.setText(dd);
                        
                }else
                    l1.setText("Please check Loan Account Number !!");
            } catch (SQLException ex) {
                 l1.setText("Error While Communicating To Database!");
            }
         
        }else
            l1.setText("Provide Loan Account Number First !");
}catch(Exception e){
       l1.setText("Please Enter The Loan Account Number In Number Format!!");
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fmdlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmdlActionPerformed
      
    }//GEN-LAST:event_fmdlActionPerformed

    private void nnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nnActionPerformed
l1.setText(null);
l2.setText(null);
        if(!lan.getText().equals("")){
        if(!fmdl.getText().equals("")&&!amo.getText().equals("")&&!amou1.getText().equals("")&&cd != null){
            int gg=JOptionPane.showConfirmDialog(this, "Deposite Money ? ", "Loan Amount Money Deposite Conformation ", JOptionPane.YES_NO_OPTION);
                        if(gg == JOptionPane.YES_OPTION){
                            
                    try{
                        database.loan.c.setAutoCommit(false);
                            String gu=lan.getText();
                            float d3=Float.parseFloat(amo.getText());
                            float d33=Float.parseFloat(amou1.getText());
                            ResultSet rs = database.dbconnect.st.executeQuery("select total_amount from loan_accounts where loan_account_number ='"+gu+"' ");
                            if(rs.next()){
                            float d1=rs.getFloat(1);
                            if(d1 != 0){    
                                 d1=d1-d3;
                                int fff=database.loan.st.executeUpdate("update loan_accounts set total_amount = '"+d1+"'  where loan_account_number = '"+gu+"' ");
                                                                                        
                                                                                        database.transaction.insertLoanTransaction.setLong(1, Long.parseLong(lan.getText()));
                                                                                        database.transaction.insertLoanTransaction.setString(2,fmdl.getText());

                                                                                        java.sql.Date jsd=new java.sql.Date(cd.getDate().getTime());
                                                                                        database.transaction.insertLoanTransaction.setDate(3, jsd);

                                                                                        database.transaction.insertLoanTransaction.setString(4, "---------");

                                                                                        database.transaction.insertLoanTransaction.setFloat(5, d3);
                                                                                        database.transaction.insertLoanTransaction.setFloat(6, d33);
                                                                                        
                                                                                        int bh=database.transaction.insertLoanTransaction.executeUpdate();

                                                                                               if(bh !=0){
                                                                                                       System.out.println("success !");
                                                                                               }
                                                                                               else
                                                                                                   System.out.println("Error !");
                                                                                               
                                String gou=fmdl.getText();
                            ResultSet ras = database.dbconnect.st.executeQuery("select BALANCE,NAME_OF from customer_accounts where ACCOUNT_NUMBER ='"+gou+"' ");
                                if(ras.next()){
                                    
                                float d2 = ras.getFloat(1);
                                String djksfnsd=ras.getString(2);
                                float sdjfh=d2;
                                d2=d2-d3;
                                int ff=database.loan.st.executeUpdate("update customer_accounts set BALANCE = '"+d2+"'  where ACCOUNT_NUMBER = '"+gou+"' ");
                                                                        database.transaction.insertTransaction.setLong(1, Long.parseLong(gou));
                                                                        database.transaction.insertTransaction.setString(2, djksfnsd);

                                                                        java.sql.Date jsdd=new java.sql.Date(cd.getDate().getTime());
                                                                        database.transaction.insertTransaction.setDate(3, jsdd);

                                                                        database.transaction.insertTransaction.setString(4, "Loan-Tra-Deduction");

                                                                        database.transaction.insertTransaction.setString(5, "-----------");

                                                                        database.transaction.insertTransaction.setFloat(6, d3);
                                                                        database.transaction.insertTransaction.setFloat(7, sdjfh);
                                                                        database.transaction.insertTransaction.setFloat(8, d2);
                                                                        database.transaction.insertTransaction.executeUpdate();
                                                   
                                                      if(d1 >=0 ){
                                                            if( d2 >=0){
                                                            l1.setText("**Money Deposited");
                                                            database.loan.c.commit();
                                                            }
                                                            else{
                                                            l1.setText("**Balance Is Low !");
                                                            database.loan.c.rollback();
                                                            }
                                                    }else{
                                                        l1.setForeground(java.awt.Color.RED);
                                                            l1.setText("**Deposite Amount Exceeded !");
                                                            database.loan.c.rollback();
                                                    }
                            }else{
                                l1.setText("**Kuch to gadbad hai with FMDL account !");
                                }
                    }else{
                        l1.setForeground(java.awt.Color.RED);
                        l1.setText("ALL LOAN AMMOUNT ALLREADY DEPOSITED .");
                        l2.setForeground(java.awt.Color.RED);
                        l2.setText("ALL LOAN AMMOUNT ALLREADY DEPOSITED .");
                         }
                    }else
                        l1.setText("Problem with Loan Account Number !");
                    }catch(Exception e){
                        l1.setText(""+e);
                    }
                    }
        }else
            l1.setText("Fill up all the Details Correctly !");
}else
    l1.setText("Please provide the Loan Account Number First !");
    }//GEN-LAST:event_nnActionPerformed

    private void amou1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amou1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amou1ActionPerformed

    private void amoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amoActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
l1.setText(null);
l2.setText(null);        
        fmdl.setText("");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
l1.setText(null);
l2.setText(null);    
       String s3= fmdl.getText();
        if(!s3.equals("")){
                
            try {
                ResultSet rs=database.loan.st.executeQuery("select account_number from customer_accounts where account_number = '"+s3+"' ");
                    if(rs.next()){
                        long ACCOUNT_NUMBER = Long.parseLong(s3);
                        long vv=rs.getLong(1);
                        
                                if(vv == ACCOUNT_NUMBER){
                                    l1.setText("**"+ACCOUNT_NUMBER+" is Availabe !" );
                                }
                            }
                                else
                                     l1.setText("**"+s3+" is Unavailabe !");
            } catch (Exception ex) {
               l2.setText("**Error While Communicating To Database !");
            }
        }else{
            l1.setText("**Please provide the Account Number !");
            fmdl.requestFocusInWindow();
        }       
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void amoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amoKeyReleased
        if(!amo.getText().equals("")){    
        try{
                                String gu=lan.getText();
                                float d3=Float.parseFloat(amo.getText());
                                ResultSet rs = database.dbconnect.st.executeQuery("select total_amount from loan_accounts where loan_account_number ='"+gu+"' ");
                                if(rs.next()){
                                float d1=rs.getFloat(1);
                                if(d1 != 0){    
                                     d1=d1-d3;
                                        if(d1>= 0){
                                        amou1.setText(String.valueOf(d1));
                                        }  
                                        else{
                                            amou1.setText("");
                                            l1.setForeground(java.awt.Color.RED);
                                            l1.setText("**Deposite Amount Exceeded !");
                                       }
                                     }
                                else{
                                    l2.setForeground(java.awt.Color.RED);
                                    l2.setText("ALL LOAN AMMOUNT ALLREADY DEPOSITED .");
                                }
                                }
            }catch(Exception e){
                                System.out.println("error "+e);
                                }
                            
        }else
            l1.setText("Please provide the Amount!");
    }//GEN-LAST:event_amoKeyReleased

    private void amoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amoKeyTyped
        
    }//GEN-LAST:event_amoKeyTyped

    private void amoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amoMouseClicked
l1.setText(null);
l2.setText(null);        
    }//GEN-LAST:event_amoMouseClicked

    private void fmdlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fmdlMouseClicked
l1.setText(null);
l2.setText(null);       
    }//GEN-LAST:event_fmdlMouseClicked

    private void amou1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amou1MouseClicked
l1.setText(null);
l2.setText(null);       
    }//GEN-LAST:event_amou1MouseClicked

    private void lanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lanMouseClicked
        l1.setText(null);
        l2.setText(null);        
    }//GEN-LAST:event_lanMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ano_DepositeLoanAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ano_DepositeLoanAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ano_DepositeLoanAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ano_DepositeLoanAmount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ano_DepositeLoanAmount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amo;
    private javax.swing.JTextField amou1;
    private com.toedter.calendar.JDateChooser cd;
    private javax.swing.JTextField fmdl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField lan;
    private javax.swing.JButton nn;
    // End of variables declaration//GEN-END:variables
}

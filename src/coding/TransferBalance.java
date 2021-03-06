/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ABHISHEK 
 */
public class TransferBalance extends javax.swing.JFrame {

    /**
     * Creates new form TransferBalance
     */
    public TransferBalance() {
        initComponents();
        this.setLocationRelativeTo(null);
               try{
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    java.util.Date sdate=sdf.parse(sdf.format(new java.util.Date()));
                    dofb .setDate(sdate);
                    dofb.setSelectableDateRange(new java.util.Date(),new java.util.Date());
    }catch(Exception e){
       jjjj.setText("Problem in Date");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        an = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adhr = new javax.swing.JTextField();
        na = new javax.swing.JTextField();
        dacn = new javax.swing.JTextField();
        bal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        amou = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        nn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jjjj = new javax.swing.JLabel();
        dofb = new com.toedter.calendar.JDateChooser();
        ml = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transfer Money");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 51, 255));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BALANCE TRANSFER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("**Desired Account Number :");

        an.setBackground(new java.awt.Color(153, 255, 204));
        an.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        an.setForeground(new java.awt.Color(0, 0, 204));
        an.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anMouseClicked(evt);
            }
        });
        an.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("GENERATE DETAILS");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("*DATE :");

        jLabel4.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("*AADHAR NUMBER :");

        jLabel5.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("*CUSTOMER NAME :");

        jLabel6.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("*PREVIOUS BALANCE :");

        adhr.setBackground(new java.awt.Color(204, 255, 204));
        adhr.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        adhr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adhrMouseClicked(evt);
            }
        });

        na.setBackground(new java.awt.Color(204, 255, 204));
        na.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        na.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                naMouseClicked(evt);
            }
        });
        na.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naActionPerformed(evt);
            }
        });

        dacn.setBackground(new java.awt.Color(204, 255, 204));
        dacn.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        dacn.setForeground(new java.awt.Color(255, 0, 0));
        dacn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dacnMouseClicked(evt);
            }
        });
        dacn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dacnActionPerformed(evt);
            }
        });

        bal.setBackground(new java.awt.Color(204, 255, 204));
        bal.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        bal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                balMouseClicked(evt);
            }
        });
        bal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("*AMOUNT");

        amou.setBackground(new java.awt.Color(204, 255, 204));
        amou.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        amou.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amouMouseClicked(evt);
            }
        });
        amou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amouActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("*DESTINATION ACCOUNT");

        jButton2.setBackground(new java.awt.Color(153, 0, 153));
        jButton2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jButton2.setText("REFRESH FIELDS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        nn.setBackground(new java.awt.Color(255, 51, 51));
        nn.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        nn.setText("SAVE TRANSACTION");
        nn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nnActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Check Availability");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jjjj.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jjjj.setForeground(new java.awt.Color(255, 255, 51));
        jjjj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        dofb.setBackground(new java.awt.Color(204, 255, 204));
        dofb.setForeground(new java.awt.Color(255, 51, 102));
        dofb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        ml.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        ml.setForeground(new java.awt.Color(255, 255, 0));
        ml.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bal, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                .addComponent(na)
                                .addComponent(adhr))
                            .addComponent(dofb, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(93, 93, 93)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amou, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(dacn, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
            .addComponent(jjjj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(nn)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(an, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ml, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jjjj, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(an, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(amou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(dacn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dofb, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(na, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(adhr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(nn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(ml, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adhr, amou, na});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {an, bal});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void naActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naActionPerformed

    private void dacnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dacnActionPerformed
        String s3= dacn.getText();
        if(!s3.equals("")){
                
            try {
                ResultSet rs=database.dbconnect.st.executeQuery("select ACCOUNT_NUMBER from customer_accounts where ACCOUNT_NUMBER = '"+s3+"' ");
                    if(rs.next()){
                        String s4=rs.getString(1);
                                if(s3.equals(s4)){
                                     jjjj.setText("** "+s4+" is availabe !");
                                     nn.requestFocusInWindow();
                                }
                                else
                                    jjjj.setText("** "+s3+" is Unavailabe !" );
                }
            } catch (Exception ex) {
               jjjj.setText("** Error While Communicating To Database !");
            }
        }else{
            jjjj.setText("** Please provide the Account Number !");
            an.requestFocusInWindow();
        }
 
    }//GEN-LAST:event_dacnActionPerformed

    private void balActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     an.setText("");
        dofb.setDate(null);
        adhr.setText("");
        na.setText("");
        bal.setText("");
        amou.setText("");
        an.setText("");
        jjjj.setText("");
        ml.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void anActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anActionPerformed
       
        if(!an.getText().equals("")){
        try{
            
                long ACCU=Long.parseLong(an.getText());
                
                database.dbconnect.getUser.setLong(1, ACCU);
                ResultSet rs=database.dbconnect.getUser.executeQuery();
                 
                if(rs.next()){
                        
                    na.setText(rs.getString(3));
                    
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    java.util.Date sdate=sdf.parse(sdf.format(new java.util.Date()));
                    
                    dofb .setDate(sdate);
                    adhr.setText(rs.getString(10));
                    bal.setText(rs.getString(15));
                    amou.requestFocusInWindow();
                }else{
                    jjjj.setText("* Invalid Account !");
                }
        }catch(Exception e){
                    jjjj.setText("* Please Enter Account Number In Number Format!");
        }
        }
        else{
                    jjjj.setText("* Please Enter the Account number !");
                    an.requestFocusInWindow();
        }
    }//GEN-LAST:event_anActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(!an.getText().equals("")){
        try{
            
                long ACCU=Long.parseLong(an.getText());
                
                database.dbconnect.getUser.setLong(1, ACCU);
                ResultSet rs=database.dbconnect.getUser.executeQuery();
                 
                if(rs.next()){
                        
                    na.setText(rs.getString(3));
                    
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    java.util.Date sdate=sdf.parse(sdf.format(new java.util.Date()));
                    
                    dofb .setDate(sdate);
                    adhr.setText(rs.getString(10));
                    bal.setText(rs.getString(15));
                    amou.requestFocusInWindow();
                }else{
                    jjjj.setText("* Invalid Account !");
                }
        }catch(Exception e){
                    jjjj.setText("* Please Enter Account Number In Number Format!");
        }
        }
        else{
                    jjjj.setText("* Please Enter the Account number !");
                    an.requestFocusInWindow();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String s3= dacn.getText();
        if(!s3.equals("")){
                
            try {
                ResultSet rs=database.dbconnect.st.executeQuery("select ACCOUNT_NUMBER from customer_accounts where ACCOUNT_NUMBER = '"+s3+"' ");
                    if(rs.next()){
                        String s4=rs.getString(1);
                                if(s3.equals(s4)){
                                     jjjj.setText("** "+s4+" is availabe !");
                                     nn.requestFocusInWindow();
                                }
                                
                }else
                                    jjjj.setText("** "+s3+" is Unavailabe !" );
            } catch (Exception ex) {
               jjjj.setText("** Error While Communicating To Database !");
            }
        }else{
            jjjj.setText("** Please provide the Account Number !");
            an.requestFocusInWindow();
        }
 
 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void amouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amouActionPerformed
            dacn.requestFocusInWindow();
    }//GEN-LAST:event_amouActionPerformed

    private void anMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anMouseClicked
        jjjj.setText(null);
        ml.setText(null);
    }//GEN-LAST:event_anMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    }//GEN-LAST:event_jButton1MouseClicked

    private void adhrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adhrMouseClicked
        jjjj.setText(null);
        ml.setText(null);
    }//GEN-LAST:event_adhrMouseClicked

    private void naMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_naMouseClicked
        jjjj.setText(null);
        ml.setText(null);
    }//GEN-LAST:event_naMouseClicked

    private void balMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balMouseClicked
        jjjj.setText(null);
        ml.setText(null);
    }//GEN-LAST:event_balMouseClicked

    private void amouMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amouMouseClicked
        jjjj.setText(null);
        ml.setText(null);
    }//GEN-LAST:event_amouMouseClicked

    private void dacnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dacnMouseClicked
        jjjj.setText(null);
        ml.setText(null);
       
    }//GEN-LAST:event_dacnMouseClicked

    private void nnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nnActionPerformed
        try{
            long nipo=Long.parseLong(dacn.getText());
            long ACCU=Long.parseLong(an.getText());
            if(ACCU !=0 ){

                if(!an.equals("")&&dofb != null&&!adhr.equals("")&&!na.equals("")&&!bal.equals("")){

                    String guu=amou.getText();
                    try{
                        if(!guu.equals("")){
                            long xy = Long.parseLong(guu);
                            if(xy != 0){
                                int ko=JOptionPane.showConfirmDialog(this, "Transfer Money ?", "Transfer Conformation !", JOptionPane.YES_NO_OPTION);
                                if(ko==JOptionPane.YES_OPTION){
                                    database.dbconnect.c.setAutoCommit(false);
                                    ResultSet rvs = database.dbconnect.st.executeQuery("select BALANCE from  customer_accounts where ACCOUNT_NUMBER = '"+ACCU+"' ");
                                    if(rvs.next()){
                                        long xc=rvs.getLong(1);
                                        long vvvv=xc;
                                        ResultSet rjs =database.dbconnect.st.executeQuery("select BALANCE,NAME_OF from  customer_accounts where ACCOUNT_NUMBER = '"+nipo+"' ");

                                        if(rjs.next()){
                                            long hu=rjs.getInt(1);
                                            String huu=rjs.getString(2);
                                            long tttt=hu;
                                            xc = xc-xy;
                                            int j1=database.dbconnect.st.executeUpdate("update customer_accounts set BALANCE = '"+xc+"'  where ACCOUNT_NUMBER = '"+ACCU+"' ");

                                            //trasaction 1
                                            database.transaction.insertTransaction.setLong(1, ACCU);
                                            database.transaction.insertTransaction.setString(2, na.getText());

                                            java.sql.Date jsd=new java.sql.Date(dofb.getDate().getTime());
                                            database.transaction.insertTransaction.setDate(3, jsd);

                                            database.transaction.insertTransaction.setString(4, "Tra-Deduction");

                                            database.transaction.insertTransaction.setString(5, "-----------");

                                            database.transaction.insertTransaction.setLong(6, xy);
                                            database.transaction.insertTransaction.setLong(7, vvvv);
                                            database.transaction.insertTransaction.setLong(8, xc);
                                            database.transaction.insertTransaction.executeUpdate();

                                            hu=hu+xy;
                                            int j2=database.dbconnect.st.executeUpdate("update customer_accounts set BALANCE = '"+hu+"'  where ACCOUNT_NUMBER = '"+nipo+"' ");

                                            //transaction 2
                                            database.transaction.insertTransaction.setLong(1, nipo);
                                            database.transaction.insertTransaction.setString(2, huu);

                                            java.sql.Date jasd=new java.sql.Date(dofb.getDate().getTime());
                                            database.transaction.insertTransaction.setDate(3, jasd);

                                            database.transaction.insertTransaction.setString(4, "Tra-Deposite");

                                            database.transaction.insertTransaction.setString(5, "-----------");

                                            database.transaction.insertTransaction.setLong(6, xy);
                                            database.transaction.insertTransaction.setLong(7,tttt);
                                            database.transaction.insertTransaction.setLong(8, hu);
                                            database.transaction.insertTransaction.executeUpdate();

                                            if(xc > 0 && hu >0){
                                                jjjj.setText("* Money Deducted !,Now Available Money :"+xc);
                                                ml.setText("* Money Recieved !,Now Available Money :"+hu);
                                                database.dbconnect.c.commit();
                                                amou.setText("");
                                                dacn.setText("");
                                            }
                                            else
                                            jjjj.setText("*Your Balance Is Low !, Transaction Declined !");
                                            database.dbconnect.c.rollback();
                                        }
                                    }
                                }
                            }else
                            jjjj.setText("* Please Enter The Valid Amount !");

                        }
                        else
                        jjjj.setText("* Please Enter the Ammount to be Deposited. ");
                    }
                    catch(Exception e){
                        jjjj.setText("*Error While Connecting DataBase !");
                    }
                }
                else
                jjjj.setText("* Please Enter All The Details Correctly !");

            }else
            {
                jjjj.setText("* Please Enter The Valid Account Number !");
            }
        }
        catch(Exception e){
            jjjj.setText("* Please Enter The Valid Account Number !");
        }
    }//GEN-LAST:event_nnActionPerformed

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
            java.util.logging.Logger.getLogger(TransferBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferBalance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adhr;
    private javax.swing.JTextField amou;
    private javax.swing.JTextField an;
    private javax.swing.JTextField bal;
    private javax.swing.JTextField dacn;
    private com.toedter.calendar.JDateChooser dofb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jjjj;
    private javax.swing.JLabel ml;
    private javax.swing.JTextField na;
    private javax.swing.JButton nn;
    // End of variables declaration//GEN-END:variables
}

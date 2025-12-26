package calculator;




public class calculator1 extends javax.swing.JPanel {

  
    public calculator1() {
        initComponents();
       
     
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnPow = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        textResultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNum2 = new javax.swing.JTextField();
        textNum1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 102, 102));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnSuma.setBackground(new java.awt.Color(153, 153, 153));
        btnSuma.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(0, 0, 0));
        btnSuma.setText("Sum");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setBackground(new java.awt.Color(153, 153, 153));
        btnResta.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnResta.setForeground(new java.awt.Color(0, 0, 0));
        btnResta.setText("Sub");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnDivision.setBackground(new java.awt.Color(153, 153, 153));
        btnDivision.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(0, 0, 0));
        btnDivision.setText("Div");
        btnDivision.setBorderPainted(false);
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnMultiplicacion.setBackground(new java.awt.Color(153, 153, 153));
        btnMultiplicacion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(0, 0, 0));
        btnMultiplicacion.setText("Mult");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnPow.setBackground(new java.awt.Color(153, 153, 153));
        btnPow.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnPow.setForeground(new java.awt.Color(0, 0, 0));
        btnPow.setText("Pow");
        btnPow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowActionPerformed(evt);
            }
        });

        btnSqrt.setBackground(new java.awt.Color(153, 153, 153));
        btnSqrt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnSqrt.setForeground(new java.awt.Color(0, 0, 0));
        btnSqrt.setText("Sqrt");
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSuma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPow, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 410, 180));

        textResultado.setBackground(new java.awt.Color(204, 204, 204));
        textResultado.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        textResultado.setForeground(new java.awt.Color(0, 0, 0));
        textResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textResultadoActionPerformed(evt);
            }
        });
        add(textResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 300, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MY CACULATOR ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 310, 40));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter an amount: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 30));

        textNum2.setBackground(new java.awt.Color(51, 51, 51));
        textNum2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        textNum2.setForeground(new java.awt.Color(255, 255, 255));
        textNum2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        textNum2.setCaretColor(new java.awt.Color(51, 51, 51));
        textNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNum2ActionPerformed(evt);
            }
        });
        add(textNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 410, 50));

        textNum1.setBackground(new java.awt.Color(51, 51, 51));
        textNum1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        textNum1.setForeground(new java.awt.Color(255, 255, 255));
        textNum1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        textNum1.setCaretColor(new java.awt.Color(51, 51, 51));
        textNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNum1ActionPerformed(evt);
            }
        });
        add(textNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 410, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
       
        int num1 = Integer.parseInt(textNum1.getText());
        int num2 = Integer.parseInt(textNum2.getText());
        
        int suma = num1 + num2;
        textResultado.setText(String.valueOf(suma));
        
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed

        int num1 = Integer.parseInt(textNum1.getText());
        int num2 = Integer.parseInt(textNum2.getText());
        
        int resta = num1 - num2;
        textResultado.setText(String.valueOf(resta));
    }//GEN-LAST:event_btnRestaActionPerformed

    private void textResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textResultadoActionPerformed
       
  
    }//GEN-LAST:event_textResultadoActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
       
        int num1 = Integer.parseInt(textNum1.getText());
        int num2 = Integer.parseInt(textNum2.getText());
        
        
        int div = (num1 / num2);
        
          textResultado.setText(String.valueOf(div));
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        int num1 = Integer.parseInt(textNum1.getText());
        int num2 = Integer.parseInt(textNum2.getText());
        
        int multi = num1 * num2;
        
         textResultado.setText(String.valueOf(multi));
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnPowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowActionPerformed
       
       int base = Integer.parseInt(textNum1.getText());
        int exponente = Integer.parseInt(textNum2.getText());
        
        int pow = (int) Math.pow(base, exponente);
        
        textResultado.setText(String.valueOf(pow));
    }//GEN-LAST:event_btnPowActionPerformed

    private void textNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNum1ActionPerformed
        
    }//GEN-LAST:event_textNum1ActionPerformed

    private void textNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNum2ActionPerformed
   
    }//GEN-LAST:event_textNum2ActionPerformed

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
         
        double num = Double.parseDouble(textNum1.getText());
            
            double resultado = Math.sqrt(num);
            
            textResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btnSqrtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPow;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textNum1;
    private javax.swing.JTextField textNum2;
    private javax.swing.JTextField textResultado;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setTitle(String calculator) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setResizable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

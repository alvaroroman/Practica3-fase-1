/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpractico1.pkg0;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Alvaro
 */
public class Practica3fase1 extends javax.swing.JFrame {
    Random generadorNum = new Random();
    int letraVariable;
    String letras = "";
    int resultado;
    int aciertos = 0;
    /**
     * Creates new form Practica3fase1
     */
    public Practica3fase1() {
        initComponents();
        jToggleButton1.setEnabled(false);
        jToggleButton2.setEnabled(false);
        jToggleButton3.setEnabled(false);
        jToggleButton4.setEnabled(false);
        jToggleButton5.setEnabled(false);
        jToggleButton6.setEnabled(false);
        jToggleButton7.setEnabled(false);
        jToggleButton8.setEnabled(false);
        jToggleButton9.setEnabled(false);
        jToggleButton10.setEnabled(false);
        jToggleButton11.setEnabled(false);
        jToggleButton12.setEnabled(false);
        jToggleButton13.setEnabled(false);
        jToggleButton14.setEnabled(false);
        jToggleButton15.setEnabled(false);
        jToggleButton16.setEnabled(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        jToggleButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Z.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton4))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToggleButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton8))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToggleButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton12))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToggleButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton4)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton5)
                    .addComponent(jToggleButton6)
                    .addComponent(jToggleButton7)
                    .addComponent(jToggleButton8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton9)
                    .addComponent(jToggleButton10)
                    .addComponent(jToggleButton11)
                    .addComponent(jToggleButton12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton13)
                    .addComponent(jToggleButton14)
                    .addComponent(jToggleButton15)
                    .addComponent(jToggleButton16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Empezar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Recordar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Comprobar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Aciertos");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel5))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jToggleButton1.setEnabled(false);
        jToggleButton2.setEnabled(false);
        jToggleButton3.setEnabled(false);
        jToggleButton4.setEnabled(false);
        jToggleButton5.setEnabled(false);
        jToggleButton6.setEnabled(false);
        jToggleButton7.setEnabled(false);
        jToggleButton8.setEnabled(false);
        jToggleButton9.setEnabled(false);
        jToggleButton10.setEnabled(false);
        jToggleButton11.setEnabled(false);
        jToggleButton12.setEnabled(false);
        jToggleButton13.setEnabled(false);
        jToggleButton14.setEnabled(false);
        jToggleButton15.setEnabled(false);
        jToggleButton16.setEnabled(false);
        
        letras = "";
        
        for(int contador = 0; contador < 4; contador++){
          letraVariable = generadorNum.nextInt(16) + 65;
          letras += (char)letraVariable;
      }
        try {
            jLabel1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+letras.charAt(0)+".png"))));
            jLabel2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+letras.charAt(1)+".png"))));
            jLabel3.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+letras.charAt(2)+".png"))));
            jLabel4.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+letras.charAt(3)+".png"))));
        } catch (IOException ex) {
            Logger.getLogger(Practica3fase1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jToggleButton1.setEnabled(true);
        jToggleButton2.setEnabled(true);
        jToggleButton3.setEnabled(true);
        jToggleButton4.setEnabled(true);
        jToggleButton5.setEnabled(true);
        jToggleButton6.setEnabled(true);
        jToggleButton7.setEnabled(true);
        jToggleButton8.setEnabled(true);
        jToggleButton9.setEnabled(true);
        jToggleButton10.setEnabled(true);
        jToggleButton11.setEnabled(true);
        jToggleButton12.setEnabled(true);
        jToggleButton13.setEnabled(true);
        jToggleButton14.setEnabled(true);
        jToggleButton15.setEnabled(true);
        jToggleButton16.setEnabled(true);
        
        try {
            jLabel1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)'Z'+".png"))));
            jLabel2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)'Z'+".png"))));
            jLabel3.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)'Z'+".png"))));
            jLabel4.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)'Z'+".png"))));
        } catch (IOException ex) {
            Logger.getLogger(Practica3fase1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            jToggleButton1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton3.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton4.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton5.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton6.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton7.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton8.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton9.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton10.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton11.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton12.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton13.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton14.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton15.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            jToggleButton16.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("/imagenes/"+(char)(generadorNum.nextInt(16) + 65)+".png"))));
            
        } catch (IOException ex) {
            Logger.getLogger(Practica3fase1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if(String.valueOf(jToggleButton1) == letras){
            jToggleButton1.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton1.setEnabled(false);
        }
        //        Icon icono = jToggleButton1.getIcon();
//        Icon icono2 = jLabel1.getIcon();
//        
//        if(icono == icono2){
//            aciertos++;
//        }else{
//            jToggleButton1.setEnabled(false);
//        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(String.valueOf(jToggleButton1) == String.valueOf(letras.charAt(0))){
            jToggleButton1.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton1.setEnabled(false);
        }
        if(String.valueOf(jToggleButton2) == String.valueOf(letras.charAt(0))){
            jToggleButton2.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton2.setEnabled(false);
        }
        if(String.valueOf(jToggleButton3) == String.valueOf(letras.charAt(0))){
            aciertos++;
        }else{
            jToggleButton3.setEnabled(false);
        }
        if(String.valueOf(jToggleButton4) == String.valueOf(letras.charAt(0))){
            jToggleButton4.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton4.setEnabled(false);
        }
        if(String.valueOf(jToggleButton5) == String.valueOf(letras.charAt(0))){
            jToggleButton5.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton5.setEnabled(false);
        }
        if(String.valueOf(jToggleButton6) == String.valueOf(letras.charAt(0))){
            jToggleButton6.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton6.setEnabled(false);
        }
        if(String.valueOf(jToggleButton7) == String.valueOf(letras.charAt(0))){
            jToggleButton7.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton7.setEnabled(false);
        }
        if(String.valueOf(jToggleButton8) == String.valueOf(letras.charAt(0))){
            jToggleButton8.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton8.setEnabled(false);
        }
        if(String.valueOf(jToggleButton9) == String.valueOf(letras.charAt(0))){
            jToggleButton9.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton9.setEnabled(false);
        }
        if(String.valueOf(jToggleButton10) == String.valueOf(letras.charAt(0))){
            jToggleButton10.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton10.setEnabled(false);
        }
        if(String.valueOf(jToggleButton11) == String.valueOf(letras.charAt(0))){
            jToggleButton11.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton11.setEnabled(false);
        }
        if(String.valueOf(jToggleButton12) == String.valueOf(letras.charAt(0))){
            jToggleButton12.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton12.setEnabled(false);
        }
        if(String.valueOf(jToggleButton13) == String.valueOf(letras.charAt(0))){
            jToggleButton13.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton13.setEnabled(false);
        }
        if(String.valueOf(jToggleButton14) == String.valueOf(letras.charAt(0))){
            jToggleButton14.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton14.setEnabled(false);
        }
        if(String.valueOf(jToggleButton15) == String.valueOf(letras.charAt(0))){
            jToggleButton15.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton15.setEnabled(false);
        }
        if(String.valueOf(jToggleButton16) == String.valueOf(letras.charAt(0))){
            jToggleButton16.setEnabled(true);
            aciertos++;
        }else{
            jToggleButton16.setEnabled(false);
        }
        jLabel6.setText(String.valueOf(aciertos));
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Practica3fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica3fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica3fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica3fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica3fase1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}

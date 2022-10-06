/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Jayashanka Deshan
 */
public class Clock_Face extends javax.swing.JFrame {

    Integer value;
    
    public Clock_Face() 
    {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/Img/clock_80px.png")).getImage());
        
        Timer timer;
        
        ActionListener actionListener = new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                Date date = new Date();
                
                DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
                
                String time = timeFormat.format(date);
                
                timeFormat = new SimpleDateFormat("dd MMMM yyyy");
                
                today.setText(timeFormat.format(date));
                
                DateFormat get_status = new SimpleDateFormat("HH");
                
                String status = get_status.format(date);
                
                value = Integer.valueOf(status);
                
                 if((value>=00)&&(value<13))
                {                    
                    clock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/sun_80px.png")));
                    
                    background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Background_02.png")));
                    
                    today.setForeground(Color.white);
                    
                    time_zone.setBackground(Color.white);
                }
                if((value>=13)&&(value<18))
                {
                    System.out.print("Evening");
                    
                    clock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/evening_80px.png")));
                    
                    background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Background_04.jpg")));
                    
                    today.setForeground(Color.white);
                    
                    time_zone.setForeground(Color.white);
                }
                if((value>=18)&&(value<=24))
                {
                    clock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/night_landscape_80px.png")));
                    
                    background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Background_04.jfif")));
                    
                    today.setForeground(Color.white);
                    
                    time_zone.setForeground(Color.white);

                }
                
                time_zone.setText(time);
                
            }
        };
        
        timer = new Timer(1000, actionListener);
        
        timer.setInitialDelay(0);
        
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        time_zone = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        today = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 267));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time_zone.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        time_zone.setForeground(new java.awt.Color(255, 255, 255));
        time_zone.setText("TIME HERE");
        getContentPane().add(time_zone, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 46, 310, -1));

        clock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/clock_80px.png"))); // NOI18N
        getContentPane().add(clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 37, -1, 80));

        today.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        today.setForeground(new java.awt.Color(153, 153, 153));
        today.setText("DATE HERE");
        today.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(today, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 132, 166, 41));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Background_01.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 240));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Clock_Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clock_Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clock_Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clock_Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clock_Face().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JLabel background;
    public static javax.swing.JLabel clock;
    public static javax.swing.JLabel time_zone;
    public static javax.swing.JLabel today;
    // End of variables declaration//GEN-END:variables
}

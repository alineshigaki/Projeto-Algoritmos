/*
 *Projeto de Algoritmos
 *PARTE 3 - Codigo em java para uma visualizacao mais grafica

 */
package Calculadora;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import javax.sound.sampled.*;
import java.lang.Math;

/**
 *
 * @author Aline Shigaki
 */
public class Calculadora2 extends javax.swing.JFrame {

    private boolean igual, inicio = true, operacao1, operacao2, som;
    private double a, b, c, memoria = 0, result, valor1, valor2, cos, acos, sin, asin, tan, atan, cosh, sinh, tanh;
    private String cadeia, funcoes, tipoOperacao;

    /**
     * Creates new form Calculadora2
     */
    public Calculadora2() {
        initComponents();
        jLabel1.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButtonPonto = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setBorder(null);
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("0");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButtonPonto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPonto.setText(".");
        jButtonPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPontoActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setText("+");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setText("-");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setText("*");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setText("/");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setText("=");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton16.setText("√");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton17.setText("%");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton18.setText("1/x");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton19.setText("+/-");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton20.setText("C");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton21.setText("CE");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton22.setText("<-");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton23.setText("cos");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton24.setText("sin");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton25.setText("tan");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Graus");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Radianos");

        jLabel1.setText("M");

        jButton26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton26.setText("cos-¹");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton27.setText("sin-¹");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton28.setText("tan-¹");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton29.setText("Pi");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton30.setText("x^-1");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton31.setText("x^y");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton32.setText("x√y");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton33.setText("x^3");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton34.setText("x!");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton35.setText("e");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton36.setText("3√");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton37.setText("x^2");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton38.setText("10^x");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton39.setText("EXP");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton40.setText("log");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton41.setText("MC");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton42.setText("MR");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton43.setText("MS");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton44.setText("M+");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton45.setText("M-");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton46.setForeground(new java.awt.Color(204, 0, 0));
        jButton46.setText("OFF");
        jButton46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton47.setText("cosh");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton48.setText("sinh");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton49.setText("tanh");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton52.setText("Apagar Hist.");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton26)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton28))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton30))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                                        .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(68, 68, 68)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(18, 18, Short.MAX_VALUE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jButton39)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(14, 14, 14)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton22)
                                                .addGap(10, 10, 10)
                                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton19))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(505, 505, 505))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addGap(478, 478, 478)
                                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2))
                    .addComponent(jButton52))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20)
                    .addComponent(jButton21)
                    .addComponent(jButton29)
                    .addComponent(jButton22)
                    .addComponent(jButton46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton14)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton13)
                            .addComponent(jButton17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton16)
                            .addComponent(jButton12)
                            .addComponent(jButton3)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(jButton39)
                            .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11)
                            .addComponent(jButton15))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton40, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addComponent(jButton36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Tecla 1
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);//toda vez que o botao for apertado tocara um som de tecla
        //Escreve 1 na "tela" da calculadora
        if (inicio == true) {
            jTextField1.setText("");
            jTextField1.setText("1");//
            inicio = false;
        } else {
            jTextField1.setText(jTextField1.getText() + "1");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed
//Tecla 2
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);

        if (inicio == true) {
            jTextField1.setText("");
            jTextField1.setText("2");
            inicio = false;
        } else {
            jTextField1.setText(jTextField1.getText() + "2");

        }
    }//GEN-LAST:event_jButton2ActionPerformed
//Tecla 3
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        if (inicio == true) {
            jTextField1.setText("");
            jTextField1.setText("3");
            inicio = false;
        } else {
            jTextField1.setText(jTextField1.getText() + "3");
        }
    }//GEN-LAST:event_jButton3ActionPerformed
//Tecla 4
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);

        if (inicio == true) {
            jTextField1.setText("");
            jTextField1.setText("4");
            inicio = false;
        } else {
            jTextField1.setText(jTextField1.getText() + "4");

        }
    }//GEN-LAST:event_jButton4ActionPerformed
//Tecla 5
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);

        if (inicio == true) {
            jTextField1.setText("");
            jTextField1.setText("5");
            inicio = false;
        } else {
            jTextField1.setText(jTextField1.getText() + "5");

        }
    }//GEN-LAST:event_jButton5ActionPerformed
//Tecla 6
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);

        if (inicio == true) {
            jTextField1.setText("");
            jTextField1.setText("6");
            inicio = false;
        } else {
            jTextField1.setText(jTextField1.getText() + "6");

        }
    }//GEN-LAST:event_jButton6ActionPerformed
//Tecla 7
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);

        if (inicio == true) {
            jTextField1.setText("");
            jTextField1.setText("7");
            inicio = false;
        } else {
            jTextField1.setText(jTextField1.getText() + "7");

        }
    }//GEN-LAST:event_jButton7ActionPerformed
//Tecla 8
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);

        if (inicio == true) {
            jTextField1.setText("");
            jTextField1.setText("8");
            inicio = false;
        } else {
            jTextField1.setText(jTextField1.getText() + "8");

        }
    }//GEN-LAST:event_jButton8ActionPerformed
//Tecla 9
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //som de botao
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);

        if (inicio == true) {
            jTextField1.setText("");
            jTextField1.setText("9");
            inicio = false;
        } else {
            jTextField1.setText(jTextField1.getText() + "9");

        }
    }//GEN-LAST:event_jButton9ActionPerformed
//Tecla 0
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);

        if (inicio == true) {
            jTextField1.setText("");
            jTextField1.setText("0");
            inicio = false;
        } else {
            jTextField1.setText(jTextField1.getText() + "0");

        }
    }//GEN-LAST:event_jButton10ActionPerformed
    //Tecla "."
    private void jButtonPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPontoActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        if (jTextField1.getText().contains(".")) {
        } else {
            jTextField1.setText(jTextField1.getText() + ".");
            inicio = false;

        }
    }//GEN-LAST:event_jButtonPontoActionPerformed
//Botao "+"
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        igual = true;
        inicio = true;
        if (operacao1 = true) {
            valor1 = Double.parseDouble(jTextField1.getText());
            jTextField2.setText("");
            jTextField2.setText(jTextField1.getText() + "+");
            operacao1 = false;
        } else {
            if (operacao2 = true) {
                valor2 = Double.parseDouble(jTextField1.getText());
                jTextField2.setText(jTextField1.getText() + "+");
                operacao2 = false;
            } else {
                jTextField2.setText(jTextField1.getText() + "+");
                Operacoes(result, valor2);

            }

        }
        tipoOperacao = "+";
    }//GEN-LAST:event_jButton11ActionPerformed


    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed
//Botao "-"
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        igual = true;
        inicio = true;
        if (operacao1 = true) {
            valor1 = Double.parseDouble(jTextField1.getText());
            jTextField2.setText("");
            jTextField2.setText(jTextField1.getText() + "-");
            operacao1 = false;
        } else {
            if (operacao2 = true) {
                valor2 = Double.parseDouble(jTextField1.getText());
                jTextField2.setText(jTextField1.getText() + "-");
                operacao2 = false;
            } else {
                jTextField2.setText(jTextField1.getText() + "-");
                Operacoes(result, valor2);

            }

        }
        tipoOperacao = "-";

    }//GEN-LAST:event_jButton12ActionPerformed
//Botao "*"
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        igual = true;
        inicio = true;
        if (operacao1 = true) {
            valor1 = Double.parseDouble(jTextField1.getText());
            jTextField2.setText("");
            jTextField2.setText(jTextField1.getText() + "*");
            operacao1 = false;
        } else {
            if (operacao2 = true) {
                valor2 = Double.parseDouble(jTextField1.getText());
                jTextField2.setText(jTextField1.getText() + "*");
                operacao2 = false;
            } else {
                jTextField2.setText(jTextField1.getText() + "*");
                Operacoes(result, valor2);

            }

        }
        tipoOperacao = "*";
    }//GEN-LAST:event_jButton13ActionPerformed

    //Botao "/"   
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        igual = true;
        inicio = true;
        if (operacao1 = true) {
            valor1 = Double.parseDouble(jTextField1.getText());
            jTextField2.setText("");
            jTextField2.setText(jTextField1.getText() + "/");
            operacao1 = false;
        } else {
            if (operacao2 = true) {
                valor2 = Double.parseDouble(jTextField1.getText());
                jTextField2.setText(jTextField1.getText() + "/");
                operacao2 = false;
            } else {
                jTextField2.setText(jTextField1.getText() + "/");
                Operacoes(result, valor2);

            }

        }
        tipoOperacao = "/";
    }//GEN-LAST:event_jButton14ActionPerformed

    private void Operacoes(double valor1, double valor2) {

        switch (tipoOperacao) {
            case "+":
                result = valor1 + valor2;
                jTextField1.setText(result + "");
                valor1 = Double.parseDouble(jTextField1.getText());
                break;
            case "-":
                result = valor1 - valor2;
                jTextField1.setText(result + "");
                valor1 = Double.parseDouble(jTextField1.getText());
                break;
            case "*":
                result = valor1 * valor2;
                jTextField1.setText(result + "");
                valor1 = Double.parseDouble(jTextField1.getText());
                break;

            case "/":
                if (valor2 == 0) {
                    jTextField1.setText("Error");
                    break;
                } else {
                    result = valor1 / valor2;
                    jTextField1.setText(result + "");
                    valor1 = Double.parseDouble(jTextField1.getText());
                    break;
                }
            case "potencia":
                result = Math.pow(valor1, valor2);
                jTextField1.setText(result + "");
                break;
            case "raizdex":
                if (valor2 <= 0) {
                    jTextField1.setText("Error ");
                    break;
                } else {
                    jTextField2.setText(valor2 + " yroot ");
                    a = 1;
                    c = a / valor2;
                    jTextField1.setText(Math.pow(valor1, c) + " ");
                    break;

                }

        }

    }

//sinal de igual    
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        inicio = true;
        operacao1 = true;
        if (igual = true) {
            if (tipoOperacao == null) {
            } else {
                valor2 = Double.parseDouble(jTextField1.getText());
                jTextField2.setText(jTextField2.getText() + jTextField1.getText());
                Operacoes(valor1, valor2);
                igual = false;
            }
        } else {
            jTextField2.setText("");
            Operacoes(valor1, valor2);

        }
        try {
            FileWriter fw = new FileWriter("hist.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(jTextField2.getText() + "=" + jTextField1.getText());
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Calculadora2.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton15ActionPerformed
//Botao raiz quadrada
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        valor1 = Double.parseDouble(jTextField1.getText());
        if (valor1 >= 0) {
            jTextField2.setText("sqrt(" + valor1 + ")");
            jTextField1.setText(Math.sqrt(valor1) + "");

        } else {
            jTextField1.setText("Error");
        }
    }//GEN-LAST:event_jButton16ActionPerformed
//Botao de porcentagem
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        valor2 = Double.parseDouble(jTextField1.getText());
        jTextField2.setText(jTextField2.getText() + jTextField1.getText());
        jTextField1.setText((valor1 * valor2 / 100 + ""));
        igual = true;
    }//GEN-LAST:event_jButton17ActionPerformed
//Botao Operacao Inversa
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        valor1 = Double.parseDouble(jTextField1.getText());
        jTextField2.setText("reciproc(" + valor1 + ")");
        jTextField1.setText(1 / valor1 + " ");
    }//GEN-LAST:event_jButton18ActionPerformed
//Botao troca de sinal(+/-)
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        double num1 = 0, num2, num3;
        num2 = Double.parseDouble(jTextField1.getText());
        num3 = num1 - num2;
        jTextField1.setText(num3 + "");
    }//GEN-LAST:event_jButton19ActionPerformed
//Botao C
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        jTextField1.setText("0");
        jTextField2.setText("");
        inicio = true;
        funcoes = "";
        operacao1 = true;
        operacao2 = true;
        igual = true;
        valor1 = 0;
        valor2 = 0;
        result = 0;
    }//GEN-LAST:event_jButton20ActionPerformed
//Botao CE
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        jTextField1.setText("0");
        jTextField2.setText("");
        inicio = true;
        funcoes = "";
    }//GEN-LAST:event_jButton21ActionPerformed
//Botao BackSpace
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        if (jTextField1.getText().length() > 0) {
            jTextField1.setText(jTextField1.getText().substring(0, jTextField1.getText().length() - 1));
            if (jTextField1.getText().length() == 0) {
                jTextField1.setText("0");
                inicio = true;
            }
        }
    }//GEN-LAST:event_jButton22ActionPerformed
//Metodo das Operacoes Trigonometricas

    public void Trigonometria() {
        if (jRadioButton1.isSelected()) {
            switch (funcoes) {
                case "sin":
                    valor1 = Double.parseDouble(jTextField1.getText());
                    jTextField2.setText("sin(" + valor1 + ")");
                    sin = Math.sin(Math.PI * (valor1) / 180);
                    jTextField1.setText(sin + "");

                    break;
                case "asin":
                    valor1 = Double.parseDouble(jTextField1.getText());
                    jTextField2.setText("asin(" + valor1 + ")");
                    asin = Math.asin(valor1) * 180 / Math.PI;
                    jTextField1.setText(asin + "");
                    break;
                case "cos":
                    valor1 = Double.parseDouble(jTextField1.getText());
                    jTextField2.setText("cos(" + valor1 + ")");
                    cos = Math.cos(Math.PI * (valor1) / 180);
                    jTextField1.setText(cos + "");
                    break;
                case "acos":
                    valor1 = Double.parseDouble(jTextField1.getText());
                    jTextField2.setText("acos(" + valor1 + ")");
                    acos = Math.acos(valor1) * 180 / Math.PI;
                    jTextField1.setText(acos + "");
                    break;

                case "tan":
                    valor1 = Double.parseDouble(jTextField1.getText());
                    jTextField2.setText("tan(" + valor1 + ")");
                    tan = Math.tan(Math.PI * (valor1) / 180);
                    jTextField1.setText(tan + "");
                    break;
                case "atan":
                    valor1 = Double.parseDouble(jTextField1.getText());
                    jTextField2.setText("atan(" + valor1 + ")");
                    atan = Math.atan(valor1) * 180 / Math.PI;
                    jTextField1.setText(atan + "");
                    break;
                case "cosh":
                    valor1 = Double.parseDouble(jTextField1.getText());
                    jTextField2.setText("cosh(" + valor1 + ")");
                    cosh = Math.cosh(valor1);
                    jTextField1.setText(cosh + " ");
                    break;
                case "sinh":
                    valor1 = Double.parseDouble(jTextField1.getText());
                    jTextField2.setText("sinh(" + valor1 + ")");
                    sinh = Math.sinh(valor1);
                    jTextField1.setText(sinh + " ");
                    break;
                case "tanh":
                    valor1 = Double.parseDouble(jTextField1.getText());
                    jTextField2.setText("tanh(" + valor1 + ")");
                    tanh = Math.tanh(valor1);
                    jTextField1.setText(tanh + " ");
                    break;

            }

        } else {
            if (jRadioButton2.isSelected()) {
                switch (funcoes) {
                    case "sin":
                        valor1 = Double.parseDouble(jTextField1.getText());
                        jTextField2.setText("sinr(" + valor1 + ")");
                        sin = Math.sin(valor1);
                        jTextField1.setText(sin + "");
                        break;
                    case "asin":
                        valor1 = Double.parseDouble(jTextField1.getText());
                        jTextField2.setText("asinr(" + valor1 + ")");
                        asin = Math.asin(valor1);
                        jTextField1.setText(asin + "");
                        break;
                    case "cos":
                        valor1 = Double.parseDouble(jTextField1.getText());
                        jTextField2.setText("cosr(" + valor1 + ")");
                        cos = Math.cos(valor1);
                        jTextField1.setText(cos + "");
                        break;
                    case "acos":
                        valor1 = Double.parseDouble(jTextField1.getText());
                        jTextField2.setText("acosr(" + valor1 + ")");
                        acos = Math.acos(valor1);
                        jTextField1.setText(acos + "");
                        break;

                    case "tan":
                        valor1 = Double.parseDouble(jTextField1.getText());
                        jTextField2.setText("tanr(" + valor1 + ")");
                        tan = Math.tan(valor1);
                        jTextField1.setText(tan + "");
                        break;
                    case "atan":
                        valor1 = Double.parseDouble(jTextField1.getText());
                        jTextField2.setText("atanr(" + valor1 + ")");
                        atan = Math.atan(valor1);
                        jTextField1.setText(atan + "");
                        break;
                    case "cosh":
                        valor1 = Double.parseDouble(jTextField1.getText());
                        jTextField2.setText("cosh(" + valor1 + ")");
                        cosh = Math.cosh(valor1);
                        jTextField1.setText(cosh + " ");
                        break;

                    case "sinh":
                        valor1 = Double.parseDouble(jTextField1.getText());
                        jTextField2.setText("sinh(" + valor1 + ")");
                        sinh = Math.sinh(valor1);
                        jTextField1.setText(sinh + " ");
                        break;

                    case "tanh":
                        valor1 = Double.parseDouble(jTextField1.getText());
                        jTextField2.setText("tanh(" + valor1 + ")");
                        tanh = Math.tanh(valor1);
                        jTextField1.setText(tanh + " ");
                        break;

                }

            }

        }

    }

//Botao Cosseno    
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        funcoes = "cos";
        Trigonometria();//chama o metodo trigonometria
        try {
            FileWriter fw = new FileWriter("hist.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(jTextField2.getText() + "=" + jTextField1.getText());
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Calculadora2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed
//Botao Seno
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        funcoes = "sin";
        Trigonometria();
        try {
            FileWriter fw = new FileWriter("hist.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(jTextField2.getText() + "=" + jTextField1.getText());
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Calculadora2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton24ActionPerformed
//Botao Tangente
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        funcoes = "tan";
        Trigonometria();
        try {
            FileWriter fw = new FileWriter("hist.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(jTextField2.getText() + "=" + jTextField1.getText());
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Calculadora2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton25ActionPerformed
//Botao Cosseno Inverso
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        funcoes = "acos";
        Trigonometria();
        try {
            FileWriter fw = new FileWriter("hist.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(jTextField2.getText() + "=" + jTextField1.getText());
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Calculadora2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton26ActionPerformed
//Botao Seno Inverso
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        funcoes = "asin";
        Trigonometria();
        try {
            FileWriter fw = new FileWriter("hist.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(jTextField2.getText() + "=" + jTextField1.getText());
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Calculadora2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton27ActionPerformed
//Botao Tangente Inverso
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        funcoes = "atan";
        Trigonometria();
        try {
            FileWriter fw = new FileWriter("hist.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(jTextField2.getText() + "=" + jTextField1.getText());
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Calculadora2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton28ActionPerformed
//Botao PI
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        jTextField2.setText("PI ");
        jTextField1.setText(Math.PI + " ");
    }//GEN-LAST:event_jButton29ActionPerformed
//Botao x^-1
    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        valor1 = Double.parseDouble(jTextField1.getText());
        jTextField2.setText(valor1 + "^-1");
        jTextField1.setText(Math.pow(valor1, -1) + "");
    }//GEN-LAST:event_jButton30ActionPerformed
//Botao x^y
    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        inicio = true;
        valor1 = Double.parseDouble(jTextField1.getText());
        jTextField2.setText(valor1 + "^");
        tipoOperacao = "potencia";
        operacao1 = false;
        igual = true;

    }//GEN-LAST:event_jButton31ActionPerformed
//Botao Raiz de qualquer numero
    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        inicio = true;
        valor1 = Double.parseDouble(jTextField1.getText());
        jTextField2.setText(valor1 + "yroot  ");
        tipoOperacao = "raizdex";
        operacao1 = false;
        igual = true;
    }//GEN-LAST:event_jButton32ActionPerformed
//Botao que eleva ao cubo
    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        valor1 = Double.parseDouble(jTextField1.getText());
        jTextField2.setText("cube(" + valor1 + " )");
        jTextField1.setText(Math.pow(valor1, 3) + " ");
    }//GEN-LAST:event_jButton33ActionPerformed
//Botao Fatorial de um numero
    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        a = 1;
        valor1 = Double.parseDouble(jTextField1.getText());
        jTextField2.setText("fat(" + valor1 + " )");
        for (b = 1; b <= valor1; b++) {
            a = a * b;
        }
        jTextField1.setText(a + " ");
    }//GEN-LAST:event_jButton34ActionPerformed
//Valor de e
    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        jTextField2.setText("E ");
        jTextField1.setText(Math.E + " ");

    }//GEN-LAST:event_jButton35ActionPerformed
//Botao Raiz Cubica
    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        valor1 = Double.parseDouble(jTextField1.getText());
        a = 1;
        b = 3;
        c = 7;
        c = a / b;
        jTextField2.setText("cuberoot(" + valor1 + ") ");
        jTextField1.setText(Math.pow(valor1, c) + " ");
    }//GEN-LAST:event_jButton36ActionPerformed
//Botao que eleva ao quadrado
    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        valor1 = Double.parseDouble(jTextField1.getText());
        jTextField2.setText("sqr(" + valor1 + ") ");
        jTextField1.setText(Math.pow(valor1, 2) + " ");

    }//GEN-LAST:event_jButton37ActionPerformed
//Botao que de potencia de 10
    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        valor1 = Double.parseDouble(jTextField1.getText());
        jTextField2.setText("powten(" + valor1 + ") ");
        jTextField1.setText(Math.pow(10, valor1) + " ");
    }//GEN-LAST:event_jButton38ActionPerformed
//Botão da Exponenciação Neperiana
    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        valor1 = Double.parseDouble(jTextField1.getText());
        jTextField2.setText("exp(" + valor1 + ") ");
        jTextField1.setText(Math.exp(valor1) + " ");
    }//GEN-LAST:event_jButton39ActionPerformed
//Botão Logaritmo
    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        valor1 = Double.parseDouble(jTextField1.getText());
        jTextField2.setText("log(" + valor1 + ") ");
        jTextField1.setText(Math.log(valor1) + " ");
    }//GEN-LAST:event_jButton40ActionPerformed
//Botao MC
    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        memoria = 0;
        jLabel1.setVisible(false);
    }//GEN-LAST:event_jButton41ActionPerformed
//Botao MR
    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        jTextField1.setText(memoria + " ");

    }//GEN-LAST:event_jButton42ActionPerformed
//Botao MS
    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        memoria = Double.parseDouble(jTextField1.getText());
        jLabel1.setVisible(true);
    }//GEN-LAST:event_jButton43ActionPerformed
//Botao M+
    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        memoria = memoria + Double.parseDouble(jTextField1.getText());
        jLabel1.setVisible(true);
    }//GEN-LAST:event_jButton44ActionPerformed
//Botao M-
    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        memoria = memoria - Double.parseDouble(jTextField1.getText());
        jLabel1.setVisible(true);
    }//GEN-LAST:event_jButton45ActionPerformed
//Botao OFF
    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButton46ActionPerformed
//Botao Cosh
    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        funcoes = "cosh";
        Trigonometria();
        try {
            FileWriter fw = new FileWriter("hist.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(jTextField2.getText() + "=" + jTextField1.getText());
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Calculadora2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton47ActionPerformed
//Botao Sinh
    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        funcoes = "sinh";
        Trigonometria();
        try {
            FileWriter fw = new FileWriter("hist.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(jTextField2.getText() + "=" + jTextField1.getText());
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Calculadora2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton48ActionPerformed
//Botao Tanh
    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        String filepath = "Button-Sound.wav";
        Calculadora2 musicObject = new Calculadora2();
        musicObject.playMusic(filepath);
        funcoes = "tanh";
        Trigonometria();
        try {
            FileWriter fw = new FileWriter("hist.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(jTextField2.getText() + "=" + jTextField1.getText());
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Calculadora2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton49ActionPerformed
//Botao Apagar Histórico
    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed

        try {
            FileWriter fw = new FileWriter("hist.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("");
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Calculadora2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton52ActionPerformed

    /**
     * @param args the command line arguments
     */
    //Metodo para tocar o som do botao, normalmente se usava um metodo mais antigo porém que funcionava apenas na versão 8.1 do NetBeans
    void playMusic(String musicLocation) {
        try {
            File musicPath = new File(musicLocation);
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();

            } else {
                System.out.println("Arquivo não encontrado");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

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
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora2().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonPonto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

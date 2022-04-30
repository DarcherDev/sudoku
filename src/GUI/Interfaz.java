/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DATA.Matriz;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class Interfaz extends javax.swing.JFrame {

    public Matriz sudoku;
    JTextField matrizJTextField[][] = new JTextField[9][9];

    /**
     * Creates new form intefaz
     */
    public Interfaz() {
        initComponents();
        sudoku = new Matriz();
        this.setVisible(true);
    }

    public void agregarJTextField() {
        matrizJTextField[0][0] = jTextField1_1;
        matrizJTextField[0][1] = jTextField1_2;
        matrizJTextField[0][2] = jTextField1_3;
        matrizJTextField[0][3] = jTextField2_1;
        matrizJTextField[0][4] = jTextField2_2;
        matrizJTextField[0][5] = jTextField2_3;
        matrizJTextField[0][6] = jTextField3_1;
        matrizJTextField[0][7] = jTextField3_2;
        matrizJTextField[0][8] = jTextField3_3;
        //====================================
        matrizJTextField[1][0] = jTextField1_4;
        matrizJTextField[1][1] = jTextField1_5;
        matrizJTextField[1][2] = jTextField1_6;
        matrizJTextField[1][3] = jTextField2_4;
        matrizJTextField[1][4] = jTextField2_5;
        matrizJTextField[1][5] = jTextField2_6;
        matrizJTextField[1][6] = jTextField3_4;
        matrizJTextField[1][7] = jTextField3_5;
        matrizJTextField[1][8] = jTextField3_6;
        //====================================
        matrizJTextField[2][0] = jTextField1_7;
        matrizJTextField[2][1] = jTextField1_8;
        matrizJTextField[2][2] = jTextField1_9;
        matrizJTextField[2][3] = jTextField2_7;
        matrizJTextField[2][4] = jTextField2_8;
        matrizJTextField[2][5] = jTextField2_9;
        matrizJTextField[2][6] = jTextField3_7;
        matrizJTextField[2][7] = jTextField3_8;
        matrizJTextField[2][8] = jTextField3_9;
        //====================================
        //====================================
        matrizJTextField[3][0] = jTextField4_1;
        matrizJTextField[3][1] = jTextField4_2;
        matrizJTextField[3][2] = jTextField4_3;
        matrizJTextField[3][3] = jTextField5_1;
        matrizJTextField[3][4] = jTextField5_2;
        matrizJTextField[3][5] = jTextField5_3;
        matrizJTextField[3][6] = jTextField6_1;
        matrizJTextField[3][7] = jTextField6_2;
        matrizJTextField[3][8] = jTextField6_3;
        //====================================
        matrizJTextField[4][0] = jTextField4_4;
        matrizJTextField[4][1] = jTextField4_5;
        matrizJTextField[4][2] = jTextField4_6;
        matrizJTextField[4][3] = jTextField5_4;
        matrizJTextField[4][4] = jTextField5_5;
        matrizJTextField[4][5] = jTextField5_6;
        matrizJTextField[4][6] = jTextField6_4;
        matrizJTextField[4][7] = jTextField6_5;
        matrizJTextField[4][8] = jTextField6_6;
        //====================================
        matrizJTextField[5][0] = jTextField4_7;
        matrizJTextField[5][1] = jTextField4_8;
        matrizJTextField[5][2] = jTextField4_9;
        matrizJTextField[5][3] = jTextField4_7;
        matrizJTextField[5][4] = jTextField4_8;
        matrizJTextField[5][5] = jTextField4_9;
        matrizJTextField[5][6] = jTextField4_7;
        matrizJTextField[5][7] = jTextField4_8;
        matrizJTextField[5][8] = jTextField4_9;
        //====================================
        //====================================
        matrizJTextField[6][0] = jTextField7_1;
        matrizJTextField[6][1] = jTextField7_2;
        matrizJTextField[6][2] = jTextField7_3;
        matrizJTextField[6][3] = jTextField8_1;
        matrizJTextField[6][4] = jTextField8_2;
        matrizJTextField[6][5] = jTextField8_3;
        matrizJTextField[6][6] = jTextField9_1;
        matrizJTextField[6][7] = jTextField9_2;
        matrizJTextField[6][8] = jTextField9_3;
        //====================================
        matrizJTextField[7][0] = jTextField7_4;
        matrizJTextField[7][1] = jTextField7_5;
        matrizJTextField[7][2] = jTextField7_6;
        matrizJTextField[7][3] = jTextField8_4;
        matrizJTextField[7][4] = jTextField8_5;
        matrizJTextField[7][5] = jTextField8_6;
        matrizJTextField[7][6] = jTextField9_4;
        matrizJTextField[7][7] = jTextField9_5;
        matrizJTextField[7][8] = jTextField9_6;
        //====================================
        matrizJTextField[8][0] = jTextField7_7;
        matrizJTextField[8][1] = jTextField7_8;
        matrizJTextField[8][2] = jTextField7_9;
        matrizJTextField[8][3] = jTextField8_7;
        matrizJTextField[8][4] = jTextField8_8;
        matrizJTextField[8][5] = jTextField8_9;
        matrizJTextField[8][6] = jTextField9_7;
        matrizJTextField[8][7] = jTextField9_8;
        matrizJTextField[8][8] = jTextField9_9;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnReiniciar = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnIntentar = new javax.swing.JButton();
        btnCargarMatriz = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1_1 = new javax.swing.JTextField();
        jTextField1_2 = new javax.swing.JTextField();
        jTextField1_3 = new javax.swing.JTextField();
        jTextField1_4 = new javax.swing.JTextField();
        jTextField1_5 = new javax.swing.JTextField();
        jTextField1_6 = new javax.swing.JTextField();
        jTextField1_7 = new javax.swing.JTextField();
        jTextField1_8 = new javax.swing.JTextField();
        jTextField1_9 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField2_1 = new javax.swing.JTextField();
        jTextField2_2 = new javax.swing.JTextField();
        jTextField2_3 = new javax.swing.JTextField();
        jTextField2_4 = new javax.swing.JTextField();
        jTextField2_5 = new javax.swing.JTextField();
        jTextField2_6 = new javax.swing.JTextField();
        jTextField2_7 = new javax.swing.JTextField();
        jTextField2_8 = new javax.swing.JTextField();
        jTextField2_9 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextField3_1 = new javax.swing.JTextField();
        jTextField3_2 = new javax.swing.JTextField();
        jTextField3_3 = new javax.swing.JTextField();
        jTextField3_4 = new javax.swing.JTextField();
        jTextField3_5 = new javax.swing.JTextField();
        jTextField3_6 = new javax.swing.JTextField();
        jTextField3_7 = new javax.swing.JTextField();
        jTextField3_8 = new javax.swing.JTextField();
        jTextField3_9 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextField4_1 = new javax.swing.JTextField();
        jTextField4_2 = new javax.swing.JTextField();
        jTextField4_3 = new javax.swing.JTextField();
        jTextField4_4 = new javax.swing.JTextField();
        jTextField4_5 = new javax.swing.JTextField();
        jTextField4_6 = new javax.swing.JTextField();
        jTextField4_7 = new javax.swing.JTextField();
        jTextField4_8 = new javax.swing.JTextField();
        jTextField4_9 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTextField5_1 = new javax.swing.JTextField();
        jTextField5_2 = new javax.swing.JTextField();
        jTextField5_3 = new javax.swing.JTextField();
        jTextField5_4 = new javax.swing.JTextField();
        jTextField5_5 = new javax.swing.JTextField();
        jTextField5_6 = new javax.swing.JTextField();
        jTextField5_7 = new javax.swing.JTextField();
        jTextField5_8 = new javax.swing.JTextField();
        jTextField5_9 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jTextField6_1 = new javax.swing.JTextField();
        jTextField6_2 = new javax.swing.JTextField();
        jTextField6_3 = new javax.swing.JTextField();
        jTextField6_4 = new javax.swing.JTextField();
        jTextField6_5 = new javax.swing.JTextField();
        jTextField6_6 = new javax.swing.JTextField();
        jTextField6_7 = new javax.swing.JTextField();
        jTextField6_8 = new javax.swing.JTextField();
        jTextField6_9 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jTextField7_1 = new javax.swing.JTextField();
        jTextField7_2 = new javax.swing.JTextField();
        jTextField7_3 = new javax.swing.JTextField();
        jTextField7_4 = new javax.swing.JTextField();
        jTextField7_5 = new javax.swing.JTextField();
        jTextField7_6 = new javax.swing.JTextField();
        jTextField7_7 = new javax.swing.JTextField();
        jTextField7_8 = new javax.swing.JTextField();
        jTextField7_9 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jTextField8_1 = new javax.swing.JTextField();
        jTextField8_2 = new javax.swing.JTextField();
        jTextField8_3 = new javax.swing.JTextField();
        jTextField8_4 = new javax.swing.JTextField();
        jTextField8_5 = new javax.swing.JTextField();
        jTextField8_6 = new javax.swing.JTextField();
        jTextField8_7 = new javax.swing.JTextField();
        jTextField8_8 = new javax.swing.JTextField();
        jTextField8_9 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jTextField9_1 = new javax.swing.JTextField();
        jTextField9_2 = new javax.swing.JTextField();
        jTextField9_3 = new javax.swing.JTextField();
        jTextField9_4 = new javax.swing.JTextField();
        jTextField9_5 = new javax.swing.JTextField();
        jTextField9_6 = new javax.swing.JTextField();
        jTextField9_7 = new javax.swing.JTextField();
        jTextField9_8 = new javax.swing.JTextField();
        jTextField9_9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReiniciar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnStart.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnStart.setText("Iniciar Juego");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnIntentar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnIntentar.setText("Intentar");
        btnIntentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntentarActionPerformed(evt);
            }
        });

        btnCargarMatriz.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnCargarMatriz.setText("Cargar Matriz");
        btnCargarMatriz.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnCargarMatriz.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnCargarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarMatrizActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        jTextField1_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_1.setBorder(null);
        jTextField1_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_1KeyTyped(evt);
            }
        });

        jTextField1_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_2.setBorder(null);
        jTextField1_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_2KeyTyped(evt);
            }
        });

        jTextField1_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_3.setBorder(null);
        jTextField1_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_3KeyTyped(evt);
            }
        });

        jTextField1_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_4.setBorder(null);
        jTextField1_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_4KeyTyped(evt);
            }
        });

        jTextField1_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_5.setBorder(null);
        jTextField1_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_5KeyTyped(evt);
            }
        });

        jTextField1_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_6.setBorder(null);
        jTextField1_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_6KeyTyped(evt);
            }
        });

        jTextField1_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_7.setBorder(null);
        jTextField1_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_7KeyTyped(evt);
            }
        });

        jTextField1_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_8.setBorder(null);
        jTextField1_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_8KeyTyped(evt);
            }
        });

        jTextField1_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1_9.setBorder(null);
        jTextField1_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField2_1.setBackground(new java.awt.Color(120, 255, 121));
        jTextField2_1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField2_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2_1.setBorder(null);
        jTextField2_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField2_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_1KeyTyped(evt);
            }
        });

        jTextField2_2.setBackground(new java.awt.Color(120, 255, 121));
        jTextField2_2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField2_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2_2.setBorder(null);
        jTextField2_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField2_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_2KeyTyped(evt);
            }
        });

        jTextField2_3.setBackground(new java.awt.Color(120, 255, 121));
        jTextField2_3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField2_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2_3.setBorder(null);
        jTextField2_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField2_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_3KeyTyped(evt);
            }
        });

        jTextField2_4.setBackground(new java.awt.Color(120, 255, 121));
        jTextField2_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField2_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2_4.setBorder(null);
        jTextField2_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField2_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_4KeyTyped(evt);
            }
        });

        jTextField2_5.setBackground(new java.awt.Color(120, 255, 121));
        jTextField2_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField2_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2_5.setBorder(null);
        jTextField2_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField2_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_5KeyTyped(evt);
            }
        });

        jTextField2_6.setBackground(new java.awt.Color(120, 255, 121));
        jTextField2_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField2_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2_6.setBorder(null);
        jTextField2_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField2_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_6KeyTyped(evt);
            }
        });

        jTextField2_7.setBackground(new java.awt.Color(120, 255, 121));
        jTextField2_7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField2_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2_7.setBorder(null);
        jTextField2_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField2_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_7KeyTyped(evt);
            }
        });

        jTextField2_8.setBackground(new java.awt.Color(120, 255, 121));
        jTextField2_8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField2_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2_8.setBorder(null);
        jTextField2_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField2_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_8KeyTyped(evt);
            }
        });

        jTextField2_9.setBackground(new java.awt.Color(120, 255, 121));
        jTextField2_9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField2_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2_9.setBorder(null);
        jTextField2_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField2_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        jTextField3_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3_1.setBorder(null);
        jTextField3_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField3_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3_1KeyTyped(evt);
            }
        });

        jTextField3_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3_2.setBorder(null);
        jTextField3_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField3_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3_2KeyTyped(evt);
            }
        });

        jTextField3_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3_3.setBorder(null);
        jTextField3_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField3_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3_3KeyTyped(evt);
            }
        });

        jTextField3_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3_4.setBorder(null);
        jTextField3_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField3_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3_4KeyTyped(evt);
            }
        });

        jTextField3_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3_5.setBorder(null);
        jTextField3_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField3_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3_5KeyTyped(evt);
            }
        });

        jTextField3_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3_6.setBorder(null);
        jTextField3_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField3_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3_6KeyTyped(evt);
            }
        });

        jTextField3_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3_7.setBorder(null);
        jTextField3_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField3_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3_7KeyTyped(evt);
            }
        });

        jTextField3_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3_8.setBorder(null);
        jTextField3_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField3_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3_8KeyTyped(evt);
            }
        });

        jTextField3_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3_9.setBorder(null);
        jTextField3_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField3_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTextField3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTextField3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTextField3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField4_1.setBackground(new java.awt.Color(120, 255, 121));
        jTextField4_1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField4_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4_1.setBorder(null);
        jTextField4_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField4_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4_1KeyTyped(evt);
            }
        });

        jTextField4_2.setBackground(new java.awt.Color(120, 255, 121));
        jTextField4_2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField4_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4_2.setBorder(null);
        jTextField4_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField4_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4_2KeyTyped(evt);
            }
        });

        jTextField4_3.setBackground(new java.awt.Color(120, 255, 121));
        jTextField4_3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField4_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4_3.setBorder(null);
        jTextField4_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField4_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4_3KeyTyped(evt);
            }
        });

        jTextField4_4.setBackground(new java.awt.Color(120, 255, 121));
        jTextField4_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField4_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4_4.setBorder(null);
        jTextField4_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField4_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4_4KeyTyped(evt);
            }
        });

        jTextField4_5.setBackground(new java.awt.Color(120, 255, 121));
        jTextField4_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField4_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4_5.setBorder(null);
        jTextField4_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField4_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4_5KeyTyped(evt);
            }
        });

        jTextField4_6.setBackground(new java.awt.Color(120, 255, 121));
        jTextField4_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField4_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4_6.setBorder(null);
        jTextField4_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField4_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4_6KeyTyped(evt);
            }
        });

        jTextField4_7.setBackground(new java.awt.Color(120, 255, 121));
        jTextField4_7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField4_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4_7.setBorder(null);
        jTextField4_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField4_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4_7KeyTyped(evt);
            }
        });

        jTextField4_8.setBackground(new java.awt.Color(120, 255, 121));
        jTextField4_8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField4_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4_8.setBorder(null);
        jTextField4_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField4_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4_8KeyTyped(evt);
            }
        });

        jTextField4_9.setBackground(new java.awt.Color(120, 255, 121));
        jTextField4_9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField4_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4_9.setBorder(null);
        jTextField4_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField4_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTextField4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTextField4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTextField4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        jTextField5_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5_1.setBorder(null);
        jTextField5_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField5_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5_1KeyTyped(evt);
            }
        });

        jTextField5_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5_2.setBorder(null);
        jTextField5_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField5_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5_2KeyTyped(evt);
            }
        });

        jTextField5_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5_3.setBorder(null);
        jTextField5_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField5_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5_3KeyTyped(evt);
            }
        });

        jTextField5_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5_4.setBorder(null);
        jTextField5_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField5_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5_4KeyTyped(evt);
            }
        });

        jTextField5_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5_5.setBorder(null);
        jTextField5_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField5_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5_5KeyTyped(evt);
            }
        });

        jTextField5_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5_6.setBorder(null);
        jTextField5_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField5_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5_6KeyTyped(evt);
            }
        });

        jTextField5_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5_7.setBorder(null);
        jTextField5_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField5_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5_7KeyTyped(evt);
            }
        });

        jTextField5_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5_8.setBorder(null);
        jTextField5_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField5_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5_8KeyTyped(evt);
            }
        });

        jTextField5_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5_9.setBorder(null);
        jTextField5_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField5_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jTextField5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jTextField5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jTextField5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField6_1.setBackground(new java.awt.Color(120, 255, 121));
        jTextField6_1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField6_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6_1.setBorder(null);
        jTextField6_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField6_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6_1KeyTyped(evt);
            }
        });

        jTextField6_2.setBackground(new java.awt.Color(120, 255, 121));
        jTextField6_2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField6_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6_2.setBorder(null);
        jTextField6_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField6_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6_2KeyTyped(evt);
            }
        });

        jTextField6_3.setBackground(new java.awt.Color(120, 255, 121));
        jTextField6_3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField6_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6_3.setBorder(null);
        jTextField6_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField6_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6_3KeyTyped(evt);
            }
        });

        jTextField6_4.setBackground(new java.awt.Color(120, 255, 121));
        jTextField6_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField6_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6_4.setBorder(null);
        jTextField6_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField6_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6_4KeyTyped(evt);
            }
        });

        jTextField6_5.setBackground(new java.awt.Color(120, 255, 121));
        jTextField6_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField6_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6_5.setBorder(null);
        jTextField6_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField6_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6_5KeyTyped(evt);
            }
        });

        jTextField6_6.setBackground(new java.awt.Color(120, 255, 121));
        jTextField6_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField6_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6_6.setBorder(null);
        jTextField6_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField6_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6_6KeyTyped(evt);
            }
        });

        jTextField6_7.setBackground(new java.awt.Color(120, 255, 121));
        jTextField6_7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField6_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6_7.setBorder(null);
        jTextField6_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField6_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6_7KeyTyped(evt);
            }
        });

        jTextField6_8.setBackground(new java.awt.Color(120, 255, 121));
        jTextField6_8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField6_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6_8.setBorder(null);
        jTextField6_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField6_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6_8KeyTyped(evt);
            }
        });

        jTextField6_9.setBackground(new java.awt.Color(120, 255, 121));
        jTextField6_9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField6_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6_9.setBorder(null);
        jTextField6_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jTextField6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jTextField6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jTextField6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        jTextField7_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7_1.setBorder(null);
        jTextField7_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField7_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7_1KeyTyped(evt);
            }
        });

        jTextField7_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7_2.setBorder(null);
        jTextField7_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField7_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7_2KeyTyped(evt);
            }
        });

        jTextField7_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7_3.setBorder(null);
        jTextField7_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField7_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7_3KeyTyped(evt);
            }
        });

        jTextField7_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7_4.setBorder(null);
        jTextField7_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField7_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7_4KeyTyped(evt);
            }
        });

        jTextField7_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7_5.setBorder(null);
        jTextField7_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField7_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7_5KeyTyped(evt);
            }
        });

        jTextField7_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7_6.setBorder(null);
        jTextField7_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField7_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7_6KeyTyped(evt);
            }
        });

        jTextField7_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7_7.setBorder(null);
        jTextField7_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField7_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7_7KeyTyped(evt);
            }
        });

        jTextField7_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7_8.setBorder(null);
        jTextField7_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField7_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7_8KeyTyped(evt);
            }
        });

        jTextField7_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7_9.setBorder(null);
        jTextField7_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField7_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jTextField7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jTextField7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jTextField7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField8_1.setBackground(new java.awt.Color(120, 255, 121));
        jTextField8_1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField8_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8_1.setBorder(null);
        jTextField8_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField8_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8_1KeyTyped(evt);
            }
        });

        jTextField8_2.setBackground(new java.awt.Color(120, 255, 121));
        jTextField8_2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField8_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8_2.setBorder(null);
        jTextField8_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField8_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8_2KeyTyped(evt);
            }
        });

        jTextField8_3.setBackground(new java.awt.Color(120, 255, 121));
        jTextField8_3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField8_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8_3.setBorder(null);
        jTextField8_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField8_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8_3KeyTyped(evt);
            }
        });

        jTextField8_4.setBackground(new java.awt.Color(120, 255, 121));
        jTextField8_4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField8_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8_4.setBorder(null);
        jTextField8_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField8_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8_4KeyTyped(evt);
            }
        });

        jTextField8_5.setBackground(new java.awt.Color(120, 255, 121));
        jTextField8_5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField8_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8_5.setBorder(null);
        jTextField8_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField8_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8_5KeyTyped(evt);
            }
        });

        jTextField8_6.setBackground(new java.awt.Color(120, 255, 121));
        jTextField8_6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField8_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8_6.setBorder(null);
        jTextField8_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField8_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8_6KeyTyped(evt);
            }
        });

        jTextField8_7.setBackground(new java.awt.Color(120, 255, 121));
        jTextField8_7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField8_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8_7.setBorder(null);
        jTextField8_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField8_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8_7KeyTyped(evt);
            }
        });

        jTextField8_8.setBackground(new java.awt.Color(120, 255, 121));
        jTextField8_8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField8_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8_8.setBorder(null);
        jTextField8_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField8_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8_8KeyTyped(evt);
            }
        });

        jTextField8_9.setBackground(new java.awt.Color(120, 255, 121));
        jTextField8_9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextField8_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8_9.setBorder(null);
        jTextField8_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField8_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jTextField8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jTextField8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jTextField8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(120, 255, 121)));

        jTextField9_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9_1.setBorder(null);
        jTextField9_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField9_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9_1KeyTyped(evt);
            }
        });

        jTextField9_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9_2.setBorder(null);
        jTextField9_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField9_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9_2KeyTyped(evt);
            }
        });

        jTextField9_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9_3.setBorder(null);
        jTextField9_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField9_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9_3KeyTyped(evt);
            }
        });

        jTextField9_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9_4.setBorder(null);
        jTextField9_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField9_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9_4KeyTyped(evt);
            }
        });

        jTextField9_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9_5.setBorder(null);
        jTextField9_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField9_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9_5KeyTyped(evt);
            }
        });

        jTextField9_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9_6.setBorder(null);
        jTextField9_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField9_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9_6KeyTyped(evt);
            }
        });

        jTextField9_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9_7.setBorder(null);
        jTextField9_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField9_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9_7KeyTyped(evt);
            }
        });

        jTextField9_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9_8.setBorder(null);
        jTextField9_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField9_8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9_8KeyTyped(evt);
            }
        });

        jTextField9_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9_9.setBorder(null);
        jTextField9_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField9_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9_9KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jTextField9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jTextField9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jTextField9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCargarMatriz)
                    .addComponent(btnReiniciar)
                    .addComponent(btnStart)
                    .addComponent(btnIntentar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCargarMatriz)
                                .addGap(18, 18, 18)
                                .addComponent(btnReiniciar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnStart))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnIntentar))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed

    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed

    }//GEN-LAST:event_btnStartActionPerformed

    private void btnIntentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntentarActionPerformed

        this.sudoku.toStringMatriz();
    }//GEN-LAST:event_btnIntentarActionPerformed

    private void jTextField1_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField1_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1_2KeyTyped

    private void jTextField1_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField1_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1_1KeyTyped

    private void jTextField1_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField1_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1_3KeyTyped

    private void jTextField1_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField1_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1_4KeyTyped

    private void jTextField1_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField1_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1_5KeyTyped

    private void jTextField1_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField1_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1_6KeyTyped

    private void jTextField1_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField1_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1_7KeyTyped

    private void jTextField1_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField1_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1_8KeyTyped

    private void jTextField1_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField1_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1_9KeyTyped

    private void btnCargarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarMatrizActionPerformed

        sudoku.cargarMatriz();

    }//GEN-LAST:event_btnCargarMatrizActionPerformed

    private void jTextField8_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField8_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8_2KeyTyped

    private void jTextField8_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField8_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8_1KeyTyped

    private void jTextField8_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField8_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8_3KeyTyped

    private void jTextField8_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField8_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8_4KeyTyped

    private void jTextField8_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField8_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8_5KeyTyped

    private void jTextField8_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField8_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8_6KeyTyped

    private void jTextField8_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField8_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8_7KeyTyped

    private void jTextField8_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField8_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8_8KeyTyped

    private void jTextField8_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField8_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8_9KeyTyped

    private void jTextField4_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField4_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4_2KeyTyped

    private void jTextField4_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField4_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4_1KeyTyped

    private void jTextField4_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField4_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4_3KeyTyped

    private void jTextField4_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField4_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4_4KeyTyped

    private void jTextField4_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField4_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4_5KeyTyped

    private void jTextField4_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField4_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4_6KeyTyped

    private void jTextField4_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField4_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4_7KeyTyped

    private void jTextField4_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField4_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4_8KeyTyped

    private void jTextField4_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField4_9.getText().length() == 1) {
            evt.consume();
        }
        if (Character.isSpace(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4_9KeyTyped

    private void jTextField9_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField9_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9_2KeyTyped

    private void jTextField9_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField9_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9_1KeyTyped

    private void jTextField9_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField9_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9_3KeyTyped

    private void jTextField9_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField9_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9_4KeyTyped

    private void jTextField9_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField9_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9_5KeyTyped

    private void jTextField9_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField9_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9_6KeyTyped

    private void jTextField9_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField9_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9_7KeyTyped

    private void jTextField9_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField9_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9_8KeyTyped

    private void jTextField9_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField9_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9_9KeyTyped

    private void jTextField3_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField3_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3_2KeyTyped

    private void jTextField3_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField3_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3_3KeyTyped

    private void jTextField3_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField3_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3_4KeyTyped

    private void jTextField3_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField3_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3_5KeyTyped

    private void jTextField3_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField3_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3_6KeyTyped

    private void jTextField3_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField3_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3_7KeyTyped

    private void jTextField3_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField3_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3_8KeyTyped

    private void jTextField3_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_9KeyTyped

        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField3_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3_9KeyTyped

    private void jTextField6_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField6_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6_2KeyTyped

    private void jTextField6_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField6_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6_1KeyTyped

    private void jTextField6_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField6_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6_3KeyTyped

    private void jTextField6_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField6_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6_4KeyTyped

    private void jTextField6_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField6_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6_5KeyTyped

    private void jTextField6_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField6_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6_6KeyTyped

    private void jTextField6_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField6_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6_7KeyTyped

    private void jTextField6_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField6_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6_8KeyTyped

    private void jTextField6_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField6_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6_9KeyTyped

    private void jTextField2_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField2_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2_2KeyTyped

    private void jTextField2_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField2_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2_1KeyTyped

    private void jTextField2_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField2_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2_3KeyTyped

    private void jTextField2_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField2_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2_4KeyTyped

    private void jTextField2_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField2_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2_5KeyTyped

    private void jTextField2_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField2_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2_6KeyTyped

    private void jTextField2_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField2_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2_7KeyTyped

    private void jTextField2_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField2_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2_8KeyTyped

    private void jTextField2_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField2_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2_9KeyTyped

    private void jTextField7_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField7_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7_2KeyTyped

    private void jTextField7_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField7_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7_1KeyTyped

    private void jTextField7_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField7_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7_3KeyTyped

    private void jTextField7_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField7_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7_4KeyTyped

    private void jTextField7_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField7_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7_5KeyTyped

    private void jTextField7_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField7_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7_6KeyTyped

    private void jTextField7_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField7_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7_7KeyTyped

    private void jTextField7_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField7_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7_8KeyTyped

    private void jTextField7_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField7_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7_9KeyTyped

    private void jTextField5_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_2KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField5_2.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5_2KeyTyped

    private void jTextField5_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField5_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5_1KeyTyped

    private void jTextField5_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_3KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField5_3.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5_3KeyTyped

    private void jTextField5_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_4KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField5_4.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5_4KeyTyped

    private void jTextField5_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_5KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField5_5.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5_5KeyTyped

    private void jTextField5_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_6KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField5_6.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5_6KeyTyped

    private void jTextField5_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_7KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField5_7.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5_7KeyTyped

    private void jTextField5_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_8KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField5_8.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5_8KeyTyped

    private void jTextField5_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_9KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField5_9.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5_9KeyTyped

    private void jTextField3_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_1KeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField3_1.getText().length() == 1) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3_1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarMatriz;
    private javax.swing.JButton btnIntentar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnStart;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1_1;
    private javax.swing.JTextField jTextField1_2;
    private javax.swing.JTextField jTextField1_3;
    private javax.swing.JTextField jTextField1_4;
    private javax.swing.JTextField jTextField1_5;
    private javax.swing.JTextField jTextField1_6;
    private javax.swing.JTextField jTextField1_7;
    private javax.swing.JTextField jTextField1_8;
    private javax.swing.JTextField jTextField1_9;
    private javax.swing.JTextField jTextField2_1;
    private javax.swing.JTextField jTextField2_2;
    private javax.swing.JTextField jTextField2_3;
    private javax.swing.JTextField jTextField2_4;
    private javax.swing.JTextField jTextField2_5;
    private javax.swing.JTextField jTextField2_6;
    private javax.swing.JTextField jTextField2_7;
    private javax.swing.JTextField jTextField2_8;
    private javax.swing.JTextField jTextField2_9;
    private javax.swing.JTextField jTextField3_1;
    private javax.swing.JTextField jTextField3_2;
    private javax.swing.JTextField jTextField3_3;
    private javax.swing.JTextField jTextField3_4;
    private javax.swing.JTextField jTextField3_5;
    private javax.swing.JTextField jTextField3_6;
    private javax.swing.JTextField jTextField3_7;
    private javax.swing.JTextField jTextField3_8;
    private javax.swing.JTextField jTextField3_9;
    private javax.swing.JTextField jTextField4_1;
    private javax.swing.JTextField jTextField4_2;
    private javax.swing.JTextField jTextField4_3;
    private javax.swing.JTextField jTextField4_4;
    private javax.swing.JTextField jTextField4_5;
    private javax.swing.JTextField jTextField4_6;
    private javax.swing.JTextField jTextField4_7;
    private javax.swing.JTextField jTextField4_8;
    private javax.swing.JTextField jTextField4_9;
    private javax.swing.JTextField jTextField5_1;
    private javax.swing.JTextField jTextField5_2;
    private javax.swing.JTextField jTextField5_3;
    private javax.swing.JTextField jTextField5_4;
    private javax.swing.JTextField jTextField5_5;
    private javax.swing.JTextField jTextField5_6;
    private javax.swing.JTextField jTextField5_7;
    private javax.swing.JTextField jTextField5_8;
    private javax.swing.JTextField jTextField5_9;
    private javax.swing.JTextField jTextField6_1;
    private javax.swing.JTextField jTextField6_2;
    private javax.swing.JTextField jTextField6_3;
    private javax.swing.JTextField jTextField6_4;
    private javax.swing.JTextField jTextField6_5;
    private javax.swing.JTextField jTextField6_6;
    private javax.swing.JTextField jTextField6_7;
    private javax.swing.JTextField jTextField6_8;
    private javax.swing.JTextField jTextField6_9;
    private javax.swing.JTextField jTextField7_1;
    private javax.swing.JTextField jTextField7_2;
    private javax.swing.JTextField jTextField7_3;
    private javax.swing.JTextField jTextField7_4;
    private javax.swing.JTextField jTextField7_5;
    private javax.swing.JTextField jTextField7_6;
    private javax.swing.JTextField jTextField7_7;
    private javax.swing.JTextField jTextField7_8;
    private javax.swing.JTextField jTextField7_9;
    private javax.swing.JTextField jTextField8_1;
    private javax.swing.JTextField jTextField8_2;
    private javax.swing.JTextField jTextField8_3;
    private javax.swing.JTextField jTextField8_4;
    private javax.swing.JTextField jTextField8_5;
    private javax.swing.JTextField jTextField8_6;
    private javax.swing.JTextField jTextField8_7;
    private javax.swing.JTextField jTextField8_8;
    private javax.swing.JTextField jTextField8_9;
    private javax.swing.JTextField jTextField9_1;
    private javax.swing.JTextField jTextField9_2;
    private javax.swing.JTextField jTextField9_3;
    private javax.swing.JTextField jTextField9_4;
    private javax.swing.JTextField jTextField9_5;
    private javax.swing.JTextField jTextField9_6;
    private javax.swing.JTextField jTextField9_7;
    private javax.swing.JTextField jTextField9_8;
    private javax.swing.JTextField jTextField9_9;
    // End of variables declaration//GEN-END:variables

    public Matriz getSudoku() {
        return sudoku;
    }

    public void setSudoku(Matriz sudoku) {
        this.sudoku = sudoku;
    }

    public JButton getBtnCargarMatriz() {
        return btnCargarMatriz;
    }

    public void setBtnCargarMatriz(JButton btnCargarMatriz) {
        this.btnCargarMatriz = btnCargarMatriz;
    }

    public JButton getBtnIntentar() {
        return btnIntentar;
    }

    public void setBtnIntentar(JButton btnIntentar) {
        this.btnIntentar = btnIntentar;
    }

    public JButton getBtnReiniciar() {
        return btnReiniciar;
    }

    public void setBtnReiniciar(JButton btnReiniciar) {
        this.btnReiniciar = btnReiniciar;
    }

    public JButton getBtnStart() {
        return btnStart;
    }

    public void setBtnStart(JButton btnStart) {
        this.btnStart = btnStart;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    public JPanel getjPanel7() {
        return jPanel7;
    }

    public void setjPanel7(JPanel jPanel7) {
        this.jPanel7 = jPanel7;
    }

    public JPanel getjPanel8() {
        return jPanel8;
    }

    public void setjPanel8(JPanel jPanel8) {
        this.jPanel8 = jPanel8;
    }

    public JPanel getjPanel9() {
        return jPanel9;
    }

    public void setjPanel9(JPanel jPanel9) {
        this.jPanel9 = jPanel9;
    }

    public JTextField getjTextField1_1() {
        return jTextField1_1;
    }

    public void setjTextField1_1(JTextField jTextField1_1) {
        this.jTextField1_1 = jTextField1_1;
    }

    public JTextField getjTextField1_2() {
        return jTextField1_2;
    }

    public void setjTextField1_2(JTextField jTextField1_2) {
        this.jTextField1_2 = jTextField1_2;
    }

    public JTextField getjTextField1_3() {
        return jTextField1_3;
    }

    public void setjTextField1_3(JTextField jTextField1_3) {
        this.jTextField1_3 = jTextField1_3;
    }

    public JTextField getjTextField1_4() {
        return jTextField1_4;
    }

    public void setjTextField1_4(JTextField jTextField1_4) {
        this.jTextField1_4 = jTextField1_4;
    }

    public JTextField getjTextField1_5() {
        return jTextField1_5;
    }

    public void setjTextField1_5(JTextField jTextField1_5) {
        this.jTextField1_5 = jTextField1_5;
    }

    public JTextField getjTextField1_6() {
        return jTextField1_6;
    }

    public void setjTextField1_6(JTextField jTextField1_6) {
        this.jTextField1_6 = jTextField1_6;
    }

    public JTextField getjTextField1_7() {
        return jTextField1_7;
    }

    public void setjTextField1_7(JTextField jTextField1_7) {
        this.jTextField1_7 = jTextField1_7;
    }

    public JTextField getjTextField1_8() {
        return jTextField1_8;
    }

    public void setjTextField1_8(JTextField jTextField1_8) {
        this.jTextField1_8 = jTextField1_8;
    }

    public JTextField getjTextField1_9() {
        return jTextField1_9;
    }

    public void setjTextField1_9(JTextField jTextField1_9) {
        this.jTextField1_9 = jTextField1_9;
    }

    public JTextField getjTextField2_1() {
        return jTextField2_1;
    }

    public void setjTextField2_1(JTextField jTextField2_1) {
        this.jTextField2_1 = jTextField2_1;
    }

    public JTextField getjTextField2_2() {
        return jTextField2_2;
    }

    public void setjTextField2_2(JTextField jTextField2_2) {
        this.jTextField2_2 = jTextField2_2;
    }

    public JTextField getjTextField2_3() {
        return jTextField2_3;
    }

    public void setjTextField2_3(JTextField jTextField2_3) {
        this.jTextField2_3 = jTextField2_3;
    }

    public JTextField getjTextField2_4() {
        return jTextField2_4;
    }

    public void setjTextField2_4(JTextField jTextField2_4) {
        this.jTextField2_4 = jTextField2_4;
    }

    public JTextField getjTextField2_5() {
        return jTextField2_5;
    }

    public void setjTextField2_5(JTextField jTextField2_5) {
        this.jTextField2_5 = jTextField2_5;
    }

    public JTextField getjTextField2_6() {
        return jTextField2_6;
    }

    public void setjTextField2_6(JTextField jTextField2_6) {
        this.jTextField2_6 = jTextField2_6;
    }

    public JTextField getjTextField2_7() {
        return jTextField2_7;
    }

    public void setjTextField2_7(JTextField jTextField2_7) {
        this.jTextField2_7 = jTextField2_7;
    }

    public JTextField getjTextField2_8() {
        return jTextField2_8;
    }

    public void setjTextField2_8(JTextField jTextField2_8) {
        this.jTextField2_8 = jTextField2_8;
    }

    public JTextField getjTextField2_9() {
        return jTextField2_9;
    }

    public void setjTextField2_9(JTextField jTextField2_9) {
        this.jTextField2_9 = jTextField2_9;
    }

    public JTextField getjTextField3_1() {
        return jTextField3_1;
    }

    public void setjTextField3_1(JTextField jTextField3_1) {
        this.jTextField3_1 = jTextField3_1;
    }

    public JTextField getjTextField3_2() {
        return jTextField3_2;
    }

    public void setjTextField3_2(JTextField jTextField3_2) {
        this.jTextField3_2 = jTextField3_2;
    }

    public JTextField getjTextField3_3() {
        return jTextField3_3;
    }

    public void setjTextField3_3(JTextField jTextField3_3) {
        this.jTextField3_3 = jTextField3_3;
    }

    public JTextField getjTextField3_4() {
        return jTextField3_4;
    }

    public void setjTextField3_4(JTextField jTextField3_4) {
        this.jTextField3_4 = jTextField3_4;
    }

    public JTextField getjTextField3_5() {
        return jTextField3_5;
    }

    public void setjTextField3_5(JTextField jTextField3_5) {
        this.jTextField3_5 = jTextField3_5;
    }

    public JTextField getjTextField3_6() {
        return jTextField3_6;
    }

    public void setjTextField3_6(JTextField jTextField3_6) {
        this.jTextField3_6 = jTextField3_6;
    }

    public JTextField getjTextField3_7() {
        return jTextField3_7;
    }

    public void setjTextField3_7(JTextField jTextField3_7) {
        this.jTextField3_7 = jTextField3_7;
    }

    public JTextField getjTextField3_8() {
        return jTextField3_8;
    }

    public void setjTextField3_8(JTextField jTextField3_8) {
        this.jTextField3_8 = jTextField3_8;
    }

    public JTextField getjTextField3_9() {
        return jTextField3_9;
    }

    public void setjTextField3_9(JTextField jTextField3_9) {
        this.jTextField3_9 = jTextField3_9;
    }

    public JTextField getjTextField4_1() {
        return jTextField4_1;
    }

    public void setjTextField4_1(JTextField jTextField4_1) {
        this.jTextField4_1 = jTextField4_1;
    }

    public JTextField getjTextField4_2() {
        return jTextField4_2;
    }

    public void setjTextField4_2(JTextField jTextField4_2) {
        this.jTextField4_2 = jTextField4_2;
    }

    public JTextField getjTextField4_3() {
        return jTextField4_3;
    }

    public void setjTextField4_3(JTextField jTextField4_3) {
        this.jTextField4_3 = jTextField4_3;
    }

    public JTextField getjTextField4_4() {
        return jTextField4_4;
    }

    public void setjTextField4_4(JTextField jTextField4_4) {
        this.jTextField4_4 = jTextField4_4;
    }

    public JTextField getjTextField4_5() {
        return jTextField4_5;
    }

    public void setjTextField4_5(JTextField jTextField4_5) {
        this.jTextField4_5 = jTextField4_5;
    }

    public JTextField getjTextField4_6() {
        return jTextField4_6;
    }

    public void setjTextField4_6(JTextField jTextField4_6) {
        this.jTextField4_6 = jTextField4_6;
    }

    public JTextField getjTextField4_7() {
        return jTextField4_7;
    }

    public void setjTextField4_7(JTextField jTextField4_7) {
        this.jTextField4_7 = jTextField4_7;
    }

    public JTextField getjTextField4_8() {
        return jTextField4_8;
    }

    public void setjTextField4_8(JTextField jTextField4_8) {
        this.jTextField4_8 = jTextField4_8;
    }

    public JTextField getjTextField4_9() {
        return jTextField4_9;
    }

    public void setjTextField4_9(JTextField jTextField4_9) {
        this.jTextField4_9 = jTextField4_9;
    }

    public JTextField getjTextField5_1() {
        return jTextField5_1;
    }

    public void setjTextField5_1(JTextField jTextField5_1) {
        this.jTextField5_1 = jTextField5_1;
    }

    public JTextField getjTextField5_2() {
        return jTextField5_2;
    }

    public void setjTextField5_2(JTextField jTextField5_2) {
        this.jTextField5_2 = jTextField5_2;
    }

    public JTextField getjTextField5_3() {
        return jTextField5_3;
    }

    public void setjTextField5_3(JTextField jTextField5_3) {
        this.jTextField5_3 = jTextField5_3;
    }

    public JTextField getjTextField5_4() {
        return jTextField5_4;
    }

    public void setjTextField5_4(JTextField jTextField5_4) {
        this.jTextField5_4 = jTextField5_4;
    }

    public JTextField getjTextField5_5() {
        return jTextField5_5;
    }

    public void setjTextField5_5(JTextField jTextField5_5) {
        this.jTextField5_5 = jTextField5_5;
    }

    public JTextField getjTextField5_6() {
        return jTextField5_6;
    }

    public void setjTextField5_6(JTextField jTextField5_6) {
        this.jTextField5_6 = jTextField5_6;
    }

    public JTextField getjTextField5_7() {
        return jTextField5_7;
    }

    public void setjTextField5_7(JTextField jTextField5_7) {
        this.jTextField5_7 = jTextField5_7;
    }

    public JTextField getjTextField5_8() {
        return jTextField5_8;
    }

    public void setjTextField5_8(JTextField jTextField5_8) {
        this.jTextField5_8 = jTextField5_8;
    }

    public JTextField getjTextField5_9() {
        return jTextField5_9;
    }

    public void setjTextField5_9(JTextField jTextField5_9) {
        this.jTextField5_9 = jTextField5_9;
    }

    public JTextField getjTextField6_1() {
        return jTextField6_1;
    }

    public void setjTextField6_1(JTextField jTextField6_1) {
        this.jTextField6_1 = jTextField6_1;
    }

    public JTextField getjTextField6_2() {
        return jTextField6_2;
    }

    public void setjTextField6_2(JTextField jTextField6_2) {
        this.jTextField6_2 = jTextField6_2;
    }

    public JTextField getjTextField6_3() {
        return jTextField6_3;
    }

    public void setjTextField6_3(JTextField jTextField6_3) {
        this.jTextField6_3 = jTextField6_3;
    }

    public JTextField getjTextField6_4() {
        return jTextField6_4;
    }

    public void setjTextField6_4(JTextField jTextField6_4) {
        this.jTextField6_4 = jTextField6_4;
    }

    public JTextField getjTextField6_5() {
        return jTextField6_5;
    }

    public void setjTextField6_5(JTextField jTextField6_5) {
        this.jTextField6_5 = jTextField6_5;
    }

    public JTextField getjTextField6_6() {
        return jTextField6_6;
    }

    public void setjTextField6_6(JTextField jTextField6_6) {
        this.jTextField6_6 = jTextField6_6;
    }

    public JTextField getjTextField6_7() {
        return jTextField6_7;
    }

    public void setjTextField6_7(JTextField jTextField6_7) {
        this.jTextField6_7 = jTextField6_7;
    }

    public JTextField getjTextField6_8() {
        return jTextField6_8;
    }

    public void setjTextField6_8(JTextField jTextField6_8) {
        this.jTextField6_8 = jTextField6_8;
    }

    public JTextField getjTextField6_9() {
        return jTextField6_9;
    }

    public void setjTextField6_9(JTextField jTextField6_9) {
        this.jTextField6_9 = jTextField6_9;
    }

    public JTextField getjTextField7_1() {
        return jTextField7_1;
    }

    public void setjTextField7_1(JTextField jTextField7_1) {
        this.jTextField7_1 = jTextField7_1;
    }

    public JTextField getjTextField7_2() {
        return jTextField7_2;
    }

    public void setjTextField7_2(JTextField jTextField7_2) {
        this.jTextField7_2 = jTextField7_2;
    }

    public JTextField getjTextField7_3() {
        return jTextField7_3;
    }

    public void setjTextField7_3(JTextField jTextField7_3) {
        this.jTextField7_3 = jTextField7_3;
    }

    public JTextField getjTextField7_4() {
        return jTextField7_4;
    }

    public void setjTextField7_4(JTextField jTextField7_4) {
        this.jTextField7_4 = jTextField7_4;
    }

    public JTextField getjTextField7_5() {
        return jTextField7_5;
    }

    public void setjTextField7_5(JTextField jTextField7_5) {
        this.jTextField7_5 = jTextField7_5;
    }

    public JTextField getjTextField7_6() {
        return jTextField7_6;
    }

    public void setjTextField7_6(JTextField jTextField7_6) {
        this.jTextField7_6 = jTextField7_6;
    }

    public JTextField getjTextField7_7() {
        return jTextField7_7;
    }

    public void setjTextField7_7(JTextField jTextField7_7) {
        this.jTextField7_7 = jTextField7_7;
    }

    public JTextField getjTextField7_8() {
        return jTextField7_8;
    }

    public void setjTextField7_8(JTextField jTextField7_8) {
        this.jTextField7_8 = jTextField7_8;
    }

    public JTextField getjTextField7_9() {
        return jTextField7_9;
    }

    public void setjTextField7_9(JTextField jTextField7_9) {
        this.jTextField7_9 = jTextField7_9;
    }

    public JTextField getjTextField8_1() {
        return jTextField8_1;
    }

    public void setjTextField8_1(JTextField jTextField8_1) {
        this.jTextField8_1 = jTextField8_1;
    }

    public JTextField getjTextField8_2() {
        return jTextField8_2;
    }

    public void setjTextField8_2(JTextField jTextField8_2) {
        this.jTextField8_2 = jTextField8_2;
    }

    public JTextField getjTextField8_3() {
        return jTextField8_3;
    }

    public void setjTextField8_3(JTextField jTextField8_3) {
        this.jTextField8_3 = jTextField8_3;
    }

    public JTextField getjTextField8_4() {
        return jTextField8_4;
    }

    public void setjTextField8_4(JTextField jTextField8_4) {
        this.jTextField8_4 = jTextField8_4;
    }

    public JTextField getjTextField8_5() {
        return jTextField8_5;
    }

    public void setjTextField8_5(JTextField jTextField8_5) {
        this.jTextField8_5 = jTextField8_5;
    }

    public JTextField getjTextField8_6() {
        return jTextField8_6;
    }

    public void setjTextField8_6(JTextField jTextField8_6) {
        this.jTextField8_6 = jTextField8_6;
    }

    public JTextField getjTextField8_7() {
        return jTextField8_7;
    }

    public void setjTextField8_7(JTextField jTextField8_7) {
        this.jTextField8_7 = jTextField8_7;
    }

    public JTextField getjTextField8_8() {
        return jTextField8_8;
    }

    public void setjTextField8_8(JTextField jTextField8_8) {
        this.jTextField8_8 = jTextField8_8;
    }

    public JTextField getjTextField8_9() {
        return jTextField8_9;
    }

    public void setjTextField8_9(JTextField jTextField8_9) {
        this.jTextField8_9 = jTextField8_9;
    }

    public JTextField getjTextField9_1() {
        return jTextField9_1;
    }

    public void setjTextField9_1(JTextField jTextField9_1) {
        this.jTextField9_1 = jTextField9_1;
    }

    public JTextField getjTextField9_2() {
        return jTextField9_2;
    }

    public void setjTextField9_2(JTextField jTextField9_2) {
        this.jTextField9_2 = jTextField9_2;
    }

    public JTextField getjTextField9_3() {
        return jTextField9_3;
    }

    public void setjTextField9_3(JTextField jTextField9_3) {
        this.jTextField9_3 = jTextField9_3;
    }

    public JTextField getjTextField9_4() {
        return jTextField9_4;
    }

    public void setjTextField9_4(JTextField jTextField9_4) {
        this.jTextField9_4 = jTextField9_4;
    }

    public JTextField getjTextField9_5() {
        return jTextField9_5;
    }

    public void setjTextField9_5(JTextField jTextField9_5) {
        this.jTextField9_5 = jTextField9_5;
    }

    public JTextField getjTextField9_6() {
        return jTextField9_6;
    }

    public void setjTextField9_6(JTextField jTextField9_6) {
        this.jTextField9_6 = jTextField9_6;
    }

    public JTextField getjTextField9_7() {
        return jTextField9_7;
    }

    public void setjTextField9_7(JTextField jTextField9_7) {
        this.jTextField9_7 = jTextField9_7;
    }

    public JTextField getjTextField9_8() {
        return jTextField9_8;
    }

    public void setjTextField9_8(JTextField jTextField9_8) {
        this.jTextField9_8 = jTextField9_8;
    }

    public JTextField getjTextField9_9() {
        return jTextField9_9;
    }

    public void setjTextField9_9(JTextField jTextField9_9) {
        this.jTextField9_9 = jTextField9_9;
    }

}

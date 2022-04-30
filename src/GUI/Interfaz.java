/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DATA.Control;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import reglas.Validaciones;

/**
 *
 * @author usuario
 */
public class Interfaz extends javax.swing.JFrame {

    public JTextField matrizJTextField[][] = new JTextField[9][9];
    private Validaciones validaciones;

    /**
     * Creates new form intefaz
     */
    public Interfaz(Validaciones validaciones) {
        initComponents();
        agregarJTextField();
        this.setVisible(true);
        this.validaciones = validaciones;
    }

    /**
     * motodo donde se agregan los jTexField a un jTexField para ser mas comodo
     * de trabajar
     */
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
        jButtonIniciarJuego = new javax.swing.JButton();
        jButtonDeshacer = new javax.swing.JButton();
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
        jButtonRehacer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonIniciarJuego.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonIniciarJuego.setText("Iniciar Juego");
        jButtonIniciarJuego.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButtonIniciarJuego.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarJuegoActionPerformed(evt);
            }
        });

        jButtonDeshacer.setText("←");
        jButtonDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeshacerActionPerformed(evt);
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

        jButtonRehacer.setText("→");
        jButtonRehacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRehacerActionPerformed(evt);
            }
        });

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
                    .addComponent(jButtonIniciarJuego)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonDeshacer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRehacer)))
                .addContainerGap(12, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonIniciarJuego)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonDeshacer)
                                    .addComponent(jButtonRehacer))
                                .addGap(41, 41, 41))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keyTyped(javax.swing.JTextField jTextField, java.awt.event.KeyEvent evt, int i, int j) {
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (jTextField.getText().length() == 1) {
            evt.consume();
        }
        if (Character.isSpaceChar(evt.getKeyChar())) {
            evt.consume();
        }

        String numero = String.valueOf(evt.getKeyChar());
       
        if (numero.equals(matrizJTextField[i][j].getText())) {
            capturarNumero(numero, i, j);
        }
    }

    public void capturarNumero(String numero, int i, int j) {
        try {
            int num = Integer.parseInt(numero);
            boolean validar = validaciones.capturarNumero(i, j, num);

            if (validar == true) {
                validaciones.mostrarNumeros(matrizJTextField);
            } else if(validar == false) {
                JOptionPane.showMessageDialog(rootPane, "ingreso un numero no valido");
                matrizJTextField[i][j].setText("");
            }
        } catch (NumberFormatException e) {
        }
    }


    private void jTextField1_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_2KeyTyped
        keyTyped(jTextField1_2, evt, 0, 1);
    }//GEN-LAST:event_jTextField1_2KeyTyped

    private void jTextField1_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_1KeyTyped
        keyTyped(jTextField1_1, evt, 0, 0);
    }//GEN-LAST:event_jTextField1_1KeyTyped

    private void jTextField1_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_3KeyTyped
        keyTyped(jTextField1_3, evt, 0, 2);
    }//GEN-LAST:event_jTextField1_3KeyTyped

    private void jTextField1_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_4KeyTyped
        keyTyped(jTextField1_4, evt, 1, 0);
    }//GEN-LAST:event_jTextField1_4KeyTyped

    private void jTextField1_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_5KeyTyped
        keyTyped(jTextField1_5, evt, 1, 1);
    }//GEN-LAST:event_jTextField1_5KeyTyped

    private void jTextField1_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_6KeyTyped
        keyTyped(jTextField1_6, evt, 1, 2);
    }//GEN-LAST:event_jTextField1_6KeyTyped

    private void jTextField1_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_7KeyTyped
        keyTyped(jTextField1_7, evt, 2, 0);
    }//GEN-LAST:event_jTextField1_7KeyTyped

    private void jTextField1_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_8KeyTyped
        keyTyped(jTextField1_8, evt, 2, 1);
    }//GEN-LAST:event_jTextField1_8KeyTyped

    private void jTextField1_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_9KeyTyped
        keyTyped(jTextField1_9, evt, 2, 2);
    }//GEN-LAST:event_jTextField1_9KeyTyped

    private void jButtonIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarJuegoActionPerformed
        validaciones.mostrarNumeros(matrizJTextField);
    }//GEN-LAST:event_jButtonIniciarJuegoActionPerformed

    private void jTextField8_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_2KeyTyped
        keyTyped(jTextField8_2, evt, 6, 4);
    }//GEN-LAST:event_jTextField8_2KeyTyped

    private void jTextField8_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_1KeyTyped
        keyTyped(jTextField8_1, evt, 6, 3);
    }//GEN-LAST:event_jTextField8_1KeyTyped

    private void jTextField8_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_3KeyTyped
        keyTyped(jTextField8_3, evt, 6, 5);
    }//GEN-LAST:event_jTextField8_3KeyTyped

    private void jTextField8_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_4KeyTyped
        keyTyped(jTextField8_4, evt, 7, 3);
    }//GEN-LAST:event_jTextField8_4KeyTyped

    private void jTextField8_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_5KeyTyped
        keyTyped(jTextField8_5, evt, 7, 4);
    }//GEN-LAST:event_jTextField8_5KeyTyped

    private void jTextField8_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_6KeyTyped
        keyTyped(jTextField8_6, evt, 7, 5);
    }//GEN-LAST:event_jTextField8_6KeyTyped

    private void jTextField8_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_7KeyTyped
        keyTyped(jTextField8_7, evt, 8, 3);
    }//GEN-LAST:event_jTextField8_7KeyTyped

    private void jTextField8_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_8KeyTyped
        keyTyped(jTextField8_8, evt, 8, 4);
    }//GEN-LAST:event_jTextField8_8KeyTyped

    private void jTextField8_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8_9KeyTyped
        keyTyped(jTextField8_9, evt, 8, 5);
    }//GEN-LAST:event_jTextField8_9KeyTyped

    private void jTextField4_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_2KeyTyped
        keyTyped(jTextField4_2, evt, 3, 1);
    }//GEN-LAST:event_jTextField4_2KeyTyped

    private void jTextField4_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_1KeyTyped
        keyTyped(jTextField4_1, evt, 3, 0);
    }//GEN-LAST:event_jTextField4_1KeyTyped

    private void jTextField4_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_3KeyTyped
        keyTyped(jTextField4_3, evt, 3, 2);
    }//GEN-LAST:event_jTextField4_3KeyTyped

    private void jTextField4_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_4KeyTyped
        keyTyped(jTextField4_4, evt, 4, 0);
    }//GEN-LAST:event_jTextField4_4KeyTyped

    private void jTextField4_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_5KeyTyped
        keyTyped(jTextField4_5, evt, 4, 1);
    }//GEN-LAST:event_jTextField4_5KeyTyped

    private void jTextField4_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_6KeyTyped
        keyTyped(jTextField4_6, evt, 4, 2);
    }//GEN-LAST:event_jTextField4_6KeyTyped

    private void jTextField4_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_7KeyTyped
        keyTyped(jTextField4_7, evt, 5, 0);
    }//GEN-LAST:event_jTextField4_7KeyTyped

    private void jTextField4_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_8KeyTyped
        keyTyped(jTextField4_8, evt, 5, 1);
    }//GEN-LAST:event_jTextField4_8KeyTyped

    private void jTextField4_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_9KeyTyped
        keyTyped(jTextField4_9, evt, 5, 2);
    }//GEN-LAST:event_jTextField4_9KeyTyped

    private void jTextField9_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_2KeyTyped
        keyTyped(jTextField9_2, evt, 6, 7);
    }//GEN-LAST:event_jTextField9_2KeyTyped

    private void jTextField9_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_1KeyTyped
        keyTyped(jTextField9_1, evt, 6, 6);
    }//GEN-LAST:event_jTextField9_1KeyTyped

    private void jTextField9_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_3KeyTyped
        keyTyped(jTextField9_3, evt, 6, 8);
    }//GEN-LAST:event_jTextField9_3KeyTyped

    private void jTextField9_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_4KeyTyped
        keyTyped(jTextField9_4, evt, 7, 6);
    }//GEN-LAST:event_jTextField9_4KeyTyped

    private void jTextField9_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_5KeyTyped
        keyTyped(jTextField9_5, evt, 7, 7);
    }//GEN-LAST:event_jTextField9_5KeyTyped

    private void jTextField9_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_6KeyTyped
        keyTyped(jTextField9_6, evt, 7, 8);
    }//GEN-LAST:event_jTextField9_6KeyTyped

    private void jTextField9_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_7KeyTyped
        keyTyped(jTextField9_7, evt, 8, 6);
    }//GEN-LAST:event_jTextField9_7KeyTyped

    private void jTextField9_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_8KeyTyped
        keyTyped(jTextField9_8, evt, 8, 7);
    }//GEN-LAST:event_jTextField9_8KeyTyped

    private void jTextField9_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9_9KeyTyped
        keyTyped(jTextField9_9, evt, 8, 8);
    }//GEN-LAST:event_jTextField9_9KeyTyped

    private void jTextField3_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_2KeyTyped
        keyTyped(jTextField3_2, evt, 0, 7);
    }//GEN-LAST:event_jTextField3_2KeyTyped

    private void jTextField3_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_3KeyTyped
        keyTyped(jTextField3_3, evt, 0, 8);
    }//GEN-LAST:event_jTextField3_3KeyTyped

    private void jTextField3_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_4KeyTyped
        keyTyped(jTextField3_4, evt, 1, 6);
    }//GEN-LAST:event_jTextField3_4KeyTyped

    private void jTextField3_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_5KeyTyped
        keyTyped(jTextField3_5, evt, 1, 7);
    }//GEN-LAST:event_jTextField3_5KeyTyped

    private void jTextField3_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_6KeyTyped
        keyTyped(jTextField3_6, evt, 1, 8);
    }//GEN-LAST:event_jTextField3_6KeyTyped

    private void jTextField3_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_7KeyTyped
        keyTyped(jTextField3_7, evt, 2, 6);
    }//GEN-LAST:event_jTextField3_7KeyTyped

    private void jTextField3_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_8KeyTyped
        keyTyped(jTextField3_8, evt, 2, 7);
    }//GEN-LAST:event_jTextField3_8KeyTyped

    private void jTextField3_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_9KeyTyped
        keyTyped(jTextField3_9, evt, 2, 8);
    }//GEN-LAST:event_jTextField3_9KeyTyped

    private void jTextField6_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_2KeyTyped
        keyTyped(jTextField6_2, evt, 3, 6);
    }//GEN-LAST:event_jTextField6_2KeyTyped

    private void jTextField6_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_1KeyTyped
        keyTyped(jTextField6_1, evt, 3, 7);
    }//GEN-LAST:event_jTextField6_1KeyTyped

    private void jTextField6_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_3KeyTyped
        keyTyped(jTextField6_3, evt, 3, 8);
    }//GEN-LAST:event_jTextField6_3KeyTyped

    private void jTextField6_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_4KeyTyped
        keyTyped(jTextField6_4, evt, 4, 6);
    }//GEN-LAST:event_jTextField6_4KeyTyped

    private void jTextField6_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_5KeyTyped
        keyTyped(jTextField6_5, evt, 4, 7);
    }//GEN-LAST:event_jTextField6_5KeyTyped

    private void jTextField6_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_6KeyTyped
        keyTyped(jTextField6_6, evt, 4, 8);
    }//GEN-LAST:event_jTextField6_6KeyTyped

    private void jTextField6_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_7KeyTyped
        keyTyped(jTextField6_7, evt, 5, 6);
    }//GEN-LAST:event_jTextField6_7KeyTyped

    private void jTextField6_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_8KeyTyped
        keyTyped(jTextField6_8, evt, 5, 7);
    }//GEN-LAST:event_jTextField6_8KeyTyped

    private void jTextField6_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6_9KeyTyped
        keyTyped(jTextField6_9, evt, 5, 8);
    }//GEN-LAST:event_jTextField6_9KeyTyped

    private void jTextField2_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_2KeyTyped
        keyTyped(jTextField2_2, evt, 0, 4);
    }//GEN-LAST:event_jTextField2_2KeyTyped

    private void jTextField2_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_1KeyTyped
        keyTyped(jTextField2_1, evt, 0, 3);
    }//GEN-LAST:event_jTextField2_1KeyTyped

    private void jTextField2_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_3KeyTyped
        keyTyped(jTextField2_3, evt, 0, 5);
    }//GEN-LAST:event_jTextField2_3KeyTyped

    private void jTextField2_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_4KeyTyped
        keyTyped(jTextField2_4, evt, 1, 3);
    }//GEN-LAST:event_jTextField2_4KeyTyped

    private void jTextField2_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_5KeyTyped
        keyTyped(jTextField2_5, evt, 1, 4);
    }//GEN-LAST:event_jTextField2_5KeyTyped

    private void jTextField2_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_6KeyTyped
        keyTyped(jTextField2_6, evt, 1, 5);
    }//GEN-LAST:event_jTextField2_6KeyTyped

    private void jTextField2_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_7KeyTyped
        keyTyped(jTextField2_7, evt, 2, 3);
    }//GEN-LAST:event_jTextField2_7KeyTyped

    private void jTextField2_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_8KeyTyped
        keyTyped(jTextField2_8, evt, 2, 4);
    }//GEN-LAST:event_jTextField2_8KeyTyped

    private void jTextField2_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2_9KeyTyped
        keyTyped(jTextField2_9, evt, 2, 5);
    }//GEN-LAST:event_jTextField2_9KeyTyped

    private void jTextField7_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_2KeyTyped
        keyTyped(jTextField7_2, evt, 6, 1);
    }//GEN-LAST:event_jTextField7_2KeyTyped

    private void jTextField7_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_1KeyTyped
        keyTyped(jTextField7_1, evt, 6, 0);
    }//GEN-LAST:event_jTextField7_1KeyTyped

    private void jTextField7_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_3KeyTyped
        keyTyped(jTextField7_3, evt, 6, 2);
    }//GEN-LAST:event_jTextField7_3KeyTyped

    private void jTextField7_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_4KeyTyped
        keyTyped(jTextField7_4, evt, 7, 0);
    }//GEN-LAST:event_jTextField7_4KeyTyped

    private void jTextField7_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_5KeyTyped
        keyTyped(jTextField7_5, evt, 7, 1);
    }//GEN-LAST:event_jTextField7_5KeyTyped

    private void jTextField7_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_6KeyTyped
        keyTyped(jTextField7_6, evt, 7, 2);
    }//GEN-LAST:event_jTextField7_6KeyTyped

    private void jTextField7_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_7KeyTyped
        keyTyped(jTextField7_7, evt, 8, 0);
    }//GEN-LAST:event_jTextField7_7KeyTyped

    private void jTextField7_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_8KeyTyped
        keyTyped(jTextField7_8, evt, 8, 1);
    }//GEN-LAST:event_jTextField7_8KeyTyped

    private void jTextField7_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7_9KeyTyped
        keyTyped(jTextField7_9, evt, 8, 2);
    }//GEN-LAST:event_jTextField7_9KeyTyped

    private void jTextField5_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_2KeyTyped
        keyTyped(jTextField5_2, evt, 3, 4);
    }//GEN-LAST:event_jTextField5_2KeyTyped

    private void jTextField5_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_1KeyTyped
        keyTyped(jTextField5_1, evt, 3, 3);
    }//GEN-LAST:event_jTextField5_1KeyTyped

    private void jTextField5_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_3KeyTyped
        keyTyped(jTextField5_3, evt, 3, 5);
    }//GEN-LAST:event_jTextField5_3KeyTyped

    private void jTextField5_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_4KeyTyped
        keyTyped(jTextField5_4, evt, 4, 3);
    }//GEN-LAST:event_jTextField5_4KeyTyped

    private void jTextField5_5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_5KeyTyped
        keyTyped(jTextField5_5, evt, 4, 4);
    }//GEN-LAST:event_jTextField5_5KeyTyped

    private void jTextField5_6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_6KeyTyped
        keyTyped(jTextField5_6, evt, 4, 5);
    }//GEN-LAST:event_jTextField5_6KeyTyped

    private void jTextField5_7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_7KeyTyped
        keyTyped(jTextField5_7, evt, 5, 3);
    }//GEN-LAST:event_jTextField5_7KeyTyped

    private void jTextField5_8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_8KeyTyped
        keyTyped(jTextField5_8, evt, 5, 4);
    }//GEN-LAST:event_jTextField5_8KeyTyped

    private void jTextField5_9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_9KeyTyped
        keyTyped(jTextField5_9, evt, 5, 5);
    }//GEN-LAST:event_jTextField5_9KeyTyped

    private void jTextField3_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_1KeyTyped
        keyTyped(jTextField3_1, evt, 0, 6);
    }//GEN-LAST:event_jTextField3_1KeyTyped

    private void jButtonDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeshacerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeshacerActionPerformed

    private void jButtonRehacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRehacerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRehacerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonDeshacer;
    private javax.swing.JButton jButtonIniciarJuego;
    private javax.swing.JButton jButtonRehacer;
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

}

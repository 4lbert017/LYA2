package AnalizadorL;

import AnalizadorL.Token;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import AnalizadorL.Token.Tipos;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.UIManager;
import com.jtattoo.plaf.aero.*;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AnalizadorLexico extends javax.swing.JFrame {
    int num = 0;
        int ope = 0;
        int var = 0;
        int cons = 0;
        int desc = 0;

    public AnalizadorLexico() {

        initComponents();
        this.setLocationRelativeTo(null);
    
        // Agregar un KeyListener al campo de texto
        txtExpresion.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnAnalizarActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtExpresion = new javax.swing.JTextField();
        btnAnalizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtC = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultado1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Agrega una expresión ");

        txtExpresion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtExpresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpresionActionPerformed(evt);
            }
        });

        btnAnalizar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Resultado");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setText("Analizador léxico");

        txtC.setEditable(false);
        txtC.setColumns(20);
        txtC.setRows(5);
        jScrollPane2.setViewportView(txtC);

        txtResultado1.setEditable(false);
        txtResultado1.setColumns(20);
        txtResultado1.setRows(5);
        jScrollPane3.setViewportView(txtResultado1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Resumen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44))
                            .addComponent(txtExpresion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(btnAnalizar)))))
                .addContainerGap(257, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(213, 213, 213))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(342, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(118, 118, 118)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(txtExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnalizar))
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(213, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        String entrada = this.txtExpresion.getText();
        ArrayList<Token> tokens = lex(entrada);
        String result = "";
        for (Token token : tokens) {
            result = result + token.getTipo() + " : " + token.getValor() + "\n";
        }//cierre del for
        this.txtResultado1.setText(result);
        String encontrados = ("Numeros encontrados: " + num
            + "\nOperadores encontrados: " + ope
            + "\nVariables encontradas: " + var
            + "\nConstantes encontrads: " + cons
            + "\nDesconocidos encontrados: " + desc);
        this.txtC.setText(encontrados);
        
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void txtExpresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpresionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpresionActionPerformed


    public static void main(String args[]) {
        try {
            //AeroLookAndFeel.setTheme("Green-Giant-Font");
            UIManager.setLookAndFeel(new HiFiLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new AnalizadorLexico().setVisible(true);
            }
        });
    }

    private  ArrayList<Token> lex(String entrada) {
        final ArrayList<Token> tokens = new ArrayList();
        final StringTokenizer st = new StringTokenizer(entrada);
        //variables para contadores
        
        while (st.hasMoreTokens()) {
            String palabra = st.nextToken();
            boolean bandera = false;

            for (Tipos tokenTipo : Tipos.values()) {
                Pattern patron = Pattern.compile(tokenTipo.patron);
                Matcher busqueda = patron.matcher(palabra);

                if (busqueda.find()) {
                    Token token = new Token();
                    token.setTipo(tokenTipo);
                    token.setValor(palabra);
                    //contador de los valores    
                    if (String.valueOf(token.getTipo()).equals("NUMERO")) {
                        num += 1;
                    } else if (String.valueOf(token.getTipo()).equals("OPERADOR")) {
                        ope += 1;
                    } else if (String.valueOf(token.getTipo()).equals("VARIABLE")) {
                        var += 1;
                    } else if (String.valueOf(token.getTipo()).equals("CONSTANTE")) {
                        cons += 1;
                    } else if (String.valueOf(token.getTipo()).equals("DESCONOCIDO")) {
                        desc += 1;
                    }//cierre del else if de contadores

                    tokens.add(token);
                    bandera = true;
                    break; 
                }//cierre del if
            }//cierre del for

        }//cierre de while
        
       
        
        return tokens;
    }//cierre de Array

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtC;
    private javax.swing.JTextField txtExpresion;
    private javax.swing.JTextArea txtResultado1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.telas;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class CalculadoraIMC extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraIMC
     */
    public CalculadoraIMC() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
        DecimalFormat df = new DecimalFormat("0.##");
        double imc, peso, altura;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        masc = new javax.swing.JRadioButton();
        fem = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setText("Peso (kg):");

        txtPeso.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel2.setText("Gênero:");

        txtAltura.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N

        Calcular.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setText("Resultado:");

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel4.setText("Altura (m):");

        genero.add(masc);
        masc.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        masc.setText("Masculino");

        genero.add(fem);
        fem.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        fem.setText("Feminino");

        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(masc)
                                .addGap(18, 18, 18)
                                .addComponent(fem))
                            .addComponent(txtPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(txtAltura)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(Calcular)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(masc)
                    .addComponent(fem))
                .addGap(18, 18, 18)
                .addComponent(Calcular)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(104, 104, 104))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        if (txtPeso.getText().equals("") || txtPeso.getText().equals(".") || txtPeso.getText().equals(",") || txtAltura.getText().equals("") || txtAltura.getText().equals(".") || txtAltura.getText().equals(",") || (masc.isSelected() == false && fem.isSelected() == false) ) {
            // nada
        } else {
            String resultado = "";
            double pesoIdeal = 0;
            if (txtPeso.getText().contains(",")) {
            peso = Double.parseDouble(txtPeso.getText().replace(",", "."));
        } else {
            peso = Double.parseDouble(txtPeso.getText());
        } if (txtAltura.getText().contains(",")) {
            altura = Double.parseDouble(txtAltura.getText().replace(",", "."));
        } else {
            altura = Double.parseDouble(txtAltura.getText());
        }
        
        if (altura == 0) {
            txtResultado.setText("Digite um valor diferente de 0!");
        } else {
            imc = peso / (altura*altura);
            if(imc < 16){
                resultado = "Magreza grave";
            } else if (imc >=16 && imc< 17) {
                resultado = "Magreza moderada";
            } else if (imc >= 17 && imc< 18.5) {
                resultado = "Abaixo do peso";
            } else if(imc >= 18.5 && imc< 25){
                resultado = "Peso normal";
            }
            else if(imc >= 25 && imc< 30){
                resultado = "Acima do peso";
            }
            else if(imc >=30 && imc< 35){
                resultado = "Obesidade I";
           }
            else if(imc >= 35 && imc< 40){
                resultado = "Obesidade II";
            } else {
                resultado = "Obesidade Mórbida";
            }
            if (masc.isSelected()) {
                 pesoIdeal = (72.7 * altura) - 58;
            } else if (fem.isSelected()) {
                 pesoIdeal = (62.1 * altura) - 44.7;
            }
        } txtResultado.setText("IMC: " + df.format(imc) + " (" + resultado + ")\nPeso ideal: " + df.format(pesoIdeal) + " kg");
            
        }
    }//GEN-LAST:event_CalcularActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraIMC().setVisible(true);
                txtPeso.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ( (!"0123456789.,".contains(String.valueOf(c))) && (c != KeyEvent.VK_BACK_SPACE)) || ( (c == '.' || c == ',') && (txtPeso.getText().contains(".") || txtPeso.getText().contains(",")) ) ) {
                    e.consume();
                }
            }
        }); txtAltura.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ( (!"0123456789.,".contains(String.valueOf(c))) && (c != KeyEvent.VK_BACK_SPACE)) || ( (c == '.' || c == ',') && (txtAltura.getText().contains(".") || txtAltura.getText().contains(",")) ) ) {
                    e.consume();
                }
            }
        });
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JRadioButton fem;
    private javax.swing.ButtonGroup genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton masc;
    private static javax.swing.JTextField txtAltura;
    private static javax.swing.JTextField txtPeso;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}

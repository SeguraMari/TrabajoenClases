package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JColorChooser;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class FrmProcesadorTexto extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmProcesadorTexto.class.getName());

    /**
     * Creates new form FrmProcesadorTexto
     */
    public FrmProcesadorTexto() {
        initComponents();

        configurarDocumentListener();

        mniCambiarColor.setText("Cambiar De Color");
        mniCambiarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemColorActionPerformed(evt);
            }
        });
        jmnColor.add(mniCambiarColor);

        cmbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"10", "12", "14", "16", "18", "20"}));
        cmbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarEstilo();
            }
        });

    }

    private void cambiarEstilo() {
        String fuente = cmbFont.getSelectedItem().toString();
        int tamano = Integer.parseInt(cmbSize.getSelectedItem().toString());
        int estilo = Font.PLAIN;

        if (chkBold.isSelected()) {
            estilo += Font.BOLD;
        }
        if (chkItalic.isSelected()) {
            estilo += Font.ITALIC;
        }

        txtaAreaTrabajo.setFont(new Font(fuente, estilo, tamano));

        int tamaño = Integer.parseInt((String) cmbSize.getSelectedItem());

        Font fontFinal = new Font(fuente, estilo, tamaño);
        txtaAreaTrabajo.setFont(fontFinal);

    }

    private void contarPalabras() {
        String texto = txtaAreaTrabajo.getText().trim();
        int contarPalabra = texto.isEmpty() ? 0 : texto.split("\\s+").length;
        txtContadorDePalabras.setText(String.valueOf(contarPalabra));

    }

    private void itemColorActionPerformed(java.awt.event.ActionEvent evt) {
        Color nuevoColor = JColorChooser.showDialog(this, "Seleccionar color", txtaAreaTrabajo.getForeground());
        if (nuevoColor != null) {
            txtaAreaTrabajo.setForeground(nuevoColor); // Cambia el color del texto
        }
    }

    private void configurarDocumentListener() {
        txtaAreaTrabajo.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                contarPalabras();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                contarPalabras();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                contarPalabras();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        pnlBarraHerramientas = new javax.swing.JPanel();
        lblFont = new javax.swing.JLabel();
        cmbFont = new javax.swing.JComboBox<>();
        lblSize = new javax.swing.JLabel();
        cmbSize = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jchkBold = new javax.swing.JCheckBox();
        jchkItalic = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblContadorDePalabras = new javax.swing.JLabel();
        txtContadorDePalabras = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaAreaTrabajo = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmnFile = new javax.swing.JMenu();
        mniNuevo = new javax.swing.JMenuItem();
        mniCerrar = new javax.swing.JMenuItem();
        jmnStyle = new javax.swing.JMenu();
        chkBold = new javax.swing.JCheckBoxMenuItem();
        chkItalic = new javax.swing.JCheckBoxMenuItem();
        jmnColor = new javax.swing.JMenu();
        mniCambiarColor = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jCheckBox1.setText("jCheckBox1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word Processor");

        pnlBarraHerramientas.setBackground(new java.awt.Color(204, 204, 204));

        lblFont.setText("Font");

        cmbFont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Century Gothic", "Calibri Body", "Arial ", "Agency FB", "Aptos" }));
        cmbFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFontActionPerformed(evt);
            }
        });

        lblSize.setText("Size");

        cmbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "12", "14", "16", "18", "20" }));

        jchkBold.setText("Bold");
        jchkBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkBoldActionPerformed(evt);
            }
        });

        jchkItalic.setText("Italic");
        jchkItalic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkItalicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jchkBold, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jchkItalic, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jchkBold)
                    .addComponent(jchkItalic))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Font Style");

        javax.swing.GroupLayout pnlBarraHerramientasLayout = new javax.swing.GroupLayout(pnlBarraHerramientas);
        pnlBarraHerramientas.setLayout(pnlBarraHerramientasLayout);
        pnlBarraHerramientasLayout.setHorizontalGroup(
            pnlBarraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraHerramientasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFont)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(pnlBarraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraHerramientasLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)))
                .addGap(15, 15, 15))
        );
        pnlBarraHerramientasLayout.setVerticalGroup(
            pnlBarraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraHerramientasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBarraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBarraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSize)
                        .addComponent(lblFont)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lblContadorDePalabras.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblContadorDePalabras.setText("Contador De Palabras");

        txtContadorDePalabras.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContadorDePalabras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContadorDePalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContadorDePalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContadorDePalabras))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        txtaAreaTrabajo.setColumns(20);
        txtaAreaTrabajo.setRows(5);
        jScrollPane1.setViewportView(txtaAreaTrabajo);

        jmnFile.setText("File");

        mniNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-agregar-archivo-16.png"))); // NOI18N
        mniNuevo.setText("Nuevo(CTRL+N)");
        mniNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNuevoActionPerformed(evt);
            }
        });
        jmnFile.add(mniNuevo);

        mniCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-cerrar-ventana-16.png"))); // NOI18N
        mniCerrar.setText("Cerrar(CTRL+C)");
        mniCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCerrarActionPerformed(evt);
            }
        });
        jmnFile.add(mniCerrar);

        jMenuBar1.add(jmnFile);

        jmnStyle.setText(" Style");

        chkBold.setSelected(true);
        chkBold.setText("Bold(CTRL+B)");
        chkBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoldActionPerformed(evt);
            }
        });
        jmnStyle.add(chkBold);

        chkItalic.setSelected(true);
        chkItalic.setText(" Italic(CTRL+I)");
        chkItalic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkItalicActionPerformed(evt);
            }
        });
        jmnStyle.add(chkItalic);

        jMenuBar1.add(jmnStyle);

        jmnColor.setText(" Color");

        mniCambiarColor.setText("Cambiar De Calor");
        mniCambiarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCambiarColorActionPerformed(evt);
            }
        });
        jmnColor.add(mniCambiarColor);

        jMenuBar1.add(jmnColor);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBarraHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBarraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNuevoActionPerformed
        txtaAreaTrabajo.setText("");
        txtaAreaTrabajo.setEnabled(true);
    }//GEN-LAST:event_mniNuevoActionPerformed

    private void mniCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCerrarActionPerformed
        txtaAreaTrabajo.setText("");
        txtaAreaTrabajo.setEnabled(false);
    }//GEN-LAST:event_mniCerrarActionPerformed

    private void chkBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoldActionPerformed
        chkBold.setSelected(chkBold.isSelected());
        cambiarEstilo();
    }//GEN-LAST:event_chkBoldActionPerformed

    private void chkItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkItalicActionPerformed
        chkItalic.setSelected(chkItalic.isSelected());
        cambiarEstilo();
    }//GEN-LAST:event_chkItalicActionPerformed

    private void cmbFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFontActionPerformed
        cambiarEstilo();
    }//GEN-LAST:event_cmbFontActionPerformed

    private void jchkBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkBoldActionPerformed
        jchkBold.setSelected(chkBold.isSelected());
        cambiarEstilo();
    }//GEN-LAST:event_jchkBoldActionPerformed

    private void jchkItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkItalicActionPerformed
        jchkItalic.setSelected(jchkItalic.isSelected());
        cambiarEstilo();
    }//GEN-LAST:event_jchkItalicActionPerformed

    private void mniCambiarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCambiarColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniCambiarColorActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmProcesadorTexto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem chkBold;
    private javax.swing.JCheckBoxMenuItem chkItalic;
    private javax.swing.JComboBox<String> cmbFont;
    private javax.swing.JComboBox<String> cmbSize;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jchkBold;
    private javax.swing.JCheckBox jchkItalic;
    private javax.swing.JMenu jmnColor;
    private javax.swing.JMenu jmnFile;
    private javax.swing.JMenu jmnStyle;
    private javax.swing.JLabel lblContadorDePalabras;
    private javax.swing.JLabel lblFont;
    private javax.swing.JLabel lblSize;
    private javax.swing.JMenuItem mniCambiarColor;
    private javax.swing.JMenuItem mniCerrar;
    private javax.swing.JMenuItem mniNuevo;
    private javax.swing.JPanel pnlBarraHerramientas;
    private javax.swing.JTextField txtContadorDePalabras;
    private javax.swing.JTextArea txtaAreaTrabajo;
    // End of variables declaration//GEN-END:variables
}

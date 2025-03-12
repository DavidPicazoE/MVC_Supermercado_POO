/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author david
 */
public class V_EliminarProducte extends javax.swing.JDialog {

    /**
     * Creates new form V_EliminarProducte
     */
    public V_EliminarProducte(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConfirmarCancelar = new javax.swing.ButtonGroup();
        EliminProd_codi_label = new javax.swing.JLabel();
        EliminProd__codi_combobox = new javax.swing.JComboBox<>();
        EliminProd_nom_label = new javax.swing.JLabel();
        EliminProd_preuuPunto_label = new javax.swing.JLabel();
        EliminProd_Categoria_label = new javax.swing.JLabel();
        ELiminar_prodNomPUNTO_label = new javax.swing.JLabel();
        EliminProd_preu_label = new javax.swing.JLabel();
        EliminProd_catPUNTO_label = new javax.swing.JLabel();
        EliminProd_Dades_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcio_prod_textarea = new javax.swing.JTextArea();
        eliminarProducteDOS_button = new javax.swing.JButton();
        eliminar_confirmar_radiobuton = new javax.swing.JRadioButton();
        eliminar_cancelar_radiobutton = new javax.swing.JRadioButton();
        eliminar_perible_label = new javax.swing.JLabel();
        eliminar_peribleI_checkbox = new javax.swing.JCheckBox();
        Titulo = new javax.swing.JLabel();
        FOTOfondojLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EliminProd_codi_label.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        EliminProd_codi_label.setForeground(new java.awt.Color(0, 0, 0));
        EliminProd_codi_label.setText("Codigo");
        getContentPane().add(EliminProd_codi_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 60, 30));

        EliminProd__codi_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(EliminProd__codi_combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 80, 30));

        EliminProd_nom_label.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        EliminProd_nom_label.setForeground(new java.awt.Color(0, 0, 0));
        EliminProd_nom_label.setText("Nombre:");
        getContentPane().add(EliminProd_nom_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 70, 30));

        EliminProd_preuuPunto_label.setForeground(new java.awt.Color(0, 0, 0));
        EliminProd_preuuPunto_label.setText("...");
        getContentPane().add(EliminProd_preuuPunto_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 100, 20));

        EliminProd_Categoria_label.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        EliminProd_Categoria_label.setForeground(new java.awt.Color(0, 0, 0));
        EliminProd_Categoria_label.setText("Categorias");
        getContentPane().add(EliminProd_Categoria_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        ELiminar_prodNomPUNTO_label.setForeground(new java.awt.Color(0, 0, 0));
        ELiminar_prodNomPUNTO_label.setText("...");
        getContentPane().add(ELiminar_prodNomPUNTO_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 90, 20));

        EliminProd_preu_label.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        EliminProd_preu_label.setForeground(new java.awt.Color(0, 0, 0));
        EliminProd_preu_label.setText("Precio");
        getContentPane().add(EliminProd_preu_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        EliminProd_catPUNTO_label.setForeground(new java.awt.Color(0, 0, 0));
        EliminProd_catPUNTO_label.setText("...");
        getContentPane().add(EliminProd_catPUNTO_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 100, 20));

        EliminProd_Dades_label.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        EliminProd_Dades_label.setForeground(new java.awt.Color(0, 0, 0));
        EliminProd_Dades_label.setText("Datos");
        getContentPane().add(EliminProd_Dades_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        descripcio_prod_textarea.setColumns(20);
        descripcio_prod_textarea.setRows(5);
        jScrollPane1.setViewportView(descripcio_prod_textarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 380, 70));

        eliminarProducteDOS_button.setText("Eliminar");
        getContentPane().add(eliminarProducteDOS_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 120, 40));

        ConfirmarCancelar.add(eliminar_confirmar_radiobuton);
        eliminar_confirmar_radiobuton.setForeground(new java.awt.Color(0, 0, 0));
        eliminar_confirmar_radiobuton.setText("Confirmar");
        getContentPane().add(eliminar_confirmar_radiobuton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        ConfirmarCancelar.add(eliminar_cancelar_radiobutton);
        eliminar_cancelar_radiobutton.setForeground(new java.awt.Color(0, 0, 0));
        eliminar_cancelar_radiobutton.setText("Cancelar");
        getContentPane().add(eliminar_cancelar_radiobutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        eliminar_perible_label.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        eliminar_perible_label.setForeground(new java.awt.Color(0, 0, 0));
        eliminar_perible_label.setText("Perecedero");
        getContentPane().add(eliminar_perible_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        eliminar_peribleI_checkbox.setForeground(new java.awt.Color(0, 0, 0));
        eliminar_peribleI_checkbox.setText("Si");
        eliminar_peribleI_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_peribleI_checkboxActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar_peribleI_checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        Titulo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Eliminar Producto");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 170, 40));

        FOTOfondojLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        FOTOfondojLabel1.setForeground(new java.awt.Color(0, 0, 0));
        FOTOfondojLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Enfocado.jpg"))); // NOI18N
        FOTOfondojLabel1.setOpaque(true);
        getContentPane().add(FOTOfondojLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminar_peribleI_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_peribleI_checkboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_peribleI_checkboxActionPerformed

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
            java.util.logging.Logger.getLogger(V_EliminarProducte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_EliminarProducte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_EliminarProducte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_EliminarProducte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                V_EliminarProducte dialog = new V_EliminarProducte(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public ButtonGroup getConfirmarCancelar() {
        return ConfirmarCancelar;
    }

    public void setConfirmarCancelar(ButtonGroup ConfirmarCancelar) {
        this.ConfirmarCancelar = ConfirmarCancelar;
    }

    public JLabel getELiminar_prodNomPUNTO_label() {
        return ELiminar_prodNomPUNTO_label;
    }

    public void setELiminar_prodNomPUNTO_label(JLabel ELiminar_prodNomPUNTO_label) {
        this.ELiminar_prodNomPUNTO_label = ELiminar_prodNomPUNTO_label;
    }

    public JLabel getEliminProd_Categoria_label() {
        return EliminProd_Categoria_label;
    }

    public void setEliminProd_Categoria_label(JLabel EliminProd_Categoria_label) {
        this.EliminProd_Categoria_label = EliminProd_Categoria_label;
    }

    public JLabel getEliminProd_Dades_label() {
        return EliminProd_Dades_label;
    }

    public void setEliminProd_Dades_label(JLabel EliminProd_Dades_label) {
        this.EliminProd_Dades_label = EliminProd_Dades_label;
    }

    public JComboBox<String> getEliminProd__codi_combobox() {
        return EliminProd__codi_combobox;
    }

    public void setEliminProd__codi_combobox(JComboBox<String> EliminProd__codi_combobox) {
        this.EliminProd__codi_combobox = EliminProd__codi_combobox;
    }

    public JLabel getEliminProd_catPUNTO_label() {
        return EliminProd_catPUNTO_label;
    }

    public void setEliminProd_catPUNTO_label(JLabel EliminProd_catPUNTO_label) {
        this.EliminProd_catPUNTO_label = EliminProd_catPUNTO_label;
    }

    public JLabel getEliminProd_codi_label() {
        return EliminProd_codi_label;
    }

    public void setEliminProd_codi_label(JLabel EliminProd_codi_label) {
        this.EliminProd_codi_label = EliminProd_codi_label;
    }

    public JLabel getEliminProd_nom_label() {
        return EliminProd_nom_label;
    }

    public void setEliminProd_nom_label(JLabel EliminProd_nom_label) {
        this.EliminProd_nom_label = EliminProd_nom_label;
    }

    public JLabel getEliminProd_preu_label() {
        return EliminProd_preu_label;
    }

    public void setEliminProd_preu_label(JLabel EliminProd_preu_label) {
        this.EliminProd_preu_label = EliminProd_preu_label;
    }

    public JLabel getEliminProd_preuuPunto_label() {
        return EliminProd_preuuPunto_label;
    }

    public void setEliminProd_preuuPunto_label(JLabel EliminProd_preuuPunto_label) {
        this.EliminProd_preuuPunto_label = EliminProd_preuuPunto_label;
    }

    public JLabel getFOTOfondojLabel1() {
        return FOTOfondojLabel1;
    }

    public void setFOTOfondojLabel1(JLabel FOTOfondojLabel1) {
        this.FOTOfondojLabel1 = FOTOfondojLabel1;
    }

    public JLabel getTitulo() {
        return Titulo;
    }

    public void setTitulo(JLabel Titulo) {
        this.Titulo = Titulo;
    }

    public JTextArea getDescripcio_prod_textarea() {
        return descripcio_prod_textarea;
    }

    public void setDescripcio_prod_textarea(JTextArea descripcio_prod_textarea) {
        this.descripcio_prod_textarea = descripcio_prod_textarea;
    }

    public JButton getEliminarProducteDOS_button() {
        return eliminarProducteDOS_button;
    }

    public void setEliminarProducteDOS_button(JButton eliminarProducteDOS_button) {
        this.eliminarProducteDOS_button = eliminarProducteDOS_button;
    }

    public JRadioButton getEliminar_cancelar_radiobutton() {
        return eliminar_cancelar_radiobutton;
    }

    public void setEliminar_cancelar_radiobutton(JRadioButton eliminar_cancelar_radiobutton) {
        this.eliminar_cancelar_radiobutton = eliminar_cancelar_radiobutton;
    }

    public JRadioButton getEliminar_confirmar_radiobuton() {
        return eliminar_confirmar_radiobuton;
    }

    public void setEliminar_confirmar_radiobuton(JRadioButton eliminar_confirmar_radiobuton) {
        this.eliminar_confirmar_radiobuton = eliminar_confirmar_radiobuton;
    }

    public JCheckBox getEliminar_peribleI_checkbox() {
        return eliminar_peribleI_checkbox;
    }

    public void setEliminar_peribleI_checkbox(JCheckBox eliminar_peribleI_checkbox) {
        this.eliminar_peribleI_checkbox = eliminar_peribleI_checkbox;
    }

    public JLabel getEliminar_perible_label() {
        return eliminar_perible_label;
    }

    public void setEliminar_perible_label(JLabel eliminar_perible_label) {
        this.eliminar_perible_label = eliminar_perible_label;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

  
    

   

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ConfirmarCancelar;
    private javax.swing.JLabel ELiminar_prodNomPUNTO_label;
    private javax.swing.JLabel EliminProd_Categoria_label;
    private javax.swing.JLabel EliminProd_Dades_label;
    private javax.swing.JComboBox<String> EliminProd__codi_combobox;
    private javax.swing.JLabel EliminProd_catPUNTO_label;
    private javax.swing.JLabel EliminProd_codi_label;
    private javax.swing.JLabel EliminProd_nom_label;
    private javax.swing.JLabel EliminProd_preu_label;
    private javax.swing.JLabel EliminProd_preuuPunto_label;
    private javax.swing.JLabel FOTOfondojLabel1;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextArea descripcio_prod_textarea;
    private javax.swing.JButton eliminarProducteDOS_button;
    private javax.swing.JRadioButton eliminar_cancelar_radiobutton;
    private javax.swing.JRadioButton eliminar_confirmar_radiobuton;
    private javax.swing.JCheckBox eliminar_peribleI_checkbox;
    private javax.swing.JLabel eliminar_perible_label;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

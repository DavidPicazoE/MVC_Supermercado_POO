/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.M_Supermercat;
import View.V_AfegirProducte;
import View.V_Main;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;
import Model.M_Categoria;
import java.awt.event.ActionEvent;
import Model.M_Producto;
import View.V_EliminarProducte;
import java.awt.event.WindowEvent;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author david
 */
public class C_EliminarProducte extends WindowAdapter implements ActionListener {

    private V_Main v_main;
    private M_Supermercat m_supermercat;
    private V_EliminarProducte v_eliminarProd = new V_EliminarProducte(new javax.swing.JFrame(), true);
    private C_Principal c_principal;

    public C_EliminarProducte(V_Main v_main, M_Supermercat m_supermercat, C_Principal c_principal) {
        this.v_main = v_main;
        this.m_supermercat = m_supermercat;
        this.c_principal = c_principal;
        this.v_eliminarProd.addWindowListener(this);
        this.v_eliminarProd.getEliminarProducteDOS_button().addActionListener(this);

    }

    public void run() {
        getCodis();
        initComponents();
        v_eliminarProd.setTitle("Eliminar Producto");
        v_eliminarProd.setLocationRelativeTo(null);
        v_eliminarProd.getEliminProd__codi_combobox().addActionListener(new eliminarcodicomboboxActListener());
        v_eliminarProd.setVisible(true);
    }

    public void initComponents() {
        //set comboBox witht he names of courses
        int index = v_eliminarProd.getEliminProd__codi_combobox().getSelectedIndex();
        int codi = Integer.parseInt(v_eliminarProd.getEliminProd__codi_combobox().getItemAt(index));
        M_Producto m_Producto = m_supermercat.getProducto(codi);
        v_eliminarProd.getELiminar_prodNomPUNTO_label().setText(m_Producto.nomProduct);
        v_eliminarProd.getEliminProd_catPUNTO_label().setText("" + m_Producto.categoria);
        v_eliminarProd.getEliminProd_preuuPunto_label().setText("" + m_Producto.preu);
        v_eliminarProd.getDescripcio_prod_textarea().setText(m_Producto.datos);
        if (m_Producto.perible) {
            v_eliminarProd.getEliminar_peribleI_checkbox().setSelected(true);
        } else {
            v_eliminarProd.getEliminar_peribleI_checkbox().setSelected(false);
        }
    }

    public void getCodis() {
        v_eliminarProd.getEliminProd__codi_combobox().removeAllItems();

        if (m_supermercat != null) {
            ArrayList<M_Producto> product = m_supermercat.allProducto();

            for (M_Producto p : product) {
                v_eliminarProd.getEliminProd__codi_combobox().addItem("" + p.getCodi());
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (v_eliminarProd.getEliminar_confirmar_radiobuton().isSelected() == false) {
            showMessageDialog(null, "No has confirmat");
        } else {
            int index = v_eliminarProd.getEliminProd__codi_combobox().getSelectedIndex();
            int codi = Integer.parseInt(v_eliminarProd.getEliminProd__codi_combobox().getItemAt(index));
            M_Producto m_Producto = m_supermercat.getProducto(codi);
            m_supermercat.removeProd(m_Producto);
            M_Categoria m_Categoria = m_supermercat.getCategoria(v_eliminarProd.getEliminProd_catPUNTO_label().getText());
            m_Categoria.removeProducte(m_Producto);

            showMessageDialog(null, "S'ha eliminat el producte");
            windowClosing(new WindowEvent(v_eliminarProd, WindowEvent.WINDOW_CLOSING));
        }

    }

    @Override
    public void windowClosing(WindowEvent e) {
        v_eliminarProd.setVisible(false);
        v_main.setVisible(true);
        c_principal.mostraProduct(0);

    }

    private class eliminarcodicomboboxActListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            initComponents();
        }
    }

}

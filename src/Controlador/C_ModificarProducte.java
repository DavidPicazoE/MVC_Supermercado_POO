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
import View.V_ModificarProducte;
import java.awt.event.WindowEvent;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author david
 */
public class C_ModificarProducte extends WindowAdapter implements ActionListener {

    private V_Main v_main;
    private M_Supermercat m_supermercat;
    private V_ModificarProducte v_modificar = new V_ModificarProducte(new javax.swing.JFrame(), true);
    private C_Principal c_principal;

    public C_ModificarProducte(V_Main v_main, M_Supermercat m_supermercat, C_Principal c_principal) {
        this.v_main = v_main;
        this.m_supermercat = m_supermercat;
        this.c_principal = c_principal;
        this.v_modificar.addWindowListener(this);
        this.v_modificar.getModificarProd_button().addActionListener(this);
    }

    public void run() {
        obtenirCodis();
        initComponents();
        v_modificar.setTitle("Modificar Producto");
        v_modificar.setLocationRelativeTo(null);
        v_modificar.getModificarCodi_combobox().addActionListener(new codicomboboxListener());
        v_modificar.setVisible(true);
    }

    public void initComponents() {
        int index = v_modificar.getModificarCodi_combobox().getSelectedIndex();
        int codi = Integer.parseInt(v_modificar.getModificarCodi_combobox().getItemAt(index));
        M_Producto m_Producto = m_supermercat.getProducto(codi);
        v_modificar.getModificarProd_nom_textfield().setText(m_Producto.nomProduct);
        v_modificar.getModificarProducte_Categoria_combobox().setSelectedItem(m_Producto.categoria.getNom());
        v_modificar.getModificarProd_Preu_textfield().setText("" + m_Producto.preu);
        v_modificar.getModificarProdu_dades_textarea().setText(m_Producto.datos);
        if (m_Producto.perible) {
            v_modificar.getModificarPerible_checkbox().setSelected(true);
        } else {
            v_modificar.getModificarPerible_checkbox().setSelected(false);
        }
    }

    public void obtenirCodis() {
        v_modificar.getModificarCodi_combobox().removeAllItems();
        v_modificar.getModificarCodi_combobox().removeAllItems();

        if (m_supermercat != null) {
            ArrayList<M_Producto> product = m_supermercat.allProducto();
            ArrayList<M_Categoria> cat = m_supermercat.allCategorias();

            for (M_Producto c : product) {
                v_modificar.getModificarCodi_combobox().addItem("" + c.getCodi());
            }
            for (M_Categoria c : cat) {
                v_modificar.getModificarProducte_Categoria_combobox().addItem(c.getNom());
            }
        }
    }

    private class codicomboboxListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            initComponents();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (v_modificar.getModificar_confirmar_radiobuton().isSelected() == false) {
            //si el radio button de confirmar no ta pue no coje
            showMessageDialog(null, "No has acceptat correctament");
        } else {
            //instancia todo
            String NomProd, dades;
            double preu;
            boolean perible;
            int index = v_modificar.getModificarCodi_combobox().getSelectedIndex();
            int codi = Integer.parseInt(v_modificar.getModificarCodi_combobox().getItemAt(index));
            M_Producto m_Producto = m_supermercat.getProducto(codi);

            //cojer los datos puestos en el JDialog
            NomProd = v_modificar.getModificarProd_nom_textfield().getText();
            preu = Double.parseDouble(v_modificar.getModificarProd_Preu_textfield().getText());
            dades = v_modificar.getModificarProdu_dades_textarea().getText();
            perible = v_modificar.getModificarPerible_checkbox().isSelected();
            M_Categoria categoria = m_supermercat.getCategoria(v_modificar.getModificarProducte_Categoria_combobox().getSelectedItem().toString());

            //cambiar los datos del juego
            m_Producto.setNomProduct(NomProd);
            m_Producto.setPreu(preu);
            m_Producto.setDatos(dades);
            m_Producto.setPerible(perible);
            m_Producto.categoria.removeProducte(m_Producto);
            m_Producto.categoria = categoria;
            m_Producto.categoria.addProducte(m_Producto);

            //metodo para avisar que se ha añadido
            showMessageDialog(null, "Producte modificat ");

            //Metodo que llama al windowClosing
            windowClosing(new WindowEvent(v_modificar, WindowEvent.WINDOW_CLOSING));

        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        v_modificar.setVisible(false);
        v_main.setVisible(true);
        c_principal.mostraProduct(0);

    }
}

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
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author david
 */
public class C_AfegirProducte extends WindowAdapter implements ActionListener {

    private V_Main v_main;
    private M_Supermercat m_supermercat;
    private V_AfegirProducte v_afegir = new V_AfegirProducte(new javax.swing.JFrame(), true);
    private C_Principal c_principal;

    public C_AfegirProducte(V_Main v_main, M_Supermercat m_supermercat, C_Principal c_principal) {
        this.v_main = v_main;
        this.m_supermercat = m_supermercat;
        this.c_principal = c_principal;
        this.v_afegir.addWindowListener(this);
        this.v_afegir.getAfegirProducte_button().addActionListener(this);

    }

    public void run() {
        v_afegir.setTitle("AfegirProducte");
        v_afegir.setLocationRelativeTo(null);
        initComponents();
        v_afegir.setVisible(true);
    }

    public void initComponents() {
        //set comboBox witht he names of categorias
        v_afegir.getCategoria_combobox().removeAllItems();

        if (m_supermercat != null) {
            ArrayList<M_Categoria> categoria = m_supermercat.allCategorias();

            for (M_Categoria c : categoria) {
                v_afegir.getCategoria_combobox().addItem(c.getNom());
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (check()) {
            
            M_Categoria m_categoria = m_supermercat.getCategoria(v_afegir.getCategoria_combobox().getSelectedItem().toString());
            M_Producto m_prod = new M_Producto(0, "", 0, null, false, null);
            m_prod = instanciarProducte(m_prod);


//afegir producte als 
            m_supermercat.addProduct(m_prod);
            m_categoria.addProducte(m_prod);
            c_principal.update(m_supermercat);
            showMessageDialog(null, m_prod.nomProduct + " se han añadido a " + m_categoria.getNom());
            v_afegir.getAfegirProducte_codi_textfield().setText("");
            
            v_afegir.getAfegirProducte_nom_textfield().setText("");
            v_afegir.getAfegir_productePreu_textfield().setText("");
            v_afegir.getAfegir_dades_textarea().setText("");
            v_afegir.getAfegir_perible_checkbox().setSelected(false);
            v_afegir.getAfegir_cancelar_radiobutton().setSelected(true);
        }
    }
    


    public boolean check() {
        boolean existeix = false;
        M_Producto m_Producto = new M_Producto(0, "", 0, null, false, null);
        m_Producto = instanciarProducte(m_Producto);
        existeix = prodRepetits(existeix, m_Producto);
        if (existeix) {
            showMessageDialog(null, "Codigo repetido");
            return false;
        } else if (m_Producto.codi < 1) {
            showMessageDialog(null, "El Codigo debe ser mayor a 0");
            return false;
        } else if (v_afegir.getAfegir_confirmar_radiobuton().isSelected() == false) {
            showMessageDialog(null, "Error al confirmar");
            return false;
        } else if (m_Producto.codi != Integer.parseInt(v_afegir.getAfegirProducte_codi_textfield().getText())) {
            showMessageDialog(null, "Error, el Codigo tiene que ser un valor numerico");
            return false;
        }
        return true;
    }


    public boolean prodRepetits(boolean existeix, M_Producto m_Producto) {
        if (m_supermercat != null) {
            ArrayList<M_Producto> m_Productos = m_supermercat.allProducto();

            for (M_Producto p : m_Productos) {
                if (m_Producto.codi == p.codi) {
                    existeix = true;
                    return existeix;
                } else if (m_Producto.nomProduct.equals(p.nomProduct)) {
                    existeix = true;
                    return existeix;
                }
            }
        }
        return existeix;
    }

    public M_Producto instanciarProducte(M_Producto m_Producto) {
        String nomProd, dades;
        int codi;
        double preu;
        boolean preible;

          codi = Integer.parseInt(v_afegir.getAfegirProducte_codi_textfield().getText());
//        try {
//            codi = Integer.parseInt(v_afegir.getAfegirProducte_codi_textfield().getText());
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "El código debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
//            return null; // Retornamos null para indicar que ha habido un error
//        }

        nomProd = v_afegir.getAfegirProducte_nom_textfield().getText();
        preu = Double.parseDouble(v_afegir.getAfegir_productePreu_textfield().getText());
        dades = v_afegir.getAfegir_dades_textarea().getText();
        preible = v_afegir.getAfegir_perible_checkbox().isSelected();
        M_Categoria categoria = m_supermercat.getCategoria(v_afegir.getCategoria_combobox().getSelectedItem().toString());

        m_Producto = new M_Producto(codi, nomProd, preu, dades, preible, categoria);

        return m_Producto;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        v_afegir.setVisible(false);
        v_main.setVisible(true);
        c_principal.mostraProduct(0);
    }
}

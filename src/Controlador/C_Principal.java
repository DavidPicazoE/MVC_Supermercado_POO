/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.M_Categoria;
import Model.M_Producto;
import Model.M_Supermercat;
import View.V_Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class C_Principal extends WindowAdapter {

    private V_Main v_main = new V_Main();
    private M_Supermercat m_supermercat;

    public C_Principal() {
        initComponents();
        v_main.getAfegirProducte_button().addActionListener(new afegir_prod_buttonActListener());
        v_main.getModificarProductes_button().addActionListener(new modificar_prod_buttonActionPerformed());
        v_main.getEliminarProducte_button().addActionListener(new eliminar_produ_buttonActionPerformed());
        v_main.getCategorias_combobox().addActionListener(new Categories_comboboxActListener());
        v_main.addWindowListener(this);
        
    }

    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mostraProduct(0);
                v_main.setVisible(true);
                v_main.setTitle("Supermercado");
                v_main.setLocationRelativeTo(null);
            }
        });
    }

    public void initComponents() {
        //set comboBox witht he names of courses
        crearProdCat();
        v_main.getCategorias_combobox().removeAllItems();

        if (m_supermercat != null) {
            ArrayList<M_Categoria> categoria = m_supermercat.allCategorias();

            for (M_Categoria c : categoria) {
                v_main.getCategorias_combobox().addItem(c.getNom());
            }
        }
    }

    public void crearProdCat() {

        m_supermercat = new M_Supermercat("SUPERMERCADO");

M_Categoria c1 = new M_Categoria("Frutería", "Sección del supermercado donde se encuentra la fruta, verdura y productos similares");
M_Categoria c2 = new M_Categoria("Horno", "Sección del supermercado donde se encuentra el pan, pasteles y productos similares");
M_Categoria c3 = new M_Categoria("Bodega", "Sección del supermercado donde se encuentran las bebidas, tanto alcohólicas como refrescos y agua");
M_Categoria c4 = new M_Categoria("Congelados", "Sección del supermercado donde se encuentran los productos congelados");
M_Categoria c5 = new M_Categoria("Carnicería", "Sección del supermercado donde se encuentra la carne, quesos y productos similares");
M_Categoria c6 = new M_Categoria("Droguería", "Sección del supermercado donde se encuentran productos de limpieza y similares");
M_Categoria c7 = new M_Categoria("Productos Secos", "Sección del supermercado donde se encuentran conservas, pasta y productos similares");

M_Producto p1 = new M_Producto(1, "Manzana", 0.50, "El precio es unitario", true, c1);
M_Producto p2 = new M_Producto(2, "Plátano", 0.40, "El precio es unitario", true, c1);
M_Producto p3 = new M_Producto(3, "Sandía", 3.50, "El precio es unitario", true, c1);

// Crear productos para la categoría "Horno"
M_Producto p4 = new M_Producto(4, "Pan de Payés", 1.10, "El precio es unitario", true, c2);
M_Producto p5 = new M_Producto(5, "Ensaimada", 1.50, "El precio es unitario", true, c2);
M_Producto p6 = new M_Producto(6, "Croissant", 0.90, "El precio es unitario", true, c2);

// Crear productos para la categoría "Bodega"
M_Producto p7 = new M_Producto(7, "Vino Tinto", 6.20, "750ml, El precio es unitario", false, c3);
M_Producto p8 = new M_Producto(8, "Cerveza", 1.00, "330ml, El precio es unitario", false, c3);
M_Producto p9 = new M_Producto(9, "Agua Mineral", 0.70, "1.5l, El precio es unitario", false, c3);

// Crear productos para la categoría "Congelados"
M_Producto p10 = new M_Producto(10, "Pizza Cuatro Quesos", 3.50, "350g, El precio es unitario", false, c4);
M_Producto p11 = new M_Producto(11, "Helado", 2.00, "500ml, El precio es unitario", false, c4);
M_Producto p12 = new M_Producto(12, "Lenguado Congelado", 5.80, "250g, El precio es unitario", true, c4);

// Crear productos para la categoría "Carnicería"
M_Producto p13 = new M_Producto(13, "Chorizo", 3.00, "150g, El precio es unitario", true, c5);
M_Producto p14 = new M_Producto(14, "Entrecot", 12.50, "250g, El precio es unitario", true, c5);
M_Producto p15 = new M_Producto(15, "Queso Manchego", 2.80, "100g, El precio es unitario", true, c5);

// Crear productos para la categoría "Droguería"
M_Producto p16 = new M_Producto(16, "Detergente", 4.50, "1l, El precio es unitario", false, c6);
M_Producto p17 = new M_Producto(17, "Estropajo", 0.80, "El precio es unitario", true, c6);

// Crear productos para la categoría "Productos Secos"
M_Producto p18 = new M_Producto(18, "Atún en Conserva", 5.10, "250g de atún en pack de 3 latas, El precio es unitario", false, c7);
M_Producto p19 = new M_Producto(19, "Macarrones", 5.10, "Paquete de 500g, El precio es unitario", false, c7);
M_Producto p20 = new M_Producto(20, "Arroz", 1.20, "Paquete de 1kg, El precio es unitario", false, c7);

        //Afegir a categoria
// Agregar productos a la categoría "Fruiteria"
        c1.addProducte(p1);
        c1.addProducte(p2);
        c1.addProducte(p3);

// Agregar productos a la categoría "Forn"
        c2.addProducte(p4);
        c2.addProducte(p5);
        c2.addProducte(p6);

// Agregar productos a la categoría "Bodega"
        c3.addProducte(p7);
        c3.addProducte(p8);
        c3.addProducte(p9);

// Agregar productos a la categoría "Congelat"
        c4.addProducte(p10);
        c4.addProducte(p11);
        c4.addProducte(p12);

// Agregar productos a la categoría "Carnisseria"
        c5.addProducte(p13);
        c5.addProducte(p14);
        c5.addProducte(p15);

// Agregar productos a la categoría "Drogueria"
        c6.addProducte(p16);
        c6.addProducte(p17);

// Agregar productos a la categoría "Productes Secs"
        c7.addProducte(p18);
        c7.addProducte(p19);
        c7.addProducte(p20);

        //Afegir categoria A supermercat
        m_supermercat.addCategoria(c1);
        m_supermercat.addCategoria(c2);
        m_supermercat.addCategoria(c3);
        m_supermercat.addCategoria(c4);
        m_supermercat.addCategoria(c5);
        m_supermercat.addCategoria(c6);
        m_supermercat.addCategoria(c7);

        //afegir Producte a supermercat

        // Agregar todos los productos al supermercado
        m_supermercat.addProduct(p1);
        m_supermercat.addProduct(p2);
        m_supermercat.addProduct(p3);
        m_supermercat.addProduct(p4);
        m_supermercat.addProduct(p5);
        m_supermercat.addProduct(p6);
        m_supermercat.addProduct(p7);
        m_supermercat.addProduct(p8);
        m_supermercat.addProduct(p9);
        m_supermercat.addProduct(p10);
        m_supermercat.addProduct(p11);
        m_supermercat.addProduct(p12);
        m_supermercat.addProduct(p13);
        m_supermercat.addProduct(p14);
        m_supermercat.addProduct(p15);
        m_supermercat.addProduct(p16);
        m_supermercat.addProduct(p17);
        m_supermercat.addProduct(p18);
        m_supermercat.addProduct(p19);
        m_supermercat.addProduct(p20);
    }

    public void mostraProduct(int index) {
        if (m_supermercat != null) {

            if (v_main.getCategorias_combobox().getItemAt(0) != null) {
                M_Categoria m_Categoria = m_supermercat.getCategoria(v_main.getCategorias_combobox().getItemAt(index));

                ArrayList<M_Producto> temp = new ArrayList<>();
                temp.addAll(m_Categoria.getProductes().values());

                String[] columns = {"Codigo", "Nombre", "Precio", "Datos", "Categoria", "Perecedero"}; //Columnes de la JTable

                DefaultTableModel model = new DefaultTableModel(null, columns);//null: sense contingut, columns: columnes
                v_main.getProductes_table().setModel(model);

                Object[] x = new Object[6];

                for (M_Producto t : temp) {

                    x[0] = t.codi;
                    x[1] = t.nomProduct;
                    x[2] = t.preu;
                    x[3] = t.datos;
                    x[4] = t.categoria;
                    x[5] = t.perible;
                    model.addRow(x);
                }
            }

        }
    }

    public void update(M_Supermercat m_Supermercat) {
        this.m_supermercat = m_Supermercat;
    }

    private class afegir_prod_buttonActListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            v_main.setVisible(false);
            C_AfegirProducte c_afegirProd = new C_AfegirProducte(v_main, m_supermercat, C_Principal.this);
            c_afegirProd.run();
        }
    }

    private class modificar_prod_buttonActionPerformed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            v_main.setVisible(false);
            C_ModificarProducte c_modificar = new C_ModificarProducte(v_main, m_supermercat, C_Principal.this);
            c_modificar.run();
        }
    }
        private class eliminar_produ_buttonActionPerformed implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                v_main.setVisible(false);
                C_EliminarProducte C_eliminar = new C_EliminarProducte(v_main, m_supermercat, C_Principal.this);
                C_eliminar.run();
            
        }
    }

    private class Categories_comboboxActListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int index = v_main.getCategorias_combobox().getSelectedIndex();
            mostraProduct(index);
        }
    }
}

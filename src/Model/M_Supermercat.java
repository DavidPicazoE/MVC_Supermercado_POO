/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class M_Supermercat {

    private String nom;
    private ArrayList<M_Categoria> categorias;
    private ArrayList<M_Producto> productos;

    public M_Supermercat(String nom) {
        this.nom = nom;
        categorias = new ArrayList<>();
        productos = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void addCategoria(M_Categoria nomCat) {
        categorias.add(nomCat);
    }

    public ArrayList<M_Categoria> allCategorias() {
        return categorias;
    }

    public M_Categoria getCategoria(String nom) {
        for (M_Categoria c : categorias) {
            if (c.getNom().equals(nom)) {
                return c;
            }
        }
        return null;
    }

    public void addProduct(M_Producto nomprod) {
        productos.add(nomprod);
    }

    public ArrayList<M_Producto> allProducto() {
        return productos;
    }

    public M_Producto getProducto(int codi) {
        for (M_Producto c : productos) {
            if (c.getCodi() == codi) {
                return c;
            }
        }
        return null;
    }
     public void removeProd(M_Producto mprod) {
        productos.remove(mprod.codi);
    }
}

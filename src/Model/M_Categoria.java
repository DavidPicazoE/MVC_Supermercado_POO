/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.TreeMap;

/**
 *
 * @author david
 */
public class M_Categoria implements Serializable {

    private String nom;
    private String descripcio;
    private TreeMap<Integer, M_Producto> productes;

    public M_Categoria(String nom, String descripcio) {
        this.nom = nom;
        this.descripcio = descripcio;
        productes = new TreeMap<>();
    }

   

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public TreeMap<Integer, M_Producto> getProductes() {
        return productes;
    }

    public void addProducte(M_Producto m_prod) {
        productes.put(m_prod.codi, m_prod);
    }

    public void removeProducte(M_Producto m_prod) {
        productes.remove(m_prod.codi);
    }

    @Override
    public String toString() {
        return nom;
    }

}

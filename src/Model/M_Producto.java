/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author david
 */
public class M_Producto {

    public int codi;                                   
    public String nomProduct;       
    public double preu;
    public String datos;                
    public boolean perible;       
    public M_Categoria categoria;                  

    public M_Producto(int codi, String nomProduct, double preu, String datos, boolean perible, M_Categoria categoria) {
        this.codi = codi;
        this.nomProduct = nomProduct;
        this.preu = preu;
        this.datos = datos;
        this.perible = perible;
        this.categoria = categoria;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNomProduct() {
        return nomProduct;
    }

    public void setNomProduct(String nomProduct) {
        this.nomProduct = nomProduct;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public boolean isPerible() {
        return perible;
    }

    public void setPerible(boolean perible) {
        this.perible = perible;
    }

    public M_Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(M_Categoria categoria) {
        this.categoria = categoria;
    }

}
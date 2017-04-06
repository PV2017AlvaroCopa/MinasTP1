/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import productoria.Productoria;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped

public class ProductoriaFormBean {
private int n;
    /**
     * Creates a new instance of FactorialFormBean
     */
    public ProductoriaFormBean() {
    }
public int calcularProductoria(){
    Productoria unProductoria= new Productoria();
    unProductoria.asignarValor(getN());
    return unProductoria.obtenerProductoria();
}

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

}
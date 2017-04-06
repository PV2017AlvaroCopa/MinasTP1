/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import sumatoria.Sumatoria;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@SessionScoped
public class SumatoriaFormBean {
private int n;
    /**
     * Creates a new instance of FactorialFormBean
     */
    public SumatoriaFormBean() {
    }
public int calcularSumatoria(){
    Sumatoria unSumatoria= new Sumatoria();
    unSumatoria.asignarValor(n);
    return unSumatoria.obtenerSumatoria();
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

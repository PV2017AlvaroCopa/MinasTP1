/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productoria;

/**
 *
 * @author Alumno
 */
public class Productoria {
    private int n;
    public Productoria (){
        
    }
     public Productoria(int n) {
        this.n = n;
    }
    
    public void asignarValor (int num){
        n=num;
    }
    public int obtenerProductoria (){
        int valorProd=1;
        int aux=n;
        int i=1;
        while (i<=aux){
            valorProd=valorProd*i;
            n=n-1;
            i++;
        }
        n=aux;
        return valorProd;
    }
}

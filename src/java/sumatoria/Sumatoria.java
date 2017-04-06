/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoria;

/**
 *
 * @author Alumno
 */
public class Sumatoria {
    private int n;
    public Sumatoria() {
    }

    public Sumatoria(int n) {
        this.n = n;
    }
    
    public void asignarValor (int num){
        n=num;
    }
    public int obtenerSumatoria (){
        int valorSuma=0;
        int i;
        for (i=1;i<=n;i++){
            valorSuma=valorSuma+2*i-4;
        }
        return valorSuma;
    }
}

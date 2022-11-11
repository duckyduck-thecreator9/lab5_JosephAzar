/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josephazar;

/**
 *
 * @author joseph
 */
public class MovoilPesado extends Robot{
    
    private int elementos;
    private int pesomax, capasidadmax;

    public MovoilPesado(int elementos, int pesomax, int capasidadmax, int id, int x, int y, boolean cargado, int anofab) {
        super(id, x, y, cargado, anofab);
        this.elementos = elementos;
        this.pesomax = pesomax;
        this.capasidadmax = capasidadmax;
    }

    public int getElementos() {
        return elementos;
    }

    public void setElementos(int elementos) {
        this.elementos = elementos;
    }

    @Override
    public String toString() {
        return "MovoilPesado{" + "elementos=" + elementos + '}';
    }
    
    
}

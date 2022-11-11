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
    private double pesomax;
    private int capasidad;

    public MovoilPesado(int elementos, double pesomax, int capasidad, int id, int x, int y, boolean cargado, int anofab) {
        super(id, x, y, cargado, anofab);
        this.elementos = elementos;
        this.pesomax = pesomax;
        this.capasidad = capasidad;
    }

    public int getElementos() {
        return elementos;
    }

    public void setElementos(int elementos) {
        this.elementos = elementos;
    }
    
    public double getPesomax() {
        return pesomax;
    }

    public void setPesomax(double pesomax) {
        this.pesomax = pesomax;
    }

    public int getCapasidad() {
        return capasidad;
    }

    public void setCapasidad(int capasidad) {
        this.capasidad = capasidad;
    }

    @Override
    public String toString() {
        return super.toString() + "MovoilPesado{" + "elementos=" + elementos + '}';
    }
    
    
}

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
public class MovilAgil extends Robot{
    
    private int elementos;
    private int llantas;
    private int velocidadpunta;

    public MovilAgil(int elementos, int llantas, int velocidadpunta, int id, int x, int y, boolean cargado, int anofab) {
        super(id, x, y, cargado, anofab);
        this.elementos = elementos;
        this.llantas = llantas;
        this.velocidadpunta = velocidadpunta;
    }

    @Override
    public String toString() {
        return "MovilAgil{" + "elementos=" + elementos + ", llantas=" + llantas + ", velocidadpunta=" + velocidadpunta + '}';
    }

    public int getElementos() {
        return elementos;
    }

    public void setElementos(int elementos) {
        this.elementos = elementos;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getVelocidadpunta() {
        return velocidadpunta;
    }

    public void setVelocidadpunta(int velocidadpunta) {
        this.velocidadpunta = velocidadpunta;
    }
    
    
}

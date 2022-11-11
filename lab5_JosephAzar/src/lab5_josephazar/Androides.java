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
public class Androides extends Robot{
    
    private int elementos;
    private double altura;
    private double peso;

    public Androides(int elementos, double altura, double peso, int id, int x, int y, boolean cargado, int anofab) {
        super(id, x, y, cargado, anofab);
        this.elementos = elementos;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "Androides{" + "elementos=" + elementos + ", altura=" + altura + ", peso=" + peso + '}';
    }

    

    public int getElementos() {
        return elementos;
    }

    public void setElementos(int elementos) {
        if (elementos < 0 && elementos > 2) {
            System.out.println("La cantidad de elementos tiene que ser 2 o menos");
        } else {
        this.elementos = elementos;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}

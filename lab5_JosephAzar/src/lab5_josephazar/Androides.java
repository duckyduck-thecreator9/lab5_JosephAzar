/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josephazar;

import java.util.ArrayList;

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
    
    public void mov(Object[][] matriz,int xi, int yi, String facing, int pasos) {
        String i = "<";
        String d = ">";
        String A = "A";
        String I = "I";
        int movimientos = 0;          
            if (pasos == 1) {
        if ( facing.contentEquals(i) ) {//izquierda
            if (matriz[yi][xi - 1] == "[x]") {
                System.out.println("Ahi hay un obstaculo no se puede mover");
            } else {
        matriz[yi][xi - 1] = matriz[yi][xi]; 
        matriz[yi][xi] = null;
        xi -= 1;
        setX(xi);
        movimientos += 1;
        }
    } else if (facing.contentEquals(d)) {//derecha
        if (matriz[yi][xi + 1] == "[x]") {
            System.out.println("Ahi hay un obstaculo no se puede mover");
        } else {
        matriz[yi][xi + 1] = matriz[yi][xi];
        matriz[yi][xi] = null;
        xi += 1;
        setX(xi);
        movimientos += 1;
        }
    } else if (facing.contentEquals(I)) {//abajo
        if (matriz[yi + 1][xi] == "[x]") {
            System.out.println("Ahi hay un obstaculo no se puede mover");
        } else {
        matriz[yi + 1][xi] = matriz[yi][xi];
        matriz[yi][xi] = null;
        yi += 1;
        setY(yi);
        movimientos += 1;
        }
    }else if (facing.contentEquals(A)) {//arriba
        if (matriz[yi - 1][xi] == "[x]") {
            System.out.println("Ahi hay un obstaculo no se puede mover");
        } else {
        matriz[yi - 1][xi] = matriz[yi][xi];
        matriz[yi][xi] = null;
        yi -= 1;
        setY(yi);
        movimientos += 1;
        }
    }
        
   } else if (pasos == 2) {
       if (facing.contentEquals(i)) {//izquierda
            if (matriz[yi][xi - 1] == "[x]" || matriz[yi][xi - 2] == "[x]") {
                System.out.println("Ahi hay un obstaculo no se puede mover");
            } else {
        matriz[yi][xi - 2] = matriz[yi][xi]; 
        matriz[yi][xi] = null;
        xi -=2;
        setX(xi);
        movimientos += 1;
        }
    } else if (facing.contentEquals(d)) {//derecha
        if (matriz[yi][xi + 1] == "[x]" || matriz[yi][xi + 2] == "[x]") {
            System.out.println("Ahi hay un obstaculo no se puede mover");
        } else {
        matriz[yi][xi + 2] = matriz[yi][xi];
        matriz[yi][xi] = null;
        xi += 2;
        setX(xi);
        movimientos += 1;
        }
    } else if (facing.contentEquals(I)) {//abajo
        if (matriz[yi + 1][xi] == "[x]" || matriz[yi + 2][xi] == "[x]") {
            System.out.println("Ahi hay un obstaculo no se puede mover");
        } else {
        matriz[yi + 2][xi] = matriz[yi][xi];
        matriz[yi][xi] = null;
        yi += 2;
        setY(yi);
        movimientos += 1;
        }
    }else if (facing.contentEquals(A)) {//arriba
        if (matriz[yi - 1][xi] == "[x]" || matriz[yi - 2][xi] == "[x]") {
            System.out.println("Ahi hay un obstaculo no se puede mover");
        } else {
        matriz[yi - 2][xi] = matriz[yi][xi];
        matriz[yi][xi] = null;
        yi -= 2;
        setY(yi);
        movimientos += 1;
        }
        
     }
    }
            System.out.println("Movimientos totales: " + movimientos);
   }
    
    static public String rot (int angulo, String facing) {
        
        String i = "<";
        String d = ">";
        String A = "A";
        String I = "I";
        
        //angulo 90
        if (angulo == 90 && facing.contentEquals(i)) {//viendo izquiera
            facing = A;
        } 
        if (angulo == 90 && facing.equals(">")) {//viendo derecha
            facing = I;
        } 
        if (angulo == 90 && facing.contentEquals(A)) {//viendo arriva
            facing = d;
        } 
        if (angulo == 90 && facing.contentEquals(I)) {//viendo abajo
            facing = i;            
            
        } 
        if (angulo == 180 && facing.contentEquals(i)) {//viendo izquiera
            facing = d;
        } 
        if (angulo == 180 && facing.contentEquals(d)) {//viendo derecha
            facing = i;
        } 
        if (angulo == 180 && facing.contentEquals(A)) {//viendo arriva
            facing = I;
        } 
        if (angulo == 180 && facing.contentEquals(I)) {//viendo abajo
            facing = A;

        } 
        if (angulo == 270 && facing.contentEquals(i)) {//viendo izquiera
            facing = I;
        } 
        if (angulo == 270 && facing.contentEquals(d)) {//viendo derecha
            facing = A;
        } 
        if (angulo == 270 && facing.contentEquals(A)) {//viendo arriva
            facing = i;
        } 
        if (angulo == 270 && facing.contentEquals(I)) {//viendo abajo
            facing = d;

        }
        return facing;
    }
}

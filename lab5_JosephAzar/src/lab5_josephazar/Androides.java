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
    
    public void mov(Object[][] matriz,int xi, int yi, char facing, int pasos) {
        
        int movimientos = 0;          
            if (pasos == 1) {
        if ( facing == 60) {//izquierda
            if (matriz[yi][xi - 1] == "[x]") {
                System.out.println("Ahi hay un obstaculo no se puede mover");
            } else {
        matriz[yi][xi - 1] = matriz[yi][xi]; 
        matriz[yi][xi] = null;
        xi -= 1;
        movimientos += 1;
        }
    } else if (facing == 62) {//derecha
        if (matriz[yi][xi + 1] == "[x]") {
            System.out.println("Ahi hay un obstaculo no se puede mover");
        } else {
        matriz[yi][xi + 1] = matriz[yi][xi];
        matriz[yi][xi] = null;
        xi += 1;
        movimientos += 1;
        }
    } else if (facing == 73 || facing == 105) {//abajo
        if (matriz[yi + 1][xi] == "[x]") {
            System.out.println("Ahi hay un obstaculo no se puede mover");
        } else {
        matriz[yi + 1][xi] = matriz[yi][xi];
        matriz[yi][xi] = null;
        yi += 1;
        movimientos += 1;
        }
    }else if (facing == 66 || facing == 97) {//arriba
        if (matriz[yi - 1][xi] == "[x]") {
            System.out.println("Ahi hay un obstaculo no se puede mover");
        } else {
        matriz[yi - 1][xi] = matriz[yi][xi];
        matriz[yi][xi] = null;
        yi -= 1;
        movimientos += 1;
        }
    }
        
   } else if (pasos == 2) {
       if ( facing == 60) {//izquierda
            if (matriz[yi][xi - 1] == "[x]" || matriz[yi][xi - 2] == "[x]") {
                System.out.println("Ahi hay un obstaculo no se puede mover");
            } else {
        matriz[yi][xi - 2] = matriz[yi][xi]; 
        matriz[yi][xi] = null;
        xi -=2;
        movimientos += 1;
        }
    } else if (facing == 62) {//derecha
        if (matriz[yi][xi + 1] == "[x]" || matriz[yi][xi + 2] == "[x]") {
            System.out.println("Ahi hay un obstaculo no se puede mover");
        } else {
        matriz[yi][xi + 2] = matriz[yi][xi];
        matriz[yi][xi] = null;
        xi += 2;
        movimientos += 1;
        }
    } else if (facing == 73 || facing == 105) {//abajo
        if (matriz[yi + 1][xi] == "[x]" || matriz[yi + 2][xi] == "[x]") {
            System.out.println("Ahi hay un obstaculo no se puede mover");
        } else {
        matriz[yi + 2][xi] = matriz[yi][xi];
        matriz[yi][xi] = null;
        yi += 2;
        movimientos += 1;
        }
    }else if (facing == 66 || facing == 97) {//arriba
        if (matriz[yi - 1][xi] == "[x]" || matriz[yi - 2][xi] == "[x]") {
            System.out.println("Ahi hay un obstaculo no se puede mover");
        } else {
        matriz[yi - 2][xi] = matriz[yi][xi];
        matriz[yi][xi] = null;
        yi -= 2;
        movimientos += 1;
        }
        
     }
    }
            System.out.println("Movimientos totales: " + movimientos);
   }
    
    public void rot (int angulo, char facing) {
        
        //angulo 90
        if (angulo == 90 && facing == 60) {//viendo izquiera
            facing = 66;
        } else if (angulo == 90 && facing == 62) {//viendo derecha
            facing = 73;
        } else if (angulo == 90 && facing == 65) {//viendo arriva
            facing = 62;
        } else if (angulo == 90 && facing == 73) {//viendo abajo
            facing = 60;
            
            
        } else if (angulo == 180 && facing == 60) {//viendo Izquiera
            facing = 62;
        } else if (angulo == 180 && facing == 62) {//viendo derecha
            facing = 60;
        } else if (angulo == 180 && facing == 66) {//viendo arriva
            facing = 73;
        }else if (angulo == 180 && facing == 73) {//viendo abajo
            facing = 65;

        } else if (angulo == 270 && facing == 60) {//viendo Izquiera
            facing = 73;
        } else if (angulo == 270 && facing == 62) {//viendo derecha
            facing = 66;
        } else if (angulo == 270 && facing == 66) {//viendo arriva
            facing = 60;
        }else if (angulo == 270 && facing == 73) {//viendo abajo
            facing = 62;

        }   
    }
}

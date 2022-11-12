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
        return super.toString() + "MovilAgil{" + "elementos=" + elementos + ", llantas=" + llantas + ", velocidadpunta=" + velocidadpunta + '}';
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
    
    public void mov(Object[][] matriz,int xi, int yi, char facing) {
        
        int movimientos = 0;          
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
    }else if (facing == 65 || facing == 97) {//arriba
        if (matriz[yi - 1][xi] == "[x]") {
            System.out.println("Ahi hay un obstaculo no se puede mover");
        } else {
        matriz[yi - 1][xi] = matriz[yi][xi];
        matriz[yi][xi] = null;
        yi -= 1;
        movimientos += 1;
        }
      }
        System.out.println("Movimientos totales: " + movimientos);
    }
    
    public void rot (int angulo, char facing) {
        
        //angulo 90
        if (angulo == 90 && facing == 60) {//viendo izquiera
            facing = 66;
        } else if (angulo == 90 && facing == 62) {//viendo derecha
            facing = 105;
        } else if (angulo == 90 && facing == 66) {//viendo arriva
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
            facing = 66;

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

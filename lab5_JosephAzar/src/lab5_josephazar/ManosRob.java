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
public class ManosRob extends Robot{
    
    private int elementos;
    private int servoMot;

    public ManosRob(int elementos, int servoMot, int id, int x, int y, boolean cargado, int anofab) {
        super(id, x, y, cargado, anofab);
        this.elementos = elementos;
        this.servoMot = servoMot;
    }

    public int getElementos() {
        return elementos;
    }

    public void setElementos(int elementos) {
        this.elementos = elementos;
    }

    public int getServoMot() {
        return servoMot;
    }

    public void setServoMot(int servoMot) {
        this.servoMot = servoMot;
    }

    @Override
    public String toString() {
        return super.toString() + "ManosRob{" + "elementos=" + elementos + ", servoMot=" + servoMot + '}';
    }
    
    
}

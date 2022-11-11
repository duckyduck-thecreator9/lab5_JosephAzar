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
public class Robot {
    private int id;
    private int x;
    private int y;
    private boolean cargado;
    private int anofab;//No tengo la enie

    public Robot(int id, int x, int y, boolean cargado, int anofab) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.cargado = cargado;
        this.anofab = anofab;
    }

    public Robot() {
    }

    @Override
    public String toString() {
        return "Robot{" + "id=" + id + ", x=" + x + ", y=" + y + ", cargado=" + cargado + ", anofab=" + anofab + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isCargado() {
        return cargado;
    }

    public void setCargado(boolean cargado) {
        this.cargado = cargado;
    }

    public int getAnofab() {
        return anofab;
    }

    public void setAnofab(int anofab) {
        this.anofab = anofab;
    }
    
    
}

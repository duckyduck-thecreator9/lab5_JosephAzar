/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josephazar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joseph
 */
public class Lab5_JosephAzar {

    static ArrayList robots = new ArrayList();
    static Scanner lea = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean runing = true;
        while (runing == true) {
            
            System.out.println("1. Crear robot\n"
                    + "2. Listar robots\n"
                    + "3. Simulador automaticamente\n"
                    + "4. Actuar manualmente\n"
                    + "5. Salir");
            int op = lea.nextInt();
            
            switch (op) {
                case 1: {
                    System.out.println("ingrese el id");
                    int id = lea.nextInt();
                    System.out.println("Ingrese posicion x");
                    int x = lea.nextInt();
                    System.out.println("Ingrese posicion y");
                    int y = lea.nextInt();
                    System.out.println("Ingrese el ano de fabricacion"); //no tengo la enie lmao
                    int ano = lea.nextInt();//te lo juro que no tengo la enie
                    boolean valdidacion = true;
                    while (valdidacion == true) {
                    System.out.println("Que tipo de robot va a queres crear?\n"
                            + "1. Androides\n"
                            + "2. Manos Roboticas\n"
                            + "3. Robots movil agil\n"
                            + "4. Robot movil pesado\n");
                    int tipo = lea.nextInt();
                    
                    switch (tipo) {
                        
                        case 1: {
                            System.out.println("Ingrese la cantidad de elementos que tiene\n"
                                    + "(Tiene que ser menos de 2");
                            int elementos = lea.nextInt();
                            System.out.println("Ingrese la altura");
                            double altura = lea.nextDouble();
                            System.out.println("Ingrese el peso");
                            double peso = lea.nextInt();
                            if (elementos >=0 && elementos <=2) {
                                Androides a = new Androides(elementos, altura, peso, id, x, y, runing, ano);
                                robots.add(a);
                                valdidacion = false;
                            } 
//                            else {
//                                System.out.println("No se pudo crear el androide, no puede tener mas de dos elementos");
//                            }
                    }
                    break;
                    
                    case 2: {
                            
                    }
                    break;
                    
                    case 3: {
                            
                    }
                    break;
                    
                    case 4: {
                            
                    }
                    break;
                    }
                  }
                }
                break;
                
                case 2: {
                    for (Object t : robots) {
                        robots.get(robots.indexOf(t)).toString();
                    }
                }
                break;
                
                case 3: {
                    
                }
                break;
                
                case 4: {
                    
                }
                break;
                
                case 5: {
                    System.out.println("Saliendo del programa");
                    runing = false;                   
                }
                break;
                default: 
                    System.out.println("Numero no es valido");
            }
        }//fin while del programa
    }
    
}

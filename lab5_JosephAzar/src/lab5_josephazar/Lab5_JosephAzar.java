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
                            } else {
                                System.out.println("No se pudo crear el androide, no puede tener mas de dos elementos");
                            }
                    }
                    break;
                    
                    case 2: {
                            System.out.println("Ingrese la cantidad de elementos que tiene\n"
                                    + "Solo puede tener 1 elemento");
                            int elementos = lea.nextInt();
                            System.out.println("Ingrese la cantidad de servo motores");
                            int sevom = lea.nextInt();
                            if (elementos == 1 || elementos == 0) {
                                ManosRob r = new ManosRob(elementos, sevom, id, x, y, runing, ano);
                                robots.add(r);
                                valdidacion = false;
                            } else {
                                System.out.println("No se pudo crear la Mano robotica, no puede tener mas de un elemento");
                            }
                    }
                    break;
                    
                    case 3: {
                            System.out.println("Ingrese la cantidad de elementos que tiene\n"
                                    + "Solo puede tener 1 elemento");
                            int elementos = lea.nextInt();
                            System.out.println("Ingrese la cantidad de llantas");
                            int llantas = lea.nextInt();
                            System.out.println("Ingrese la velocidad punta");
                            int velocidad = lea.nextInt();
                            if (elementos == 1 || elementos == 0) {
                                MovilAgil ag = new MovilAgil(elementos, llantas, velocidad, id, x, y, runing, ano);
                                robots.add(ag);
                                valdidacion = false;
                            } else {
                                System.out.println("No se pudo crear el robot movil agil, no puede tener mas de un elemento");
                            }
                    }
                    break;
                    
                    case 4: {
                            System.out.println("Ingrese la capasidad\n"
                                    + "Tiene que ser mas de 5");
                            int capadidad = lea.nextInt();
                            System.out.println("Ingrese los elementos que tiene\n"
                                    + "Tiene que ser mas de cinco");
                            int elementos = lea.nextInt();
                            System.out.println("Ingrese el peso maximo");
                            double pesoMax = lea.nextInt();
                            if (elementos >= 5 && elementos <= capadidad) {
                                MovoilPesado p = new MovoilPesado(elementos, pesoMax, capadidad, id, x, y, runing, ano);
                                robots.add(p);
                                valdidacion = false;
                            } else {
                                System.out.println("No se pudo crear el robot movil agil, no puede tener mas de un elemento");
                            }
                    }
                    break;
                    }
                  }
                }
                break;
                
                case 2: {
                    String salida = "";
                    for (Object t : robots) {
                        salida =+ robots.indexOf(t) + "- " + t + "\n";
                        System.out.println(salida);
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

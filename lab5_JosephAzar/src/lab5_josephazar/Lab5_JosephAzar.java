/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josephazar;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author joseph
 */
public class Lab5_JosephAzar {

    static ArrayList robots = new ArrayList();
    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();
    static Object matriz[][] = new Object[8][8];
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
                            if (elementos >0 && elementos <=2) {
                                Androides a = new Androides(elementos, altura, peso, id, x, y, true, ano);
                                robots.add(a);
                                valdidacion = false;
                            } else if (elementos == 0) {
                                Androides a = new Androides(elementos, altura, peso, id, x, y, false, ano);
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
                            if (elementos == 1) {
                                ManosRob r = new ManosRob(elementos, sevom, id, x, y, true, ano);
                                robots.add(r);
                                valdidacion = false;
                            } else if (elementos == 0) {
                                ManosRob r = new ManosRob(elementos, sevom, id, x, y, false, ano);
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
                                MovilAgil ag = new MovilAgil(elementos, llantas, velocidad, id, x, y, true, ano);
                                robots.add(ag);
                                valdidacion = false;
                            } else if (elementos == 0) {
                                MovilAgil ag = new MovilAgil(elementos, llantas, velocidad, id, x, y, false, ano);
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
                                MovoilPesado p = new MovoilPesado(elementos, pesoMax, capadidad, id, x, y, true, ano);
                                robots.add(p);
                                valdidacion = false;
                            } else if (elementos == 0) {
                                MovoilPesado p = new MovoilPesado(elementos, pesoMax, capadidad, id, x, y, false, ano);
                                robots.add(p);
                                valdidacion = false;
                            } else {
                                System.out.println("No se pudo crear el robot movil Pesado, Los elementos tienen que ser entre 5 y " + capadidad + " elementos");
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
                    String salida = "";
                    for (Object t : robots) {
                        if (robots.get(robots.indexOf(t)) instanceof ManosRob) {
                            
                        } else {
                        salida =+ robots.indexOf(t) + "- " + t + "\n";
                        System.out.println(salida);
                        }
                    }
                    System.out.println("Que robot va a utilizar?");
                    int opcion = lea.nextInt();
                    
                    ArrayList xoc = new ArrayList();
                    ArrayList yoa = new ArrayList();
                    
                    String facing = ">";
                    boolean llenar = true;
                    while (llenar == true) {
                    
                    System.out.println("Que desea agregar a el script?\n"
                            + "1. Mover\n"
                            + "2. rotar\n"
                            + "3. proceder a matriz");
                    int opi = lea.nextInt();
                    
                    switch (opi) {
                        case 1:{
                            xoc.add(0);
                            yoa.add(0);
                            System.out.println("Se ha agregado exitosamente al script");
                    }
                        break;
                        case 2: {
                            System.out.println("A que angulo lo quiere rotar\n"
                                    + "1. 90\n"
                                    + "2. 180\n"
                                    + "3. 270");
                            int ro = lea.nextInt();
                            switch (ro) {
                                case 1: {
                                    xoc.add(1);
                                    yoa.add(90);
                                }
                                break;
                                case 2: {
                                    xoc.add(1);
                                    yoa.add(180);
                                }
                                break;
                                case 3: {
                                    xoc.add(1);
                                    yoa.add(270);
                                }
                                break;
                            }
                        }
                        break;
                        case 3: {
                            llenar = false;
                        }
                        break;                       
                    }
                    }
                    
                    for (int i = 0; i < xoc.size(); i++) {
                        if ((int)xoc.get(i) == 0) {
                            ((Androides)robots.get(opcion)).mov(matriz, ((Robot)robots.get(opcion)).getX() , ((Robot)robots.get(opcion)).getY() , facing, opcion);
                        }
                        if ((int)xoc.get(i) == 1) {
                            ((Androides)robots.get(opcion)).rot((int)yoa.get(i), facing);
                        }
                    }
                }
                break;
                
                case 4: {
                    String salida = "";
                    for (Object t : robots) {
                        if (robots.get(robots.indexOf(t)) instanceof MovilAgil) {
                        
                    } else {
                        salida =+ robots.indexOf(t) + "- " + t + "\n";
                        System.out.println(salida);
                        }
                    }
                    System.out.println("Que robot va a utilizar?");
                    int opcion = lea.nextInt();
                    
                    impriirmatriz(opcion);

                    String facing = ">";
                    boolean llenar = true;
                    while (llenar == true) {
                    
                    System.out.println("Que desea hacer?\n"
                            + "1. Mover\n"
                            + "2. rotar\n"
                            + "3. Terminar simulacion");
                    int opi = lea.nextInt();
                    
                    switch (opi) {
                        case 1:{
                            int x = ((Androides)robots.get(opcion)).getX();
                            int y = ((Androides)robots.get(opcion)).getY();
                            
                            ((Androides)robots.get(opcion)).mov(matriz, x, y, facing, opcion);
                            System.out.println(facing);
                            imprimir(opcion);
                    }
                        break;
                        case 2: {
                            System.out.println("A que angulo lo quiere rotar\n"
                                    + "1. 90\n"
                                    + "2. 180\n"
                                    + "3. 270");
                            int ro = lea.nextInt();
                            switch (ro) {
                                case 1: {
                                    facing = Androides.rot(90, facing);
                                    System.out.println(facing);
                                    imprimir(opcion);
                                }
                                break;
                                case 2: {
                                    ((Androides)robots.get(opcion)).rot(180, facing);
                                    imprimir(opcion);
                                }
                                break;
                                case 3: {
                                    ((Androides)robots.get(opcion)).rot(270, facing);
                                    imprimir(opcion);
                                }
                                break;
                            }  
                          }
                       }
                    }
                }
                break;
                
                case 5: {
                    System.out.println("Saliendo del programa");
                    runing = false;                   
                }
                break;
                default: 
                    System.out.println("Numero no es valido");
      }//fin while del programa
    }
}
    
        static public void impriirmatriz(int opcion) {
        
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j ++) {
                boolean pos = true;
                String ficha = null;
                     if (((Robot)robots.get(opcion)).getX() == j && ((Robot)robots.get(opcion)).getY() == i) {
                         ficha = "[ r ]";
                         pos = false;
                     } 
                     if (pos == true) {
                        matriz[i][j] = "[   ]";
                     } else if (pos == false) {
                         System.out.println("robot metido");
                         matriz[i][j] = ficha;
                     }
            }
        }
        
        for (int i = 0; i < 30; i ++) {
            String xl = "[ x ]";
            int f = 1 + r.nextInt(7);
            int c = 1 + r.nextInt(7);
            if (xl.contentEquals((String)matriz[f][c]) || c == ((Robot)robots.get(opcion)).getX() && f == ((Robot)robots.get(opcion)).getY()) {
                i -= 1;
            } else {
            matriz[f][c] = "[ x ]";
            }
        }
        
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz.length; j ++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
        
        static public void imprimir(int opcion) {
            for (int i = 0; i < matriz.length; i ++) {
                for (int j = 0; j < matriz.length; j ++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
    

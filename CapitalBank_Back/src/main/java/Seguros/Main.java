package Seguros;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


    }
    public static void menu(){
        int opc = 0;
        while (opc!=4){
            System.out.println("MENU PRINCIPAL");
            System.out.println("======================");
            System.out.println("1.LOGIN CLIENTE\n" +
                    "2.LOGIN ADMINISTRADOR\n" +
                    "3.REGISTRO\n" +
                    "4.SALIR");

            opc = sc.nextInt();
            switch (opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }

        }
    }

}

package FigurasGeometricas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc =new Scanner(System.in);
    static ArrayList<Figura> figuras = new ArrayList<Figura>();
    public static void main(String[] args) {

        ingresarFigura();
        mostrarResultado();


    }




    public static void ingresarFigura(){
        int opc =0;
        do {
            System.out.println("Señor usuario favor elegir una de las siguientes figuras\n" +
                    "1.Rectangulo\n" +
                    "2.Triangulo\n" +
                    "3.Salir");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    calcularRectangulo();
                    break;
                case 2:
                    calcularTriangulo();
                    break;
                case 3:
                    System.out.println("Gracias por utilizar este programa");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }while (opc != 3);

    }
    public static void calcularRectangulo(){
        int lado1,lado2,numLados;
        System.out.println("Señor usuario favor ingresar los lados del rectangulo :");
        System.out.println("Favor ingresar el numero de lados del rectangulo");
        numLados= sc.nextInt();
        System.out.println("Favor ingresar el valor del lado 1 :");
        lado1=sc.nextInt();
        System.out.println("Favor ingresar el valor del lado 2 :");
        lado2= sc.nextInt();

        Rectangulo rectangulo = new Rectangulo(numLados,lado1,lado2);
        figuras.add(rectangulo);
    }
    public static void calcularTriangulo(){
        int base, altura, numLados;
        System.out.println("Señor usuario favor ingresar los datos del triangulo :");
        System.out.println("Favor ingresar el numero de lados que tiene un triangulo :");
        numLados= sc.nextInt();
        System.out.println("Favor ingresar la base del triangulo :");
        base= sc.nextInt();
        System.out.println("Favor ingresar la altuar del triangulo :");
        altura= sc.nextInt();

        Triangulo triangulo= new Triangulo(base,altura,numLados);
        figuras.add(triangulo);


    }
    public static void mostrarResultado(){
        for (Figura figur:figuras){
            System.out.println(figuras.toString());
            System.out.println("El area es :"+figur.calcularArea());
            System.out.println("El perimetro es :"+figur.calcularPerimetro());
        }
    }
}

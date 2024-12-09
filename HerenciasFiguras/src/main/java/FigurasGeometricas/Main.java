package FigurasGeometricas;

import java.util.Scanner;

public class Main {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {

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
    }
}

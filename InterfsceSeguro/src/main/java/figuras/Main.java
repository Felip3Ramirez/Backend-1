package figuras;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5,3,4);
        Triangulo triangulo = new Triangulo(5,3);

        System.out.println("El area del rectangulo es :"+rectangulo.calcularArea());

        System.out.println("El perimetro del rectangulo es :"+rectangulo.calcularPerimetro());

        System.out.println("El area del triangulo es :"+triangulo.calcularArea());

        System.out.println("El perimetro del triangulo es :"+triangulo.calcularPerimetro());

    }
}

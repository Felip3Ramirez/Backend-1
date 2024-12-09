package FigurasGeometricas;

public class Rectangulo extends Figura{
    private int lado1;
    private int lado2;

    public Rectangulo(int numLado, int lado1, int lado2) {
        super(numLado);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return lado1*lado2;
    }

    @Override
    public double calcularPerimetro() {
        return (lado1+lado2)*2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
}

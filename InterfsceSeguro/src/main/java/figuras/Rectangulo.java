package figuras;

public class Rectangulo implements FiguraGeometrica{
    private int lado1,lado2,numLados;

    public Rectangulo(int lado1, int lado2, int numLados) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.numLados = numLados;
    }

    @Override
    public double calcularArea() {
        return lado1*lado2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1+lado2;
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

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }
}

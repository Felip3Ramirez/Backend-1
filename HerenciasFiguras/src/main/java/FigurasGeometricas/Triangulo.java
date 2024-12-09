package FigurasGeometricas;

public class Triangulo extends Figura{
    private int base;
    private int altura;

    public Triangulo(int numLado, int base, int altura) {
        super(numLado);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return base*getNumLado();
    }

    @Override
    public String toString() {
        return "El Triangulo tiene " +super.getNumLado()+
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}

package FigurasGeometricas;

public class Figura {
    private int numLado;

    public Figura(int numLado) {
        this.numLado = numLado;
    }

    public double calcularArea(){
     return 0;
    }
    public double calcularPerimetro(){
        return 0;
    }

    @Override
    public String toString() {
        return "La Figura tiene{" +
                "lados" + numLado ;
    }

    public int getNumLado() {
        return numLado;
    }

    public void setNumLado(int numLado) {
        this.numLado = numLado;
    }
}

package Liga;

public class Operaciones {
    //Atributos
    //Sobrecarga
    int aI,bI;
    double aD,bD;

    public Operaciones(int aI, int bI) {
        this.aI = aI;
        this.bI = bI;
    }

    public Operaciones(double aD, double bD) {
        this.aD = aD;
        this.bD = bD;
    }
    public int suma(int aI ,int bI){
        return aI + bI;
    }
    public double suma(double aD, double bD){
        return aD + bD;
    }
}


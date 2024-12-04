package ligaFutbol;

public class Arbitro extends Usuario{
    //Atributos
    private  int aniosExp;
    private double salario;
    //Metodos

    public Arbitro(int idUsuario, int edad, String nombre, String posicion, int aniosExp, double salario) {
        super(idUsuario, edad, nombre, posicion);
        this.aniosExp = aniosExp;
        this.salario = salario;
    }
    public String correr(){
        return "El arbitro "+getNombre()+" puede correr";
    }
    public String calentar(){
        return "El arbitro "+getNombre()+" puede calentar";
    }
    public String pitar(){
        return "El arbitro "+getNombre()+" puede pitar";
    }
    public String robar(){
        return "El arbitro "+getNombre()+" puede robar";
    }
    public String sancionar(){
        return "El arbitro "+getNombre()+" puede sancionar";
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

package academia.model;



public class Halteres extends Equipamento{
    
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Halteres(String identificador, int quantidade, double peso) {
        super(identificador, quantidade);
        this.peso = peso;
    }

    public Halteres(String identificador, int quantidade){
        super(identificador, quantidade);
    }

    @Override
    public String toString() {
        return "Halteres [peso=" + peso + super.toString() +"]";
    }
    
}

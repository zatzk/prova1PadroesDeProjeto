package academia.model;



public class Acessorios extends Equipamento{
    
    private String Descricao;

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public Acessorios(String identificador, int quantidade, String descricao) {
        super(identificador, quantidade);
        Descricao = descricao;
    }

    public Acessorios(String identificador, int quantidade) {
        super(identificador, quantidade);        
    }

    @Override
    public String toString() {
        return "Acessorios [Descricao=" + Descricao +" "+ super.toString()+" "+ "]";
    }

}

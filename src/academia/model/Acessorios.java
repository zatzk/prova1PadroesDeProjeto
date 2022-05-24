package academia.model;

import academia.fm.TipoEquipamento;

public class Acessorios extends Equipamento{
    
    private String Descricao;

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public Acessorios(String identificador, int quantidade, String descricao, TipoEquipamento tipoeEquipamento) {
        super(identificador, quantidade, TipoEquipamento.ACESSORIOS);
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

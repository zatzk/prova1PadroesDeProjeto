package academia.model;

import academia.fm.TipoEquipamento;

public class Maquinas extends Equipamento{
    
    private String descricao;
    private String marca;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Maquinas(String identificador, int quantidade, String descricao, String marca, TipoEquipamento tipoeEquipamento) {
        super(identificador, quantidade, TipoEquipamento.MAQUINAS);
        this.descricao = descricao;
        this.marca = marca;
    }

    @Override
    public String toString() {
      return "Maquinas [identificador=" + getIdentificador() + ",quantidade=" + getQuantidade() + ", tipoEquipamento=" + getTipoeEquipamento() + ", descricao=" + descricao + ", marca=" + marca + "]";
    }

    
}

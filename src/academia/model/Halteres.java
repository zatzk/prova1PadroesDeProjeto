package academia.model;

import academia.fm.TipoEquipamento;

public class Halteres extends Equipamento{
    
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Halteres(String identificador, int quantidade, double peso, TipoEquipamento tipoeEquipamento) {
        super(identificador, quantidade, TipoEquipamento.HALTERES);
        this.peso = peso;
    }

    @Override
    public String toString() {
      return "Halteres [identificador=" + getIdentificador() + ", quantidade=" + getQuantidade() + ", tipoEquipamento=" + getTipoeEquipamento() + ", peso=" + peso + "]";
    }

    
}

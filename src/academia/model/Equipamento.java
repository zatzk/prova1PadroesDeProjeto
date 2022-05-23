package academia.model;

import academia.fm.TipoEquipamento;

public abstract class Equipamento {

  private String identificador;
  private int quantidade;
  private TipoEquipamento tipoeEquipamento;
  
  public String getIdentificador() {
    return identificador;
  }
  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }
  public int getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public TipoEquipamento getTipoeEquipamento() {
    return tipoeEquipamento;
  }
  public void setTipoeEquipamento(TipoEquipamento tipoeEquipamento) {
    this.tipoeEquipamento = tipoeEquipamento;
  }
  
  public Equipamento(String identificador, int quantidade, TipoEquipamento tipoeEquipamento) {
    this.identificador = identificador;
    this.quantidade = quantidade;
    this.tipoeEquipamento = tipoeEquipamento;
  }
  
     
}

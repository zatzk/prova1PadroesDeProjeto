package academia.model;

import academia.prototype.Equipamento;

public class Acessorios implements Equipamento {

  @Override
  public String identificador() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int quantidade() {
    // TODO Auto-generated method stub
    return 0;
  }
  public String descricao;

  //getters and setters
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }


}

package academia.model;


public abstract class Equipamento {

  private String identificador;
  private int quantidade;
  
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

  public Equipamento(String identificador, int quantidade) {
    this.identificador = identificador;
    this.quantidade = quantidade;
  }
     
}

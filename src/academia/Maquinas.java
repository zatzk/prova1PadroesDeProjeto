package academia;

public class Maquinas implements Equipamento {
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
  public String marca;


  //getters and setters
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

  

  
  
}

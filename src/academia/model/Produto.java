package academia.model;


public abstract class Produto {

  private String nome;
  private String codigo;
  private Double preco;

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  } 
  

  public abstract Double getpreco(); 

  
}

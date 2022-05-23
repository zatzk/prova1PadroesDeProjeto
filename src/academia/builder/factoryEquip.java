package academia.builder;

import academia.model.Acessorios;
import academia.model.Equipamento;
import academia.model.Halteres;
import academia.model.Maquinas;

public class factoryEquip {
  
  public static Equipamento getEquipamento(String tipoEquipamento, String identificador, int quantidade, String descricao) {
    
    if(tipoEquipamento.equals("halteres")) {
      return new Halteres(identificador, quantidade, quantidade, null);
    }
    else if(tipoEquipamento.equals("acessorios")) {
      return new Acessorios(identificador, quantidade, descricao, null);
    }
    else if(tipoEquipamento.equals("maquina")) {
      return new Maquinas(identificador, quantidade, descricao, descricao, null);
    }
    else {
      return null;
    }
    
  }

}
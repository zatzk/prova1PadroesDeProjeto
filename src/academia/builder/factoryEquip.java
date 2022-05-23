package academia.builder;

import academia.fm.TipoEquipamento;
import academia.model.*;

public class factoryEquip {
  
  public static Equipamento getEquipamento(String tipoEquipamento, String identificador, int quantidade, String descricao , String marca, double peso, TipoEquipamento tipoeEquipamento) {
    
    if(tipoEquipamento.equals("halteres")) {
      return new Halteres(identificador, quantidade, peso, TipoEquipamento.HALTERES);
    }
    else if(tipoEquipamento.equals("acessorios")) {
      return new Acessorios(identificador, quantidade, descricao, TipoEquipamento.ACESSORIOS);
    }
    else if(tipoEquipamento.equals("maquina")) {
      return new Maquinas(identificador, quantidade, marca, descricao, TipoEquipamento.MAQUINAS);
    }
    else {
      return null;
    }
    
  }

}
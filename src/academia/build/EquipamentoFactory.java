package academia.build;

import academia.model.*;
import academia.prototype.Equipamento;

enum EquipamentoFactory {
  INSTANCE;

  public Equipamento create(String tipo) {
    switch (tipo) {
      case "HALTERES":
        return new Halteres();

      case "ACESSORIOS":
        return new Acessorios();

      case "MAQUINAS":
        return new Maquinas();

      default:
        throw new IllegalArgumentException("Tipo de equipamento inválido");
    }
  }
}

package academia;

import academia.fm.EquipamentoFactory;
import academia.fm.TipoEquipamento;
import academia.model.Equipamento;

public class Aplicacao {
    public static void main(String[] args) throws Exception {
      
        Equipamento equipamento1 = EquipamentoFactory.novoEquipamento(TipoEquipamento.Acessorios, "Anilha F18", 3);

        System.out.println(equipamento1);
    }
}

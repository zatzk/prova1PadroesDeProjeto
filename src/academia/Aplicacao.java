package academia;

import academia.fm.EquipamentoFactory;
import academia.model.Equipamento;


public class Aplicacao {
    public static void main(String[] args) throws Exception {
           
        Equipamento equipamento1 = EquipamentoFactory.novoEquipamento("Halteres", "Anilha F18", 3);
        Equipamento equipamento2 = EquipamentoFactory.novoEquipamento("Halteres", "Anilha F18", 3);
        Equipamento equipamento3 = EquipamentoFactory.novoEquipamento("Halteres", "Anilha F18", 3);
        Equipamento equipamento4 = EquipamentoFactory.novoEquipamento("Maquinas", "Supino Kikos BRS206", 8);
        Equipamento equipamento5 = EquipamentoFactory.novoEquipamento("Maquinas", "Supino Kikos BRS206", 3);
        Equipamento equipamento6 = EquipamentoFactory.novoEquipamento("Acessorios", "Pilates 25L", 3);
        Equipamento equipamento7 = EquipamentoFactory.novoEquipamento("Acessorios", "Pilates 25L", 10);

        System.out.println(equipamento1);
        System.out.println(equipamento2);
        System.out.println(equipamento3);
        System.out.println(equipamento4);
        System.out.println(equipamento5);
        System.out.println(equipamento6);
        System.out.println(equipamento7);

    }
}

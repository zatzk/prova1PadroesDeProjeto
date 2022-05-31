package academia;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import academia.builder.ExercicioBuilder;
import academia.fm.EquipamentoFactory;
import academia.model.Equipamento;
import academia.model.Exercicio;
import academia.model.TipoExercicio;


public class Aplicacao {
    public static void main(String[] args) throws Exception {           
        quest1();
        quest2();
    }

    private static void quest1() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IOException {
        System.out.println("\nQuestão 1:");
        Equipamento equipamento1 = EquipamentoFactory.novoEquipamento("Halteres", "Anilha F18", 4);
        Equipamento equipamento2 = EquipamentoFactory.novoEquipamento("Halteres", "Halter Dumbbell Sextavado 10kg", 3);
        Equipamento equipamento3 = EquipamentoFactory.novoEquipamento("Halteres", "Anilha F18", 10);
        Equipamento equipamento5 = EquipamentoFactory.novoEquipamento("Maquinas", "Supino Kikos BRS206", 8);
        Equipamento equipamento4 = EquipamentoFactory.novoEquipamento("Halteres", "Anilha F18", 6);        
        Equipamento equipamento6 = EquipamentoFactory.novoEquipamento("Maquinas", "Supino Kikos BRS206", 3);
        Equipamento equipamento7 = EquipamentoFactory.novoEquipamento("Maquinas", "Supino Kikos BRS206", 1);
        Equipamento equipamento8 = EquipamentoFactory.novoEquipamento("Acessorios", "Pilates 25L", 3);
        Equipamento equipamento9 = EquipamentoFactory.novoEquipamento("Acessorios", "Pilates 25L", 10);
        Equipamento equipamento10 = EquipamentoFactory.novoEquipamento("Halteres", "Halter Dumbbell Sextavado 10kg", 5);

        System.out.println(equipamento1);
        System.out.println(equipamento2);
        System.out.println(equipamento3);
        System.out.println(equipamento4);
        System.out.println(equipamento5);
        System.out.println(equipamento6);
        System.out.println(equipamento7);
        System.out.println(equipamento8);
        System.out.println(equipamento9);
        System.out.println(equipamento10);
    }

    private static void quest2() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IOException {
            System.out.println("\nQuestão 2:");
            Equipamento equipamento1 = EquipamentoFactory.novoEquipamento("Halteres", "Anilha F18", 3);
            Equipamento equipamento2 = EquipamentoFactory.novoEquipamento("Acessorios", "Pilates 25L", 3);

            Exercicio manopla = new ExercicioBuilder("Levantamento de peso")    
            .gruposMusculares("pernas")
            .gruposMusculares("coxas")
            .categoria(TipoExercicio.Cardiovascular)
            .categoria(TipoExercicio.Funcional)
            .equipamentosUltilizados(equipamento1)
            .equipamentosUltilizados(equipamento2)
            .builder();
            
            System.out.println(manopla);
                                
    }
}

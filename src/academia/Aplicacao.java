package academia;

import academia.fm.TipoEquipamento;
import academia.model.*;


public class Aplicacao {
    public static void main(String[] args) throws Exception {
        
        Maquinas maquinas = new Maquinas("M1", 1, "Um poderoso equipamento", "Marca", TipoEquipamento.MAQUINAS);
        Halteres halteres = new Halteres("H1", 1, 1.0, TipoEquipamento.HALTERES);
        Acessorios acessorios = new Acessorios("A1", 1, "Um acessorio", TipoEquipamento.ACESSORIOS);

        System.out.println(maquinas);
        System.out.println(halteres);
        System.out.println(acessorios);
    }
}

package academia.builder;

import java.util.ArrayList;
import java.util.List;

import academia.model.Equipamento;
import academia.model.Exercicio;
import academia.model.TipoExercicio;

public class ExercicioBuilder {
    //Obrigatorio
    private String nome;
    //Opcionais
    
    private ArrayList<TipoExercicio> categoria = new ArrayList<>();
    private List<String> gruposMusculares;
    private List<Equipamento> equipamentosUltilizados;

    public ExercicioBuilder(String nome){
        this.nome = nome;
    }

    public ExercicioBuilder categoria(ArrayList<TipoExercicio> categoria){      
        for(TipoExercicio tpex : categoria){
            categoria.add(tpex);
        }  
        this.categoria = categoria;
        return this;
    }

    public ExercicioBuilder gruposMusculares(List<String> gruposMusculares){
        this.gruposMusculares = gruposMusculares;
        return this;
    }

    public ExercicioBuilder equipamentosUltilizados(List<Equipamento> equipamentosUltilizados){
        this.equipamentosUltilizados = equipamentosUltilizados;
        return this;
    }

    public Exercicio criarTipoExercio() {
		return new Exercicio(nome, categoria, gruposMusculares, equipamentosUltilizados);
	}
}

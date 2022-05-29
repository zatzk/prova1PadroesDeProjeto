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
    
    private List<TipoExercicio> categoria = new ArrayList<>();
    private List<String> gruposMusculares = new ArrayList<>();
    private List<Equipamento> equipamentosUltilizados = new ArrayList<>();;
    
    public ExercicioBuilder(String nome){
        this.nome = nome;
    }

    public ExercicioBuilder categoria(TipoExercicio categoria){      
        this.categoria.add(categoria);        
        return this;
    }

    public ExercicioBuilder gruposMusculares (String gruposMusculares){
        this.gruposMusculares.add(gruposMusculares);
        return this;
    }

    public ExercicioBuilder equipamentosUltilizados(Equipamento equipamentosUltilizados){
        this.equipamentosUltilizados.add(equipamentosUltilizados);
        return this;
    }

    public Exercicio builder() {
		return new Exercicio(nome, categoria, gruposMusculares, equipamentosUltilizados);
	}
}

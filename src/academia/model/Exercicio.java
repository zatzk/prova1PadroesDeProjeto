package academia.model;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
    
    private String nome;
    private List<TipoExercicio> categoria;
    private List<String> gruposMusculares;
    private List<Equipamento> equipamentosUltilizados;
    
    public Exercicio(String nome, List<TipoExercicio> categoria, List<String> gruposMusculares,
            List<Equipamento> equipamentosUltilizados) {
        this.nome = nome;
        this.categoria = categoria;
        this.gruposMusculares = gruposMusculares;
        this.equipamentosUltilizados = equipamentosUltilizados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<TipoExercicio> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<TipoExercicio> categoria) {
        this.categoria = categoria;
    }

    public List<String> getGruposMusculares() {
        return gruposMusculares;
    }

    public void setGruposMusculares(ArrayList<String> gruposMusculares) {
        this.gruposMusculares = gruposMusculares;
    }

    public List<Equipamento> getEquipamentosUltilizados() {
        return equipamentosUltilizados;
    }

    public void setEquipamentosUltilizados(List<Equipamento> equipamentosUltilizados) {
        this.equipamentosUltilizados = equipamentosUltilizados;
    }

    @Override
    public String toString() {
        return "Nome Exercicio = " + nome + "\nExercicio [categoria=" + categoria + ", \nEquipamentosUltilizados=" + equipamentosUltilizados
                + ", \nGruposMusculares=" + gruposMusculares + "]";
    }

}

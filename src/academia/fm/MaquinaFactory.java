package academia.fm;

import java.util.ArrayList;
import java.util.List;

import academia.model.Maquinas;

public class MaquinaFactory extends EquipamentoFactory{

    private String identificador;
    private int quantidade;

    private List<Maquinas> maquinasCriadas  = new ArrayList<Maquinas>();

    @Override
    public Maquinas createEquipamento(String identificador, int quantidade) {    
        this.identificador = identificador;
        this.quantidade = quantidade;
        System.out.println(this.identificador);
        System.out.println(this.quantidade);
       
        for(Maquinas maquin: maquinasCriadas){
            if(maquin.getIdentificador().equals(this.identificador)){
                maquin.setQuantidade(quantidade + this.quantidade);
                return maquin;                
            }
        }
        Maquinas novaMaquina = new Maquinas(identificador, quantidade); 
        maquinasCriadas.add(novaMaquina);
        return novaMaquina;       
        }             
}
    
    


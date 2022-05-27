package academia.fm;

import java.util.ArrayList;
import java.util.List;

import academia.model.Halteres;

public class HaltereFactory extends EquipamentoFactory{

    private String identificador;
    private int quantidade;

    private static List<Halteres> halteresCriados  = new ArrayList<Halteres>();

    @Override
    public Halteres createEquipamento(String identificador, int quantidade) {  
        this.identificador = identificador;
        this.quantidade = quantidade;
       
        for(Halteres halt: halteresCriados){            
            if(halt.getIdentificador().equals(this.identificador)){               
                halt.setQuantidade(quantidade + this.quantidade);
                
                return halt;                
            }
        }
        Halteres novoHaltere = new Halteres(identificador, quantidade); 
        halteresCriados.add(novoHaltere);
        return novoHaltere;         
    } 
}

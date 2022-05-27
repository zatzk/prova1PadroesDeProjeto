package academia.fm;

import java.util.ArrayList;
import java.util.List;

import academia.model.Halteres;

public class HaltereFactory extends EquipamentoFactory{

    private static List<Halteres> halteresCriados  = new ArrayList<Halteres>();

    @Override
    public Halteres createEquipamento(String identificador, int quantidade) {  
        
        for(Halteres halt: halteresCriados){            
            if(halt.getIdentificador().equals(identificador)){               
                halt.adiconarQtd(quantidade);                
                return halt;                
            }
        }
        Halteres novoHaltere = new Halteres(identificador, quantidade); 
        halteresCriados.add(novoHaltere);
        return novoHaltere;         
    } 
}

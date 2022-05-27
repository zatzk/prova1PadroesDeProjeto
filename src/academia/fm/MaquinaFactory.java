package academia.fm;

import java.util.ArrayList;
import java.util.List;

import academia.model.Maquinas;

public class MaquinaFactory extends EquipamentoFactory{

    private static List<Maquinas> maquinasCriadas  = new ArrayList<Maquinas>();

    @Override
    public Maquinas createEquipamento(String identificador, int quantidade){           
        for(Maquinas maquin: maquinasCriadas){            
            if(maquin.getIdentificador().equals(identificador)){ 
                maquin.adiconarQtd(quantidade);                                    
                return maquin; 
            }        
        }
        Maquinas novaMaquina = new Maquinas(identificador, quantidade); 
        maquinasCriadas.add(novaMaquina);
        return novaMaquina;       
        }             
}
    
    


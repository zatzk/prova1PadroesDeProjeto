package academia.fm;

import academia.model.Halteres;

public class HaltereFactory extends EquipamentoFactory{
    
    @Override
    public Halteres createEquipamento(String identificador, int quantidade) {     
        return new Halteres(identificador, quantidade);            
        }  
}

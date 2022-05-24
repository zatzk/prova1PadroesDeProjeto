package academia.fm;

import academia.model.Maquinas;

public class MaquinaFactory extends EquipamentoFactory{

    @Override
    public Maquinas createEquipamento(String identificador, int quantidade) {     
        return new Maquinas(identificador, quantidade);            
        }             
}
    
    


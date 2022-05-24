package academia.fm;

import academia.model.Acessorios;

public class AcessorioFactory extends EquipamentoFactory{
    
    @Override
    public Acessorios createEquipamento(String identificador, int quantidade) {     
        return new Acessorios(identificador, quantidade);            
        }  
}

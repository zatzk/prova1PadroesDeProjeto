package academia.fm;

import java.util.ArrayList;
import java.util.List;

import academia.model.Acessorios;

public class AcessorioFactory extends EquipamentoFactory{
    
    private static List<Acessorios> acessoriosCriados  = new ArrayList<Acessorios>();   

    @Override
    public Acessorios createEquipamento(String identificador, int quantidade) {   
        for(Acessorios acess: acessoriosCriados){
            if(acess.getIdentificador().equals(identificador)){
                acess.adiconarQtd(quantidade);
                return acess;                
            }
        }
        Acessorios novoAcessorio = new Acessorios(identificador, quantidade); 
        acessoriosCriados.add(novoAcessorio);
        return novoAcessorio;           
        }  
}

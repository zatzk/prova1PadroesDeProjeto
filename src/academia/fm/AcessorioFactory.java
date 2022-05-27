package academia.fm;

import java.util.ArrayList;
import java.util.List;

import academia.model.Acessorios;

public class AcessorioFactory extends EquipamentoFactory{
    
    private String identificador;
    private int quantidade;

    private List<Acessorios> acessoriosCriados  = new ArrayList<Acessorios>();   

    @Override
    public Acessorios createEquipamento(String identificador, int quantidade) {   
        this.identificador = identificador;
        this.quantidade = quantidade;
        System.out.println(this.identificador);
        System.out.println(this.quantidade);
       
        for(Acessorios acess: acessoriosCriados){
            if(acess.getIdentificador().equals(this.identificador)){
                acess.setQuantidade(quantidade + this.quantidade);
                return acess;                
            }
        }
        Acessorios novoAcessorio = new Acessorios(identificador, quantidade); 
        acessoriosCriados.add(novoAcessorio);
        return novoAcessorio;           
        }  
}

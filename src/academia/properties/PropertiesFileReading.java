package academia.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import academia.model.Halteres;

public class PropertiesFileReading {

    public String lerArquivoConfig(String tipoEquipamento) throws IOException{
        String filepath ="src/academia/properties/config.properties";

        Properties pros;
        String Maquinas, Halteres, Acessorios;
        pros = new Properties();
        FileInputStream teste = new FileInputStream(filepath);
        pros.load(teste);

        Maquinas = pros.getProperty("Maquinas");
        Halteres = pros.getProperty("Halteres");
        Acessorios = pros.getProperty("Acessorios");

        if("Maquinas".equals(tipoEquipamento))
            return Maquinas;
        if("Halteres".equals(tipoEquipamento))
            return Halteres;
        if("Acessorios".equals(tipoEquipamento))
            return Acessorios;   
        return "Tipo de produto inválido";     
    }
    
}

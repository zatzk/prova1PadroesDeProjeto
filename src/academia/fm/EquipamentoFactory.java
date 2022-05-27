package academia.fm;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import academia.model.Equipamento;
import academia.properties.PropertiesFileReading;

public abstract class EquipamentoFactory {

    private static PropertiesFileReading pros = new PropertiesFileReading();
    
    public static Equipamento novoEquipamento(String tipo, String identificador, int quantidade )throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IOException{

        String factoryName = pros.lerArquivoConfig(tipo);
                
        EquipamentoFactory factory = (EquipamentoFactory) Class.forName(factoryName).getConstructor().newInstance();

        return factory.createEquipamento(identificador, quantidade);
    }

    public abstract Equipamento createEquipamento(String identificador, int quantidade);

    }


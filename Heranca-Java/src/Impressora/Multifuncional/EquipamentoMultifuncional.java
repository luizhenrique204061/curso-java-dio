package Impressora.Multifuncional;

import Impressora.Copiadora;
import Impressora.Digitalizadora;
import Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {

    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
        
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
        
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
        
    }
    
}

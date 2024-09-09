package Impressora.Multifuncional.TiposImpressora;

import Impressora.Digitalizadora;

public class Scanner implements Digitalizadora {

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO");
        
    }
    
}

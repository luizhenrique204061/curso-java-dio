package Impressora.Multifuncional.TiposImpressora;

import Impressora.Copiadora;

public class Xerox implements Copiadora {

    @Override
    public void copiar() {
        System.out.println("COPIANDO");
        
    }
    
}

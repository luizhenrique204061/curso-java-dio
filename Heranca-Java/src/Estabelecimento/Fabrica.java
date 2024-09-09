package Estabelecimento;

import Impressora.Copiadora;
import Impressora.Digitalizadora;
import Impressora.Impressora;
import Impressora.Multifuncional.EquipamentoMultifuncional;
import Impressora.Multifuncional.TiposImpressora.Deskjet;
import Impressora.Multifuncional.TiposImpressora.LaserJet;
import Impressora.Multifuncional.TiposImpressora.Scanner;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional multutMultifuncional = new EquipamentoMultifuncional();
        //Impressora impressora = new EquipamentoMultifuncional();


        //Scanner scanner = new Scanner();

        Impressora impressora = multutMultifuncional;
        Digitalizadora digitalizadora = multutMultifuncional;
        Copiadora copiadora = multutMultifuncional;


        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    
        
    }
}

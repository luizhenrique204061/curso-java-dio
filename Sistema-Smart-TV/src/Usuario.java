public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
    
        System.out.println("Volume " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume " + smartTv.volume);


        smartTv.diminuirVolume();

        System.out.println("Volume " + smartTv.volume);


        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.MudarCanal(22);

        System.out.println("Canal atual " + smartTv.canal);
    }

}

package edu.alexania.projetotvsmart;

public class Usuario {
    public static void main(String[] args) {

        SmartTv  smartTv = new SmartTv();

        System.out.println("Tv está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo status -> Tv está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal atual " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Diminuir canal " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal usuario: " + smartTv.canal);



    }
    
}

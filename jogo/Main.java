package jogo;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("Mago");
        Guerreiro guerreiro = new Guerreiro("Thor");
        Arqueiro arqueiro = new Arqueiro("Arqueiro");

        System.out.println(mago.mostrarStatus());
        mago.receberDano(guerreiro.atacar());
        System.out.println(guerreiro.golpePesado());
        System.out.println(mago.mostrarStatus());


        System.out.println(guerreiro.mostrarStatus());
        guerreiro.receberDano(arqueiro.atacar());
        System.out.println(arqueiro.disparoPreciso());
        System.out.println(guerreiro.mostrarStatus());



        System.out.println(arqueiro.mostrarStatus());
        System.out.println(mago.lancarMagia());
        arqueiro.receberDano(mago.atacar());
        System.out.println(arqueiro.mostrarStatus());

    }


}
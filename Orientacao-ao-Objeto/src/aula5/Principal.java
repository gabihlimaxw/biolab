package aula5;

import java.util.Scanner;

public class Principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite o nome do seu cachorro");
        String nome = sc.next();
        IO.println("Digite a raça");
        String raca = sc.next();
        IO.println("Digite o sexo");
        String sexo = sc.next();

        Cachorro cachorro = new Cachorro(nome, raca, sexo);
        IO.println(cachorro);

        IO.println("Digite o nome do seu gato");
        String nome1 = sc.next();
        IO.println("Digite a raça");
        String raca1 = sc.next();
        IO.println("Digite o sexo");
        String sexo1 = sc.next();

        Gato gato = new Gato(nome1, raca1, sexo1);

        IO.println(gato);
    }
}

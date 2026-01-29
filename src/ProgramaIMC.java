import java.util.Scanner;

public class ProgramaIMC {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("Digite o seu nome:");
        String nome = sc.next();
        IO.println("Digite a sua idade");
        int idade = sc.nextInt();
        IO.println("Digite o seu peso");
        Double peso = sc.nextDouble();
        IO.println("Digite a sua altura");
        Double altura = sc.nextDouble();

        Double imc = peso / (altura * altura);
        IO.println(imc);
    }
}

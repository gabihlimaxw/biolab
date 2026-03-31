package abstracao_contas_bancarias;

public class Main {
    public static void main(String[] args) {

                ContaCorrente cc = new ContaCorrente(1, "0450-6", "Gabrielle");
                ContaPoupanca cp = new ContaPoupanca(2, "6543-9", "Maria");
                ContaPJ pj = new ContaPJ(3, "0971", "Closet Modas");

                // Conta Corrente
                cc.depositar(100);
                cc.sacar(20);
                cc.exibirSaldo();
                System.out.println("Tarifa CC: R$ " + cc.calcularTarifaMensal());



                // Conta Poupança
                cp.depositar(200);
                cp.sacar(50);
                cp.exibirSaldo();
                System.out.println("Tarifa CP: R$ " + cp.calcularTarifaMensal());



                // Conta PJ
                pj.depositar(300);
                pj.sacar(50);
                pj.exibirSaldo();
                System.out.println("Tarifa PJ: R$ " + pj.calcularTarifaMensal());
            }
        }

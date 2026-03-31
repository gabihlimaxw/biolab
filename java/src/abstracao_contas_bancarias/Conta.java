package abstracao_contas_bancarias;

    abstract class Conta {
        int numero;
        String agencia;
        String titular;
        double saldo;

        public Conta(int numero, String agencia, String titular) {
            this.numero = numero;
            this.agencia = agencia;
            this.titular = titular;
            this.saldo = 0;
        }

        public void depositar(double valor) {
            saldo += valor;
        }

        public void sacar(double valor) {
            saldo -= valor;
        }

        public void exibirSaldo() {
            System.out.println("Saldo: R$ " + saldo);
        }

        public abstract double calcularTarifaMensal();
    }


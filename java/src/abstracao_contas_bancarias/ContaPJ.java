package abstracao_contas_bancarias;

    class ContaPJ extends Conta {

        public ContaPJ(int numero, String agencia, String titular) {
            super(numero, agencia, titular);
        }

        // Saque com taxa extra
        @Override
        public void sacar(double valor) {
            saldo -= (valor + 1.50);
        }

        @Override
        public double calcularTarifaMensal() {
            return 20.0;
        }
    }


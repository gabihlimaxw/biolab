package abstracao_contas_bancarias;

    class ContaPoupanca extends Conta {

        public ContaPoupanca(int numero, String agencia, String titular) {
            super(numero, agencia, titular);
        }

        @Override
        public double calcularTarifaMensal() {
            return 0;
        }
    }


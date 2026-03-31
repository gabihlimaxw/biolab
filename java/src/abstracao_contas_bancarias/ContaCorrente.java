package abstracao_contas_bancarias;

    class ContaCorrente extends Conta {

        public ContaCorrente(int numero, String agencia, String titular) {
            super(numero, agencia, titular);
        }

        @Override
        public double calcularTarifaMensal() {
            return 12.0;
        }
    }


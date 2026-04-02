package sistema_de_pagamentos;

class Boleto extends Pagamento {

    String codigoBoleto;

    public Boleto(double valor, String codigoBoleto) {
        super(valor);
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " com boleto: " + codigoBoleto);
    }
}

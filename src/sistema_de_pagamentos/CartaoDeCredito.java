package sistema_de_pagamentos;

class CartaoCredito extends Pagamento {

    String numeroCartao;

    public CartaoCredito(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " no cartão: " + numeroCartao);
    }
}
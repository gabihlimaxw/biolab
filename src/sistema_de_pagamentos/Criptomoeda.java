package sistema_de_pagamentos;

class Criptomoeda extends Pagamento {

    String carteira;

    public Criptomoeda(double valor, String carteira) {
        super(valor);
        this.carteira = carteira;
    }

    @Override
    void processarPagamento() {
        System.out.println("Pagamento em cripto para carteira: " + carteira);
    }
}

package sistema_de_pagamentos;

class Pix extends Pagamento {

    String chavePix;

    public Pix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    void processarPagamento() {
        System.out.println("Pagamento de R$" + valor + " via Pix para: " + chavePix);
    }
}
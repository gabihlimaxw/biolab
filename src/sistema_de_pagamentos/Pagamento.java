package sistema_de_pagamentos;

abstract class Pagamento {

    double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    abstract void processarPagamento();
}
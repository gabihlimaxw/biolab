package sistema_de_pagamentos;

public class Main {
    public static void main(String[] args) {

        Pagamento p1 = new CartaoCredito(100.0, "1234-5678");
        Pagamento p2 = new Boleto(200.0, "000111222");
        Pagamento p3 = new Pix(50.0, "email@pix.com");

        p1.processarPagamento();
        p2.processarPagamento();
        p3.processarPagamento();
    }
}
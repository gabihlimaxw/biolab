package pedidos_com_enum;
public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.setStatus(StatusPedido.AGUARDANDO_PAGAMENTO);
        System.out.println("Status inicial: " + pedido.getStatus());


        pedido.avancarStatus();
        System.out.println("Após avançar: " + pedido.getStatus());

        pedido.avancarStatus();
        System.out.println("Após avançar: " + pedido.getStatus());


        System.out.println("Status final: " + pedido.getStatus());
    }
}
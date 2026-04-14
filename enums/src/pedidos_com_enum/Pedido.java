package pedidos_com_enum;

public class Pedido {
    private int id;
    public String cliente;
    public StatusPedido status;

    public Pedido() {
    }

    public Pedido(int id, String cliente, StatusPedido status) {
        this.id = id;
        this.cliente = cliente;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void avancarStatus() {
        if (status == StatusPedido.AGUARDANDO_PAGAMENTO) {
            status = StatusPedido.PROCESSANDO;

        } else if (status == StatusPedido.PROCESSANDO) {
            status = StatusPedido.ENVIADO;

        } else if (status == StatusPedido.ENVIADO) {
            status = StatusPedido.ENTREGUE;
        }}
        public void cancelarPedido(){
            if (status != StatusPedido.ENTREGUE) {
                status = StatusPedido.CANCELADO;}
        }

        }




public class PedidoAdapter extends AvaliacaoPedido {
    private IPedido itemPedido;

    public PedidoAdapter(IPedido itemPedido) {
        this.itemPedido = itemPedido;
    }

    public String recuperarAvaliacaoPedido() {
        if (itemPedido.setAvaliacaoPedido() >= 60.0f)
            itemPedido.setAvaliacaoPedido("Pedido Grande");
        else if (itemPedido.setAvaliacaoPedido() >= 30.0f)
            itemPedido.setAvaliacaoPedido("Pedido Médio");
        else
            itemPedido.setAvaliacaoPedido("Pedido Pequeno");

        return itemPedido.getAvaliacaoPedido();
    }

    public void salvarAvaliacaoPedido() {
        String estadoPedido = itemPedido.getAvaliacaoPedido();
        if (estadoPedido.equals("Pedido Grande"))
            itemPedido.setAvaliacaoPedido("Pedido Grande");
        else if (estadoPedido.equals("Pedido Médio"))
            itemPedido.setAvaliacaoPedido("Pedido Médio");
        else
            itemPedido.setAvaliacaoPedido("Pedido Pequeno");
    }
}

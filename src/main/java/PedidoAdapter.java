public class PedidoAdapter extends AvaliacaoPedido {
    private IPedido itemPedido;

    public PedidoAdapter(IPedido itemPedido) {
        this.itemPedido = itemPedido;
    }

    public String recuperarAvaliacaoPedido() {
        if (Float.parseFloat(itemPedido.getAvaliacaoPedido()) >= 60.0f)
            itemPedido.setAvaliacaoPedido("Pedido Grande");
        else if (Float.parseFloat(itemPedido.getAvaliacaoPedido()) >= 30.0f)
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

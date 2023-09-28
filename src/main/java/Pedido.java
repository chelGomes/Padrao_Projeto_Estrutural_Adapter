public class Pedido {
    IPedido pedido;
    PedidoAdapter persistencia;

    public Pedido() {
        pedido = new AvaliacaoPedido();
        persistencia = new PedidoAdapter(pedido);
    }

    public void setAvaliacaoPedido(String avaliacaoPedido) {
        pedido.setAvaliacaoPedido(avaliacaoPedido);
        persistencia.salvarAvaliacaoPedido();
    }

    public String getAvaliacaoPedido() {
        return persistencia.recuperarAvaliacaoPedido();
    }

    public double getValorTotalPedido() {
        return persistencia.getValorPedido();
    }
}

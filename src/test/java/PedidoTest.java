import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {
    @Test
    void deveRetornarAvaliacoPedido() {
        Pedido pedido = new Pedido();
        pedido.setAvaliacaoPedido("Pedido Médio");

        assertEquals("Pedido Médio", pedido.getAvaliacaoPedido());
    }

    @Test
    void deveRetornarValorTotalPedido() {
        Pedido pedido = new Pedido();
        pedido.setAvaliacaoPedido("Pedido Médio");

        assertEquals(60.0f, pedido.getValorTotalPedido());
    }
}

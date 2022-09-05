package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedido;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(),dados.getQuantidadedeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        EnviarEmailPedido email = new EnviarEmailPedido();
        SalvarPedido salvar = new SalvarPedido();

        email.executar(pedido);
        salvar.executar(pedido);

    }
}

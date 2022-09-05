package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.acao.AddLogs;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedido;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args){
        String cliente = "Ingrid Bispo";
        BigDecimal valorOrcamento = new BigDecimal(600);
        int qtdItens = 10;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, qtdItens);

        GeraPedidoHandler handler = new GeraPedidoHandler(
            Arrays.asList(
                    new SalvarPedido(),
                    new EnviarEmailPedido(),
                    new AddLogs()
                    //Ações futuras podem ser adicionadas aqui.
            )
        );
        
        handler.execute(gerador);

    }

}

package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class AddLogs implements AcaoAposGerarPedido{
    public void executarAcao(Pedido pedido){
        System.out.println("Salvando logs no Kibana...");
    }

}

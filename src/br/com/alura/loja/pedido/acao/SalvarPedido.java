package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedido implements AcaoAposGerarPedido {
    public void executarAcao(Pedido pedido){
        System.out.println("Salvando e-mail no banco de dados...");
    }
}

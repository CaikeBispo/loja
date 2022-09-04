package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.GeraPedido;

import java.math.BigDecimal;

public class TestesPedidos {

    public static void main(String[] args){
        String cliente = "Ingrid Bispo";
        BigDecimal valorOrcamento = new BigDecimal(600);
        int qtdItens = 10;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, qtdItens);

        GeraPedidoHandler handler = new GeraPedidoHandler(/*Dependencias*/);
        
        handler.execute(gerador);

    }

}

package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidadedeItens() {
        return quantidadedeItens;
    }

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadedeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadedeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadedeItens = quantidadedeItens;
    }

}

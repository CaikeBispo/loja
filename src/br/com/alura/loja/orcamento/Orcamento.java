package br.com.alura.loja.orcamento;

import br.com.alura.loja.TestesDescontos;
import br.com.alura.loja.orcamento.situacao.Aprovado;
import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacao;

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new EmAnalise();
	}

	public void applicarDescontoExtra(){
		BigDecimal vlDescontoExtra = this.situacao.calcularValorDescontroExtra(this);

		this.valor = this.valor.subtract(vlDescontoExtra);

	}

	public void aprovar(){
		this.situacao.aprovar(this);
	}
	public void reprovar(){
		this.situacao.reprovar(this);
	}
	public void finalizar(){
		this.situacao.finalizar(this);
	}


	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

}

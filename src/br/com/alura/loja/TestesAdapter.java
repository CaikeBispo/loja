package br.com.alura.loja;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args){
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("300")));
        orcamento.aprovar();
        orcamento.finalizar();

        //O padrão Adapter pode nos ajudar a trocar detalhes de infraestrutura sem muito trabal
        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);

    }
}

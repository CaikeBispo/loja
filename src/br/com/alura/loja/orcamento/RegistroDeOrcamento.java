package br.com.alura.loja.orcamento;

import br.com.alura.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    private HttpAdapter http;


    public void registrar(Orcamento orcamento){
        if(!orcamento.isFinalizado()){
            throw new DomainException("Orcamento ainda nao foi finalizado");
        }
        String url = "http://api.caike/orcamento";
        Map<String, Object> dados = Map.of(
            "valor", orcamento.getValor(),
            "quantidadeItens", orcamento.getQuantidadeItens()
        );

        http.post(url, dados);
    }
}

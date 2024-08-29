package main.java.map.Pesquisa;

import java.util.Map;
import java.util.HashMap;
import java.lang.String;
import java.lang.Integer;


public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if(!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavrasMap);
    }

    public Map.Entry<String, Integer> encontrarPalavraMaisFrequente() {
        Map.Entry<String, Integer> palavraMaisFrequente = null;
        int qtdPalavraMaisFrequente = 0;
        for(Map.Entry<String, Integer> palavra : contagemPalavrasMap.entrySet()) {
            Integer contagemLinha = palavra.getValue();
            if(contagemLinha > qtdPalavraMaisFrequente) {
                qtdPalavraMaisFrequente = contagemLinha;
                palavraMaisFrequente = palavra;
            }
                
        }

        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Abacate", 5);
        contagemPalavras.adicionarPalavra("Banana", 7);
        contagemPalavras.adicionarPalavra("Melancia", 25);
        contagemPalavras.adicionarPalavra("Bolacha", 15);
    
        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("Bolacha");
    
        contagemPalavras.exibirContagemPalavras();

        System.out.println("Palavra mais frequente: " + contagemPalavras.encontrarPalavraMaisFrequente());
    }
}

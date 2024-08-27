package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(this.dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPesquisada = null;
        if(!dicionarioMap.isEmpty()) {
            palavraPesquisada = dicionarioMap.get(palavra);
        }
        return palavraPesquisada;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("ata", "É o registro de uma reunião, assembléia ou sessão");
        dicionario.adicionarPalavra("conceito", "compreensão que alguém tem de uma palavra; noção, concepção, ideia");
        dicionario.adicionarPalavra("brado", "voz forte e enérgica de forma a ser ouvida longe ou com temor; grito");
    
        dicionario.exibirPalavras();

        dicionario.removerPalavra("ata");

        dicionario.exibirPalavras();

        System.out.println("Definição da palavra brado: " + dicionario.pesquisarPorPalavra("brado"));
    }
}

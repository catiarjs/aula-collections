package main.java.set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra) {
        Palavra palavraParaRemover = null;
        for(Palavra p : palavraSet) {
            if(p.getNome() == palavra) {
                palavraParaRemover = p;
                break;
            }
        }
        palavraSet.remove(palavraParaRemover);
    }

    public String verificarPalavra(String palavra) {
        String status = "ausente";
        for(Palavra p : palavraSet) {
            if(p.getNome().equalsIgnoreCase(palavra)) {
                status = "presente";
                break;
            }
        }

        return status;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Livro");
        conjuntoPalavrasUnicas.adicionarPalavra("Mesa");
        conjuntoPalavrasUnicas.adicionarPalavra("Cadeira");
        conjuntoPalavrasUnicas.adicionarPalavra("Sofá");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Livro");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("A palavra Mesa está "+ conjuntoPalavrasUnicas.verificarPalavra("Mesa") + " no conjunto");

        System.out.println("A palavra Sorvete está "+ conjuntoPalavrasUnicas.verificarPalavra("Sorvete") + " no conjunto");
    }
}

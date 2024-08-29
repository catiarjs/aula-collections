package main.java.map.Ordenacao;

import java.util.*;
import java.util.Collections;

public class LivrariaOnline {
    private Map<String, Livro> livrariaOnlineMap;

    public LivrariaOnline() {
        this.livrariaOnlineMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, Double preco) {
        livrariaOnlineMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        String livroPorTituloKey = null;
        for (Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()) {
            Livro livro = entry.getValue();
            if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroPorTituloKey  = entry.getKey();
            }
        }
        if(livroPorTituloKey != null) {
            livrariaOnlineMap.remove(livroPorTituloKey);
        }   
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Livro> livrosOrdernados = new ArrayList<>(livrariaOnlineMap.values());
        Collections.sort(livrosOrdernados);
        System.out.println(livrosOrdernados);
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()) {
            Livro livro = entry.getValue();
            if(livro.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(livro);
            }
            
          }
        return livrosPorAutor;  
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        Double maiorValor = 0d;
        for (Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()) {
            Livro livro = entry.getValue();
            if(livro.getPreco() > maiorValor) {
                livroMaisCaro = livro;
                maiorValor = livro.getPreco();
            }
          }

        return livroMaisCaro;  
    }

    public Livro obterLivroMaisBarato() {
        Livro livroMaisBarato = null;
        Double menorValor = Double.MAX_VALUE;
        for (Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()) {
            Livro livro = entry.getValue();
            if(livro.getPreco() < menorValor) {
                livroMaisBarato = livro;
                menorValor = livro.getPreco();
            }
          }

        return livroMaisBarato;  
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("amazon.com.br/1","O restaurante no fim do universo (O mochileiro das galáxias – Livro 2", "Douglas Adams", 39.50);
        livrariaOnline.adicionarLivro("amazon.com.br/2","A vida, o universo e tudo mais (O mochileiro das galáxias – Livro 3)", "Douglas Adams", 35.55);
        livrariaOnline.adicionarLivro("amazon.com.br/3","Harry Potter e a Pedra Filosofal", "J.K. Rowling", 36.55);
        livrariaOnline.adicionarLivro("amazon.com.br/4","O mundo de Sofia", "Jostein Gaarder", 51.94);

        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        livrariaOnline.removerLivro("O mundo de Sofia");

        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        System.out.println("Livros do Autor Douglas Adams: "+ livrariaOnline.pesquisarLivrosPorAutor("Douglas Adams"));

        System.out.println("O livro mais caro é: "+livrariaOnline.obterLivroMaisCaro());

        System.out.println("O livro mais barato é: "+livrariaOnline.obterLivroMaisBarato());
    }
}

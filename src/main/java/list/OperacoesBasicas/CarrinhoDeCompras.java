package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item novoItem = new Item();
        novoItem.setNome(nome);
        novoItem.setPreco(preco);
        novoItem.setQuantidade(quantidade);
        itemList.add(novoItem);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item item: itemList) {
            if(item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public void calcularValorTotal() {
        double valorTotal = 0;
        for(Item item: itemList) {
            valorTotal += (item.getPreco() * item.getQuantidade());
        }
        System.out.println("O valor total é: " + valorTotal);
    }

    public void exibirItens() {
        System.out.println(itemList);
    }
    
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("chocolate", 5.50, 2);
        carrinho.adicionarItem("mussarela", 3.80, 1);
        carrinho.adicionarItem("salame", 8.00, 1);
        carrinho.adicionarItem("salame", 8.00, 1);

        carrinho.exibirItens();
        
        carrinho.removerItem("salame");
        carrinho.exibirItens();
        carrinho.calcularValorTotal();
    }
}

package main.java.list.OperacoesBasicas;

public class Item {
    String nome;
    double preco;
    int quantidade;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String toString() {
        return " \n Nome: " + getNome() + "\n" +
        " Preço: "+ getPreco() + "\n" + 
        " Quantidade: " + getQuantidade();
    }
}

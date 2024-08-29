package main.java.map.Ordenacao;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private Double preco;
    
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(preco);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
            return false;
        return true;
    }

    @Override
    public int compareTo(Livro l) {
        return preco.compareTo(l.getPreco());
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
    }
}

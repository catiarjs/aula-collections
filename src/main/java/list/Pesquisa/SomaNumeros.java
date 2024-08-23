package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public int calcularSoma() {
        int total = 0;

        for(Integer numero: this.numerosList) {
            total += numero;
        }
        
        return total;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = this.numerosList.get(0);

        for(int i = 1; i < this.numerosList.size(); ++i) {
            if (this.numerosList.get(i) > maiorNumero) {
                maiorNumero = this.numerosList.get(i);
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = this.numerosList.get(0);
        for(int i = 1; i < this.numerosList.size(); ++i) {
            if (this.numerosList.get(i) < menorNumero) {
                menorNumero = this.numerosList.get(i);
            }
        }

        return menorNumero;
    }

    public void exibirNumeros() {
        for(Integer numero: this.numerosList) {
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(4);
        System.out.println("A soma é: " + somaNumeros.calcularSoma()+ "\n");
        System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero()+ "\n");
        System.out.println("O menor número é: " + somaNumeros.encontrarMenorNumero()+ "\n");
        somaNumeros.exibirNumeros();
    }
}

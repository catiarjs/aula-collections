package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numero> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosList.add(new Numero(numero));
    }

    public List<Numero> ordenarAscendente() {
        List<Numero> numerosAscendentes = new ArrayList<>(numerosList);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }
   
    public List<Numero> ordenarDescendente() {
        List<Numero> numerosDescendentes = new ArrayList<>(numerosList);
        Collections.sort(numerosDescendentes, (o1, o2) -> o2.compareTo(o1));
        return numerosDescendentes;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(6);

         System.out.println(ordenacaoNumeros.numerosList);
         System.out.println(ordenacaoNumeros.ordenarAscendente());
         System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}

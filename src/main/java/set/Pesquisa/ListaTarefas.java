package main.java.set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaAExcluir = null;

        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaAExcluir = tarefa;
                break;
            }
        }

        this.tarefaSet.remove(tarefaAExcluir);
    }
    
    public void exibirTarefas() {
        System.out.println(this.tarefaSet);
    }

    public int contarTarefas() {
        return this.tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : this.tarefaSet) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : this.tarefaSet) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : this.tarefaSet) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : this.tarefaSet) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        this.tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        listaTarefa.adicionarTarefa("Arrumar a cama");
        listaTarefa.adicionarTarefa("dar banho no cachorro");
        listaTarefa.adicionarTarefa("fazer compras");
        listaTarefa.adicionarTarefa("fazer pão");
        listaTarefa.adicionarTarefa("dormir");

        listaTarefa.exibirTarefas();

        listaTarefa.removerTarefa("dar banho no cachorro");

        listaTarefa.exibirTarefas();
        System.out.println("Quantidade de tarefas: " + listaTarefa.contarTarefas());

        listaTarefa.marcarTarefaConcluida("Arrumar a cama");
        listaTarefa.marcarTarefaConcluida("fazer compras");
        listaTarefa.marcarTarefaConcluida("dormir");

        listaTarefa.exibirTarefas();

        System.out.println("Tarefas concluídas: \n" + listaTarefa.obterTarefasConcluidas());

        listaTarefa.marcarTarefaPendente("dormir");

        System.out.println("Tarefas pendentes: \n" + listaTarefa.obterTarefasPendentes());

        listaTarefa.limparListaTarefas();

        System.out.println("Quantidade de tarefas após limpeza: "+ listaTarefa.contarTarefas());
    }
}

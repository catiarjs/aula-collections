package main.java.set.Ordenacao;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class GerenciadorAlunos {
    public Set<Aluno> alunoSet;

    
    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        this.alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoAExcluir = null;
        for (Aluno aluno : alunoSet) {
            if(aluno.getMatricula() == matricula) {
                alunoAExcluir = aluno;
            }
        }

        alunoSet.remove(alunoAExcluir);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNome = new TreeSet<>(new comparatorPorNota());
        alunosPorNome.addAll(this.alunoSet);

        return alunosPorNome;
    }

    public void exibirAlunos() {
        System.out.println(this.alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Deltrano de Oliveira", 1276L, 7.5);
        gerenciadorAlunos.adicionarAluno("Fulano da Silva", 1256L, 7.5);
        gerenciadorAlunos.adicionarAluno("José Santos", 1976L, 6.2);
        gerenciadorAlunos.adicionarAluno("Ciclano Souza", 1976L, 9.1);

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(1256L);

        System.out.println("Alunos por nome: \n" + gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("Alunos por nota: \n" + gerenciadorAlunos.exibirAlunosPorNota());

    }
}

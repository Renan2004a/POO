package Ex4;

public class Main {
    public static void main(String[] args) {
        // Criando um vetor com 15 objetos Aluno
        Aluno[] alunos = new Aluno[15];

        // Preenchendo os dados dos alunos através do setter
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno("Aluno " + (i + 1), "Série " + (i % 3 + 1), (char) ('A' + i % 5));
        }

        // Exibindo a quantidade de alunos criados
        System.out.println("Quantidade de alunos criados: " + Aluno.getQuantidadeDeAlunos());
    }
}
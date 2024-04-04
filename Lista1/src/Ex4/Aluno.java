package Ex4;

public class Aluno {
    private String nome;
    private String serie;
    private char grau;
    private static int quantidadeDeAlunos = 0;

    // Construtor
    public Aluno(String nome, String serie, char grau) {
        this.nome = nome;
        this.serie = serie;
        this.grau = grau;
        quantidadeDeAlunos++;
    }

    // Getter e Setter para o nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para a série
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    // Getter e Setter para o grau
    public char getGrau() {
        return grau;
    }

    public void setGrau(char grau) {
        this.grau = grau;
    }

    // Getter para a quantidade de alunos
    public static int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }
}
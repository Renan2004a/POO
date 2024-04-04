package Ex3;

public class Empregado {
	
	
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    // Construtor
    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salarioMensal >= 0) {
            this.salarioMensal = salarioMensal;
        } else {
            throw new IllegalArgumentException("O salário mensal não pode ser negativo.");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal >= 0) {
            this.salarioMensal = salarioMensal;
        } else {
            throw new IllegalArgumentException("O salário mensal não pode ser negativo.");
        }
    }

    // Método para calcular o salário anual
    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }

    // Método para dar um aumento de 10%
    public void aplicarAumento() {
        salarioMensal *= 1.10;
    }
}
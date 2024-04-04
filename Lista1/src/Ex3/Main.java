package Ex3;

public class Main{
	
	
    public static void main(String[] args) {
    	
        // Criando Empregado
        Empregado empregado1 = new Empregado("João", "Silva", 3000);
        Empregado empregado2 = new Empregado("Maria", "Santos", 4000);

        // Calculando e exibindo o salário anual de cada empregado
        
        System.out.println("Salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": " +
                empregado1.calcularSalarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " +
                empregado2.calcularSalarioAnual());

        // Aplicando aumento de 10%
        empregado1.aplicarAumento();
        empregado2.aplicarAumento();

        // Calculando e exibindo o salário anual após o aumento
        
        System.out.println("\nSalário anual após aumento de 10%:");
        System.out.println("Novo salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": " +
                empregado1.calcularSalarioAnual());
        System.out.println("Novo salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " +
                empregado2.calcularSalarioAnual());
    }
}
public class Main {



	public static void main(String[] args) {

		

		

		NotaFiscal nota1 = new NotaFiscal("1234", "Placa-Mãe", 2, 450.0);

		NotaFiscal nota2 = new NotaFiscal("5678", "Mémoria RAM", 4, 320.0);

		

		nota1.setPreco(500.0);

		nota2.setDescPecas("Mémoria RAM");

	

		

		

		

		

		System.out.println(" nota1 - Npecas: " + nota1.getNpecas() + " nota1 - DescPecas :" + nota1.getDescPecas() + " nota1 - QntComprada :" + nota1.getQntComprada() + " nota1 - Preco: " + nota1.getPreco());

		System.out.println(" nota2 - Npecas: " + nota2.getNpecas() + " nota2 - DescPecas :" + nota2.getDescPecas() + " nota2 - QntComprada :" + nota2.getQntComprada() + " nota2 - Preco: " + nota2.getPreco());

		

		NotaFiscal[] notas = {nota1, nota2};

		double total = NotaFiscal.getTotalNota(notas);

		System.out.println ("Total das Notas:" + total);

	





	}

}
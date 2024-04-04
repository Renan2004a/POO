package Ex2;

public class NotaFiscal {



	private String Npecas;

	private String DescPecas;

	private int QntComprada;

	private double Preco;







	public NotaFiscal(String Npecas, String DescPecas, int QntComprada, double Preco) {



		this.Npecas = Npecas;

		this.DescPecas = DescPecas;

		this.QntComprada = QntComprada;

		this.Preco = Preco;

	}



	public String getNpecas() {

		return Npecas;

	}



	public void setNpecas(String npecas) {

		Npecas = npecas;

	}



	public String getDescPecas() {

		return DescPecas;

	}



	public void setDescPecas(String descPecas) {

		DescPecas = descPecas;

	}



	public int getQntComprada() {

		return QntComprada;

	}



	public void setQntComprada(int qntComprada) {

		QntComprada = qntComprada;

	}

	public double getPreco() {

		return Preco;

	}



	public void setPreco(double preco) {

		Preco = preco;

	}

	



	public static float getTotalNota(NotaFiscal[] notas) {



		float total = 0;

		for (NotaFiscal nota : notas) {

			total += nota.getQntComprada() * nota.getPreco();



		}

		return total;

	}



}
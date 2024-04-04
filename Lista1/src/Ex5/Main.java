package Ex5;

public class Main {
    public static void main(String[] args) {
    	
    	
        // Criando um vetor de 5 posições
        Estacionamento[] estacionamento = new Estacionamento[5];

        // Preenchendo o vetor com objetos Estacionamento
        for (int i = 0; i < estacionamento.length; i++) {
            estacionamento[i] = new Estacionamento();
            estacionamento[i].setPlaca("ABC-123" + i);
            estacionamento[i].setModelo("Carro " + i);
            estacionamento[i].setHoraEntrada(new Tempo(8, 0)); // Hora de entrada fictícia
            estacionamento[i].setHoraSaida(new Tempo(12, 0)); // Hora de saída fictícia
        }

        // Testando os métodos
        for (Estacionamento carro : estacionamento) {
            carro.imprimirDadosCarro();
            System.out.println("Valor a pagar: R$" + carro.calcularValorPago());
            System.out.println();
        }
    }
}
package Ex5;

public class Estacionamento {
    private String placa;
    private String modelo;
    private Tempo horaEntrada;
    private Tempo horaSaida;

    // Getter e Setter para a placa
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Getter e Setter para o modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter e Setter para a hora de entrada
    public Tempo getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    // Getter e Setter para a hora de saída
    public Tempo getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }

    // Método para inicializar os dados com vazio ou zero
    public void inicializarDados() {
        this.placa = "";
        this.modelo = "";
        this.horaEntrada = new Tempo();
        this.horaSaida = new Tempo();
    }

    // Método para imprimir os dados de um carro estacionado
    public void imprimirDadosCarro() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Hora de entrada: " + horaEntrada);
        System.out.println("Hora de saída: " + horaSaida);
    }

    // Método para calcular e retornar o valor a ser pago pelo carro estacionado
    public double calcularValorPago() {
        int horasEstacionado = horaSaida.calcularDiferencaHoras(horaEntrada);
        double valorAPagar = horasEstacionado * 1.50; // Preço por hora

        return valorAPagar;
    }
}

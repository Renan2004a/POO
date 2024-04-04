package Ex5;

class Tempo {
    private int hora;
    private int minuto;

    // Construtor
    public Tempo(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    // Getters e setters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    // Método para calcular a diferença em horas entre dois tempos
    public int calcularDiferencaHoras(Tempo outroTempo) {
        int horas = outroTempo.getHora() - this.hora;
        int minutos = outroTempo.getMinuto() - this.minuto;

        if (minutos < 0) {
            horas--;
            minutos += 60;
        }

        return horas;
    }

    // Método toString para imprimir o tempo
    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minuto);
    }
}

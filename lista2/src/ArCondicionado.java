public class ArCondicionado {
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado() {
        this.marca = "Indefinida";
        this.modelo = "Indefinido";
        this.temperatura = 24;
        this.ligado = false;
    }

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        this.setMarca(marca);
        this.modelo = modelo;
        this.setTemperatura(temperatura);
        this.ligado = ligado;
    }

    public void setTemperatura(int t) {
        if (t >= 16 && t <= 30) {
            this.temperatura = t;
        } else {
            System.out.println("Temperatura fora da faixa");
        }
    }

    public void setMarca(String m) {
        if (m != null && m.length() >= 3) {
            this.marca = m;
        } else {
            System.out.println("Marca invalida. Deve conter pelo menos 3 caracteres.");
        }
    }

    public void ativarModoTurbo() {
        if (this.verificarCompressor()) {
            this.setTemperatura(16);
            System.out.println("Modo Turbo ativado com sucesso.");
        } else {
            System.out.println("Falha tecnica no compressor.");
        }
    }

    private boolean verificarCompressor() {
        int verifica = (int) (Math.random() * 10);
        return verifica > 2;
    }

    public String toString() {
        String status = this.ligado ? "Ligado" : "Desligado";
        return "Marca: " + this.marca +
                " | Modelo: " + this.modelo +
                " | Temperatura: " + this.temperatura + "C" +
                " | Status: " + status;
    }
}
public class Placar {
    private String nomeTimeCasa;
    private String nomeTimeVisitante;
    private int pontosCasa;
    private int pontosVisitante;
    private int periodoQuarto;

    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo) {
        if (tipo >= 1 && tipo <= 3) {
            if (time == "casa") {
                this.pontosCasa += tipo;
                System.out.println(this.nomeTimeCasa + " marcou " + tipo + " pontos!");
            } else if (time == "visitante") {
                this.pontosVisitante += tipo;
                System.out.println(this.nomeTimeVisitante + " marcou " + tipo + " pontos!");
            }
        } else {
            System.out.println("Ponto invalido. Registre 1, 2 ou 3.");
        }
    }

    public void proximoQuarto() {
        if (this.periodoQuarto < 4) {
            this.periodoQuarto++;
        } else {
            System.out.println("O jogo já terminou!");
        }
    }

    public String toString() {
        return this.nomeTimeCasa + " " + this.pontosCasa + " x " +
                this.pontosVisitante + " " + this.nomeTimeVisitante +
                " - Período: " + this.periodoQuarto;
    }
}
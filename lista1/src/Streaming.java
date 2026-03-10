public class Streaming {
    private String usuario;
    private String plano;
    private float mensalidade;
    private boolean ativo;
    private String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        this.ativo = true;
        this.ultimoFilmeAssistido = "Sem histórico";

        if (plano == "Básico") {
            this.mensalidade = 25.90f;
        } else if (plano == "Premium") {
            this.mensalidade = 45.90f;
        } else if (plano == "Família") {
            this.mensalidade = 60.90f;
        } else {
            this.mensalidade = 0.0f;
        }
    }

    public void assistirFilme(String nomeFilme) {
        if (this.ativo) {
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Sua conta esta suspensa! Pague a fatura para continuar o serviço.");
        }
    }

    public void cancelarAssinatura() {
        this.ativo = false;
    }

    public String toString() {
        String statusFormatado = this.ativo ? "Ativo" : "Suspenso";

        return "Usuário: " + this.usuario + " | Plano: " + this.plano +
                " | Mensalidade: R$" + this.mensalidade +
                " | Status: " + statusFormatado +
                " | Último Filme: " + this.ultimoFilmeAssistido;
    }
}
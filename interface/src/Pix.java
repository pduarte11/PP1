public class Pix implements IPagamento {
    private String chavePix;

    public Pix(String pix) {
        this.chavePix = pix;
    }

    @Override
    public void autorizar(float valor) {
        System.out.printf("Gerando QRCode para chave: " + chavePix);
        System.out.printf("Pix transferido no valor de R$" + valor);
    }

    @Override
    public void exibirComprovante() {
        System.out.printf("Comprovante disponivel no App do banco");
    }
}

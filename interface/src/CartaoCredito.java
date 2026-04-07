public class CartaoCredito implements IPagamento{
    private String nroCartao;

    public CartaoCredito(String nroCartao) {
        this.nroCartao = nroCartao;
    }

    @Override
    public void autorizar(float valor) {
        System.out.printf("Verificando cartão: " + this.nroCartao);
        System.out.printf("Pagamento de " + valor + " autorizado");
    }

    @Override
    public void exibirComprovante() {
        System.out.printf("Comprovante enviado para seu email");
    }
}

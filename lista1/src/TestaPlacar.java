public class TestaPlacar {
    public static void main(String[] args) {
        Placar jogo = new Placar("Franca", "Flamengo");
        System.out.println(jogo.toString());

        jogo.registrarPonto("casa", 3);
        jogo.registrarPonto("casa", 2);
        jogo.registrarPonto("visitante", 3);
        System.out.println(jogo.toString());

        jogo.proximoQuarto();
        jogo.registrarPonto("visitante", 1);
        System.out.println(jogo.toString());

        jogo.proximoQuarto();
        jogo.proximoQuarto();
        System.out.println(jogo.toString());

        jogo.proximoQuarto();

        jogo.registrarPonto("casa", 5);
    }
}
package Exc1;

public class TestaVeiculo {
    public static void main(String[] args) {
        Aviao a1 = new Aviao("Boeing", "123", 900.0f, 10000.0f);
        CarroEletrico c1 = new CarroEletrico("BYD", "Dolphin", 120.0f, 600);

        Veiculo v = a1;
        v.mover();

        v = c1;
        v.mover();
    }
}
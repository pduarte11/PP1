package Exc2;

public class TestaVetorPolimorfico {
    public static void main(String[] args) {
        Desenvolvedor[] equipe = new Desenvolvedor[4];

        equipe[0] = new Junior("Lucas", "Java", 3500.0f, "Carlos");
        equipe[1] = new Pleno("Mariana", "Python", 7000.0f, 10);
        equipe[2] = new Senior("Roberto", "C#", 12000.0f, 5000.0f);
        equipe[3] = new Junior("Fernando", "JavaScript", 2500.0f, "Mariana");

        for (int i = 0; i < equipe.length; i++) {
            equipe[i].codar();
            System.out.println("Bonus: " + equipe[i].calcularBonus());
            System.out.println(equipe[i].toString());
            System.out.println();
        }
    }
}
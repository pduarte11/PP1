package ClasseAssociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args){
        Passageiro pas1 = new Passageiro("132", "junin");
        System.out.println(pas1.toString());

        LocalDateTime data = LocalDateTime.of(2026, 07, 14, 10, 15);
        Voo voo1 = new Voo(54, "guarulhos", "Rio", data);
        System.out.println(voo1.toString());

        Reserva res1 = new Reserva(154, LocalDateTime.now(), 12, pas1, voo1);
        System.out.println(res1.toString());
    }
}

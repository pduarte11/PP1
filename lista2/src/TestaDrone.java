public class TestaDrone {
    public static void main(String[] args) {
        Drone d1 = new Drone("dr-12", 0.0f, 15, false);
        d1.decolar();
        System.out.println(d1.toString());

        Drone d2 = new Drone("dr-41", 0.0f, 100, false);
        d2.decolar();
        System.out.println(d2.toString());

        d2.subir(50);
        System.out.println(d2.toString());

        d2.subir(100);
        System.out.println(d2.toString());

        d2.descer(20);
        System.out.println(d2.toString());
    }
}
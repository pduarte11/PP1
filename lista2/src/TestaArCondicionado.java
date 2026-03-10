public class TestaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado ar1 = new ArCondicionado();
        System.out.println(ar1.toString());

        ArCondicionado ar2 = new ArCondicionado("SAMSUNG", "air", 22, true);
        System.out.println(ar2.toString());

        ar2.setTemperatura(35);
        ar2.setTemperatura(12);

        ar2.setMarca("LG");

        ar2.ativarModoTurbo();
        System.out.println(ar2.toString());
    }
}
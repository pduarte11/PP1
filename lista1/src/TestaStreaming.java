public class TestaStreaming {
    public static void main(String[] args) {
        Streaming cliente1 = new Streaming("Alice", "Básico");
        System.out.println(cliente1.toString());

        Streaming cliente2 = new Streaming("Bruno", "Família");
        System.out.println(cliente2.toString());

        cliente2.assistirFilme("Oppenheimer");
        System.out.println(cliente2.toString());

        cliente2.cancelarAssinatura();
        System.out.println(cliente2.toString());

        cliente2.assistirFilme("Duna: Parte 2");
    }
}
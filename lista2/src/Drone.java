public class Drone {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone() {
        this.codigo = "Padrao";
        this.altura = 0.0f;
        this.bateria = 100;
        this.emVoo = false;
    }

    public Drone(String codigo, float altura, int bateria, boolean emVoo) {
        this.codigo = codigo;
        this.setAltura(altura);
        this.setBateria(bateria);
        this.emVoo = emVoo;
    }

    public void setAltura(float a) {
        if (a >= 0 && a <= 120) {
            this.altura = a;
        } else {
            System.out.println("Altura inválida.");
        }
    }

    public void setBateria(int b) {
        if (b >= 0 && b <= 100) {
            this.bateria = b;
        } else {
            System.out.println("Bateria inválida.");
        }
    }

    public void decolar() {
        if (this.bateria > 20) {
            if (this.testarMotores()) {
                this.emVoo = true;
                this.setAltura(2.0f);
                System.out.println("Decolando.");
            } else {
                System.out.println("Falha técnica.");
            }
        } else {
            System.out.println("Bateria insuficiente.");
        }
    }

    private boolean testarMotores() {
        System.out.println("Testando helices...");
        System.out.println("Calibrando GPS...");
        int randomico = (int) (Math.random() * 10);
        return randomico < 8;
    }

    public void subir(float x) {
        if (this.emVoo) {
            this.setAltura(this.altura + x);
        } else {
            System.out.println("O drone precisa estar em voo.");
        }
    }

    public void descer(float x) {
        if (this.emVoo) {
            this.setAltura(this.altura - x);
        } else {
            System.out.println("O drone precisa estar em voo.");
        }
    }

    public String toString() {
        String statusVoo = this.emVoo ? "Em Voo" : "No Chao";
        return "Drone " + this.codigo + " " +
                "| Bateria: " + this.bateria + "% " +
                "| Altura Atual: " + this.altura + "m " +
                "| Status: " + statusVoo;
    }
}
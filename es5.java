class Persona {
    String nome;
    int eta;

    void presentati() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni");
    }
}

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.nome = "Marco";
        persona1.eta = 30;

        Persona persona2 = new Persona();
        persona2.nome = "Luca";
        persona2.eta = 25;

        persona1.presentati();
        persona2.presentati();
    }
}
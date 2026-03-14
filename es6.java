class Persona {
    String nome;
    int eta;

    // Costruttore
    Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    void presentati() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni");
    }
}

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Marco", 30);
        Persona persona2 = new Persona("Luca", 25);

        persona1.presentati();
        persona2.presentati();
    }
}
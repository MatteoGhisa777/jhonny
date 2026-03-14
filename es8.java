class Persona {
    protected String nome;
    protected int eta;

    Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    void presentati() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni");
    }
}

class Studente extends Persona {
    String matricola;

    Studente(String nome, int eta, String matricola) {
        super(nome, eta);
        this.matricola = matricola;
    }

    @Override
    void presentati() {
        System.out.println("Ciao, sono " + nome + ", ho " + eta + " anni e la mia matricola è " + matricola);
    }
}

public class Main {
    public static void main(String[] args) {
        Studente s = new Studente("Luca", 21, "12345");
        s.presentati();
    }
}
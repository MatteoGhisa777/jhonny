interface Stampabile {
    void stampa();
}

class Persona implements Stampabile {
    protected String nome;
    protected int eta;

    Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    @Override
    public void stampa() {
        System.out.println("Persona: " + nome + ", età: " + eta);
    }
}

class Studente extends Persona {
    private String matricola;

    Studente(String nome, int eta, String matricola) {
        super(nome, eta);
        this.matricola = matricola;
    }

    @Override
    public void stampa() {
        System.out.println("Studente: " + nome + ", età: " + eta + ", matricola: " + matricola);
    }
}

public class Main {
    public static void main(String[] args) {

        Stampabile[] elementi = new Stampabile[2];

        elementi[0] = new Persona("Marco", 30);
        elementi[1] = new Studente("Luca", 21, "12345");

        for (Stampabile s : elementi) {
            s.stampa();
        }
    }
}
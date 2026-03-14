class Persona {
    private String nome;
    private int eta;

    // Costruttore
    Persona(String nome, int eta) {
        this.nome = nome;
        setEta(eta); // uso il setter per controllare l'età
    }

    // Getter nome
    public String getNome() {
        return nome;
    }

    // Setter nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter età
    public int getEta() {
        return eta;
    }

    // Setter età con controllo
    public void setEta(int eta) {
        if (eta >= 0) {
            this.eta = eta;
        } else {
            System.out.println("Errore: l'età non può essere negativa.");
        }
    }

    void presentati() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni");
    }
}

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona("Marco", 30);

        // Leggo i dati con i getter
        System.out.println("Nome: " + p.getNome());
        System.out.println("Età: " + p.getEta());

        // Modifico i dati con i setter
        p.setNome("Luca");
        p.setEta(25);

        p.presentati();

        // Provo a impostare un'età negativa
        p.setEta(-5);
    }
}
import java.util.ArrayList;

public class Main {

    // ===== Package model =====
    static class Persona {
        private String nome;
        private int eta;

        public Persona(String nome, int eta) {
            this.nome = nome;
            setEta(eta);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getEta() {
            return eta;
        }

        public void setEta(int eta) {
            if (eta >= 0) {
                this.eta = eta;
            }
        }
    }

    static class Studente extends Persona {
        private String matricola;

        public Studente(String nome, int eta, String matricola) {
            super(nome, eta);
            this.matricola = matricola;
        }

        public String getMatricola() {
            return matricola;
        }

        public void setMatricola(String matricola) {
            this.matricola = matricola;
        }
    }

    // ===== Package service =====
    static class RegistroStudenti {
        private ArrayList<Studente> studenti;

        public RegistroStudenti() {
            studenti = new ArrayList<>();
        }

        public void aggiungiStudente(Studente s) {
            studenti.add(s);
        }

        public void stampaStudenti() {
            for (Studente s : studenti) {
                System.out.println(
                    "Nome: " + s.getNome() +
                    ", Età: " + s.getEta() +
                    ", Matricola: " + s.getMatricola()
                );
            }
        }
    }

    // ===== Main =====
    public static void main(String[] args) {
        RegistroStudenti registro = new RegistroStudenti();

        Studente s1 = new Studente("Luca", 21, "1001");
        Studente s2 = new Studente("Marco", 22, "1002");
        Studente s3 = new Studente("Anna", 20, "1003");

        registro.aggiungiStudente(s1);
        registro.aggiungiStudente(s2);
        registro.aggiungiStudente(s3);

        registro.stampaStudenti();
    }
}
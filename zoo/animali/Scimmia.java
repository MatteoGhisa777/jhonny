package zoo.animali;

public class Scimmia extends Animale {

    public Scimmia(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void verso() {
        System.out.println(nome + " urla!");
    }

    @Override
    public void muovi() {
        System.out.println(nome + " si arrampica sugli alberi.");
    }
}
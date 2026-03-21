package zoo.animali;

public class Leone extends Animale {

    public Leone(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void verso() {
        System.out.println(nome + " ruggisce!");
    }

    @Override
    public void muovi() {
        System.out.println(nome + " corre nella savana.");
    }
}
package zoo.utils;

import zoo.animali.Animale;

public class ZooUtils {

    public static void stampaInfo(Animale a) {
        System.out.println("-----");
        System.out.println("Tipo: " + a.getClass().getSimpleName());
        System.out.println("Nome: " + a.getNome());
        System.out.println("Età: " + a.getEta());
    }
}
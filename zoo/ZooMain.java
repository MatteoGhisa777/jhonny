package zoo;

import java.util.ArrayList;
import zoo.animali.*;
import zoo.utils.ZooUtils;

public class ZooMain {

    public static void main(String[] args) {

        ArrayList<Animale> animali = new ArrayList<>();

        animali.add(new Leone("Simba", 5));
        animali.add(new Scimmia("George", 3));
        animali.add(new Leone("Mufasa", 8));

        for (Animale a : animali) {
            ZooUtils.stampaInfo(a);
            a.verso();
            a.muovi();
        }
    }
}
package nl.kabisa.battle.pippo;

import ro.pippo.core.Pippo;

public class Application {
    public static void main(String[] args) {
        Pippo pippo = new Pippo(new Routes());
        pippo.start();
    }
}
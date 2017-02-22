package nl.kabisa.battle.pippo;

import nl.kabisa.battle.pippo.controllers.BlogPostController;
import ro.pippo.controller.ControllerApplication;
import ro.pippo.core.Pippo;

public class Application extends ControllerApplication {

    @Override
    public void onInit() {
        addControllers(new BlogPostController());
    }

    public static void main(String[] args) {
        Pippo pippo = new Pippo(new Application());
        pippo.start();
    }
}
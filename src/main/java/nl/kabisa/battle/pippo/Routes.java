package nl.kabisa.battle.pippo;

public class Routes extends ro.pippo.core.Application {

    @Override
    protected void onInit() {
        GET("/", routeContext -> routeContext.send("Hello World"));
    }
}

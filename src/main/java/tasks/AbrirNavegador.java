package tasks;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.HomeRahulshettyacademy;
public class AbrirNavegador implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new HomeRahulshettyacademy()));
	}

	public static AbrirNavegador enrahulshettyacademy() {
		return instrumented(AbrirNavegador.class);  
	}
}

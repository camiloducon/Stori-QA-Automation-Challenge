package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import interactions.WebTableFixedSel;
import interactions.WebTableSel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class WebTableFixed implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WebTableFixedSel.intoWebTableFixed());
		
	}
	public static WebTableFixed intoWebTable() {
		return instrumented(WebTableFixed.class);
	}

}

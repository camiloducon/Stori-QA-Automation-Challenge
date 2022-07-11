package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import interactions.WebTableSel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class WebTable implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WebTableSel.intoWebTable());
		
	}
	public static WebTable intoWebTable() {
		return instrumented(WebTable.class);
	}

}

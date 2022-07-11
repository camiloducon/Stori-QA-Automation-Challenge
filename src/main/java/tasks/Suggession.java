package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import static userinterfaces.mapping.*;

import interactions.SelectListSuggession;

import static interactions.SelectListSuggession.*;


public class Suggession implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("Me").into(INPUT_Suggession));
		actor.attemptsTo(SelectListSuggession.inSuggession());
	}
	
	public static Suggession caseSuggession() {
		return instrumented(Suggession.class);
	}

}

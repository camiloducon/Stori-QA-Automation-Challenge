package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.mapping;

import static userinterfaces.mapping.*;

public class Dropdown implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(SelectFromOptions.byVisibleText("Option2").from(CMB_DROPDOWN));
		actor.attemptsTo(SelectFromOptions.byVisibleText("Option3").from(CMB_DROPDOWN));
		
	}
	
	public static Dropdown intoDropdown() {
		return instrumented(Dropdown.class);
	}

}

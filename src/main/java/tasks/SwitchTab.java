package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.mapping.*;

import interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SwitchTab implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BTN_OPEN_TAB));
		actor.attemptsTo(SwitchToNewWindow.switchToNewTab());
		
	}
	
	public static SwitchTab intoTab() {
		return instrumented(SwitchTab.class);
	}

}

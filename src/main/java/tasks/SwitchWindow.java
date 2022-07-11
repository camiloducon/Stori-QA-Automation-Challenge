package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import interactions.SwitchToNewWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static interactions.SwitchToNewWindow.*;
import static userinterfaces.mapping.*;

public class SwitchWindow implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BTN_OPEN_WINDOW));
		actor.attemptsTo(SwitchToNewWindow.switchToNewTab());
		
	}
	
	public static SwitchWindow intoSwitch() {
		return instrumented(SwitchWindow.class);
	}

}

package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.mapping.BTN_ALERT;
import static userinterfaces.mapping.INPUT_ALERT;

import interactions.alert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

public class SwitchAlert implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("Stori Card").into(INPUT_ALERT));
		actor.attemptsTo(Click.on(BTN_ALERT));
		actor.attemptsTo(Switch.toAlert());
		//actor.attemptsTo(alert.intoAlerts());
	}

	public static SwitchAlert intoAlert() {
		return instrumented(SwitchAlert.class);
	}

}

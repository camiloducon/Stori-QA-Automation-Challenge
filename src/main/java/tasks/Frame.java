package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.mapping.LBL_TEXT_FRAME;

import interactions.PrintText;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.conditions.Check;

public class Frame implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Switch.toFrame("iframe-name"));
		Check.whether(LBL_TEXT_FRAME.resolveFor(actor).isCurrentlyVisible());
		actor.attemptsTo(PrintText.InScreen());
	}
	public static Frame intoFrame() {
		return instrumented(Frame.class);
	}

}

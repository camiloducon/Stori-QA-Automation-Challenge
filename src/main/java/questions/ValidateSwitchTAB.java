package questions;

import static userinterfaces.mapping.*;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;

public class ValidateSwitchTAB implements Question<Boolean>{

	
	@Override
	public Boolean answeredBy(Actor actor) {
		actor.attemptsTo(Scroll.to(BTN_VIEW_ALL_COURSES).andAlignToTop());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       boolean  mensajeDeFiltro =  BTN_VIEW_ALL_COURSES.resolveFor(actor).isVisible();
        return  mensajeDeFiltro;
        
	}

	
	public static ValidateSwitchTAB intoSwitchTab() {
		return new ValidateSwitchTAB();
	}

}

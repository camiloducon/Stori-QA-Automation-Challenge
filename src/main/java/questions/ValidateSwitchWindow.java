package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static userinterfaces.mapping.*;

import java.util.List;

public class ValidateSwitchWindow implements Question<Boolean>{

	
	@Override
	public Boolean answeredBy(Actor actor) {
        String mensajeDeFiltro =  LBL_WINDOW.resolveFor(actor).getText();
        System.out.println(mensajeDeFiltro);
        return mensajeDeFiltro.equals("30 DAY MONEY BACK GUARANTEE");
	}

	
	public static ValidateSwitchWindow intoSwitchWindow() {
		return new ValidateSwitchWindow();
	}

}

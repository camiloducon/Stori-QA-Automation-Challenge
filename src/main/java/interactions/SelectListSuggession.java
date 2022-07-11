package interactions;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static userinterfaces.mapping.*;

public class SelectListSuggession implements Interaction{

	List<WebElementFacade> suggession;
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		list(actor);
		
	}
	
	public void list(Actor actor) {
		suggession = LIST_Suggession.resolveAllFor(actor);
		for (int i = 0; i < suggession.size(); i++) {
			if (suggession.get(i).getText().equals("Mexico")) {
				suggession.get(i).click();
			}
		}
	} 
	
	
	
	public static SelectListSuggession inSuggession() {
		return new SelectListSuggession();
	}

}

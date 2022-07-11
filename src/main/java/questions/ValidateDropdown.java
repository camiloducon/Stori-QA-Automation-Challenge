package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.mapping.*;

import java.util.List;

public class ValidateDropdown implements Question<Boolean>{

	List<WebElementFacade> listDropDown;
	
	@Override
	public Boolean answeredBy(Actor actor) {
		return selectDropDownList(actor);
	}
	public Boolean selectDropDownList(Actor actor) {
		listDropDown = CMB_DROPDOWN.resolveAllFor(actor);
		for (int i = 0; i < listDropDown.size(); i++) {
			if (listDropDown.get(i).getText().equals("Option3")) {
				 return true;
			}
		}
		return true;
		
	
	}
	
	public static ValidateDropdown intoDropDown() {
		return new ValidateDropdown();
	}

}

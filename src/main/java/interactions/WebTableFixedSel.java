package interactions;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static userinterfaces.mapping.*;

public class WebTableFixedSel implements Interaction{

	List<WebElementFacade> name;
	List<WebElementFacade> position;
	@Override
	public <T extends Actor> void performAs(T actor) {
		namePosition(actor);
		
	}
	
	public void namePosition(Actor actor) {
		name = LIST_NAME.resolveAllFor(actor);
		position = LIST_POSITION.resolveAllFor(actor);
		for (int i = 0; i < position.size(); i++) {
			if (position.get(i).getText().equals("Engineer")) {
				System.out.println(name.get(i).getText() + "  "+ position.get(i).getText());
			}
		}
	}
	
	public static WebTableFixedSel intoWebTableFixed() {
		return new WebTableFixedSel();
	}

}

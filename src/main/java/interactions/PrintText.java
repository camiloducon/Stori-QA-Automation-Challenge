package interactions;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static userinterfaces.mapping.*;

public class PrintText implements Interaction{

	WebElementFacade suggession;
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		suggession = LBL_TEXT_FRAME.resolveFor(actor);
		
		System.out.println(suggession.getText());
	}
	

	
	
	
	public static PrintText InScreen() {
		return new PrintText();
	}

}

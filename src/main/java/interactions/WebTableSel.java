package interactions;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static userinterfaces.mapping.*;

public class WebTableSel implements Interaction{

	List<WebElementFacade> price;
	List<WebElementFacade> course;
	@Override
	public <T extends Actor> void performAs(T actor) {
		priceCourse(actor);
		
	}
	
	public void priceCourse(Actor actor) {
		price = LIST_PRICE.resolveAllFor(actor);
		course = LIST_COURSE.resolveAllFor(actor);
		int total = 0;
		for (int i = 0; i < price.size(); i++) {
			if (price.get(i).getText().equals("25")) {
				System.out.println(course.get(i).getText() + "  "+ price.get(i).getText());
				total++;
				System.out.println(total);
			}
		}
	}
	
	public static WebTableSel intoWebTable() {
		return new WebTableSel();
	}

}

package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class mapping extends PageObject{
	
	public static final Target INPUT_Suggession = Target.the("Input Suggession")
			.locatedBy("//input[@class='inputs ui-autocomplete-input']");

	public static final Target LIST_Suggession = Target.the("List Suggession")
			.locatedBy("//ul[@id='ui-id-1']/li");
	
	public static final Target CMB_DROPDOWN = Target.the("CMB DROPDOWN")
			.locatedBy("//select[@id='dropdown-class-example']");
	
	public static final Target BTN_OPEN_WINDOW = Target.the("BTN OPEN WINDOW")
			.located(By.id("openwindow"));
	
	public static final Target LBL_WINDOW = Target.the("LBL WINDOW")
			.locatedBy("//div[@class='col-xs-12 col-sm-12']//div[@class='col-sm-9']/h3");
	
	public static final Target BTN_OPEN_TAB = Target.the("BTN OPEN TAB")
			.located(By.id("opentab"));
	
	public static final Target BTN_VIEW_ALL_COURSES = Target.the("BTN VIEW ALL COURSES")
			.locatedBy("//a[contains(text(),'VIEW ALL COURSES')]");
	
	public static final Target INPUT_ALERT = Target.the("Input Alert")
			.locatedBy("//input[@id='name']");
	
	public static final Target BTN_ALERT = Target.the("Btn Alert")
			.locatedBy("//input[@id='alertbtn']");
	
	public static final Target BTN_CONFIRM = Target.the("Btn Confirm")
			.locatedBy("//input[@id='confirmbtn']");
	
	public static final Target LIST_COURSE = Target.the("List Course")
			.locatedBy("//div[@class='left-align']//table[@id='product']//tr/td[2]");
	
	public static final Target LIST_PRICE = Target.the("List Price")
			.locatedBy("//div[@class='left-align']//table[@id='product']//tr/td[3]");
	
	public static final Target LIST_NAME = Target.the("List Name")
			.locatedBy("//div[@class='tableFixHead']//table//tr/td[1]");
	
	public static final Target LIST_POSITION = Target.the("List Position")
			.locatedBy("//div[@class='tableFixHead']//table//tr/td[2]");

	public static final Target LBL_TEXT_FRAME = Target.the("LBL FRAME")
			.locatedBy("//div[@class='price-title']//div[2]//li[2]");
	
	
}

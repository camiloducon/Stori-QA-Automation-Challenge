package stepsdefinition;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static utils.Constantes.CAMILO;

import org.openqa.selenium.WebDriver;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import questions.ValidateDropdown;
import questions.ValidateSwitchTAB;
import questions.ValidateSwitchWindow;
import tasks.AbrirNavegador;
import tasks.Dropdown;
import tasks.Frame;
import tasks.Suggession;
import tasks.SwitchAlert;
import tasks.SwitchTab;
import tasks.SwitchWindow;
import tasks.WebTable;
import tasks.WebTableFixed;

public class Cases {
	@Managed
	private WebDriver hisBrowser;


	@Before
	public void setUp() {
		CAMILO.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^camilo want to navigate into rahulshettyacademy$")
	public void camilo_want_to_navigate_into_rahulshettyacademy() {
		CAMILO.wasAbleTo(AbrirNavegador.enrahulshettyacademy());
	}
	
	@When("^enter the word Me and can select mexico$")
	public void enter_the_word_Me_and_can_select_mexico() {
		CAMILO.wasAbleTo(Suggession.caseSuggession());
	}
	
	@When("^select option (\\d+) and then option (\\d+)$")
	public void select_option_and_then_option(int arg1, int arg2) {
		CAMILO.wasAbleTo(Dropdown.intoDropdown());
	}

	@Then("^The user should be able to see the change$")
	public void the_user_should_be_able_to_see_the_change() {
		CAMILO.should(seeThat(ValidateDropdown.intoDropDown()));
	}
	
	@When("^In the Switch Window click the Open Window button$")
	public void in_the_Switch_Window_click_the_Open_Window_button() {
		CAMILO.wasAbleTo(SwitchWindow.intoSwitch());
	}

	@Then("^is not shown, fail the test$")
	public void is_not_shown_fail_the_test() {
		CAMILO.should(seeThat(ValidateSwitchWindow.intoSwitchWindow()));
	}
	
	@When("^In the Switch Tab click the Open Tab button$")
	public void in_the_Switch_Tab_click_the_Open_Tab_button() {
		CAMILO.wasAbleTo(SwitchTab.intoTab());
	}

	@Then("^view boton view all courses$")
	public void view_boton_view_all_courses() {
		CAMILO.should(seeThat(ValidateSwitchTAB.intoSwitchTab()));
	}

	@Then("^Return to the first window$")
	public void return_to_the_first_window() {

	}
	
	@When("^In the Switch To Alert type this string Stori Card and click the Alert button$")
	public void in_the_Switch_To_Alert_type_this_string_Stori_Card_and_click_the_Alert_button() {
		CAMILO.wasAbleTo(SwitchAlert.intoAlert());
	}

	@Then("^Print the text in the alert and click on OK$")
	public void print_the_text_in_the_alert_and_click_on_OK() {

	}

	@Then("^type the same string and click on the Confirm button and print the text$")
	public void type_the_same_string_and_click_on_the_Confirm_button_and_print_the_text() {

	}

	@Then("^click on ok$")
	public void click_on_ok() {

	}
	
	@When("^In the Web Table  print the number of courses that are \\$(\\d+)$")
	public void in_the_Web_Table_print_the_number_of_courses_that_are_$(int arg1) {
		CAMILO.wasAbleTo(WebTable.intoWebTable());
	}

	@Then("^print their course names$")
	public void print_their_course_names() {

	}
	
	@When("^Print the names of all the Engineers in the Web Table$")
	public void print_the_names_of_all_the_Engineers_in_the_Web_Table() {
		CAMILO.wasAbleTo(WebTableFixed.intoWebTable());
	}

	@When("^in the iFrame example get the text highlighted in blue and print it$")
	public void in_the_iFrame_example_get_the_text_highlighted_in_blue_and_print_it() {
		CAMILO.wasAbleTo(Frame.intoFrame());
	}


}

package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features=
	"C:\\Users\\91630\\eclipse-workspace\\ATE-Phase2-Cucumber-Extentreports-Jenkins\\src\\test\\java\\feature\\redifRegister.feature",
		glue = {"steps"},  // packagename where the steps are
		plugin= {"pretty","html:target/cucumberreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
		}	
		
		)

public class TestRunner {

}

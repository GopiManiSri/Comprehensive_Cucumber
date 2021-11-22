package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Selenium\\Com_cucumber\\Com_Assessment\\src\\main\\java\\Features\\TestCase.feature",
		glue="StepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests{

}

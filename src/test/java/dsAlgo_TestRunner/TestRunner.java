package dsAlgo_TestRunner;

	import org.testng.annotations.DataProvider;

	import io.cucumber.junit.CucumberOptions;
	import io.cucumber.testng.AbstractTestNGCucumberTests;

	@io.cucumber.testng.CucumberOptions(
	plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","html:target/cucumber.html" ,"json:target/cucumber.json"}, //reporting purpose
	monochrome=false,  //console output color
	 
	features = {"src/test/resources/Features"},
	tags = " "			,	
	glue={"dsAlgo_StepDefinition","hooks"})//location of  step definition files
	public class TestRunner  extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }
		
		}	
	
	
	
	
	
	
	
	
	


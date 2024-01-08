package POMPF;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue= {"POMPF"},
plugin= {
		"pretty","html:target/HTMLReports",
		"json:target/JSONReports/JSONReports.json",
		"junit:target/JUNITReports/JUNITReport.junit"
})


public class POMPFRunner {

}

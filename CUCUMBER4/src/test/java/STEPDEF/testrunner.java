package STEPDEF;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FEATURE",glue= {"TAGDEMO"},plugin= {"html:target/cucumber.html"},tags=("@Sanitytest"))

public class testrunner {
	

}

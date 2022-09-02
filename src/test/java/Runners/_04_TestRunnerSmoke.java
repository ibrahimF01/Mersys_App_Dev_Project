package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", // hangi senaryolarda bu etiket varsa onlar çalıştırılacak
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}
        //,plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}  // master report için sonradan ekleniyor
)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {

}

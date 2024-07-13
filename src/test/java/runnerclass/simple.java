package runnerclass;






import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith( Cucumber.class)
    @CucumberOptions(features="src/test/resources/Features",
            glue="com.lao.step_definitions",
            dryRun = false,
            monochrome = true,
    plugin = {"rerun:target/failed_scenarios.txt","pretty","junit:target/cucumber-reports/Cucumber.xml","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
            //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
            //pretty plugin used for printing report to console,
            // usage plugin printing time with report in console
            // "html:target/cucumber-reports/report.html"->for generating html
            //"json:target/cucumber-reports/Cucumber.json"-> for generating json
            //"junit:target/cucumber-reports/Cucumber.xml"-> FOR generating junit
            //rerun will save all failed scenarios and save in given folder
//            publish = true,
    tags = "@logout")
    public class simple{


    }

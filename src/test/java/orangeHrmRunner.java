import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"com/OrangeHRM/steps"},
        tags = "@Smoke",
        plugin = {"pretty:target/cucumber-htmlReport.html", "json:target/cucumber-report.json"})

public class orangeHrmRunner {

}

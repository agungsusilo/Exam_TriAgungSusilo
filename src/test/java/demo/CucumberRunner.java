package demo;

//file ini yang mengontrol feature mana yang akan dilakukan pengetesan

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"html:build/result"},
        stepNotifications = true,
        tags = {"@Web"}
)
public class CucumberRunner {

}
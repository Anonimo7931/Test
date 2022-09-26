package co.com.choucair.certification.camilogomez.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/academyChoucair.feature",
        tags = "@tag1",
        glue = "co.com.choucair.certification.camilogomez.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RunnerTags {
}

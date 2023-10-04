package starter.utils;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.webdriver.enhancers.AfterAWebdriverScenario;


import net.thucydides.model.domain.ExternalLink;
import net.thucydides.model.domain.TestOutcome;
import net.thucydides.model.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

public class AddExternalLink implements AfterAWebdriverScenario {

    private static final String URL = "https://www.google.com";

    @Override
    public void apply(EnvironmentVariables environmentVariables, TestOutcome testOutcome, WebDriver driver) {
        String sessionId = Serenity.getCurrentSessionID();
        testOutcome.setLink(
                new ExternalLink(
                        String.format("%s/%s", URL, sessionId), "A url"
                )
        );
    }
}

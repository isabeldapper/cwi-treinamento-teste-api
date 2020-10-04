package br.com.restassuredapitesting.tests.base.tests;

import br.com.restassuredapitesting.suites.HealthCheck;
import br.com.restassuredapitesting.tests.base.requests.PingRequest;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.lessThan;

@Feature("API up and running")
public class PingTest extends BaseTest {

    PingRequest pingRequest = new PingRequest();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Category(HealthCheck.class)
    @DisplayName("API up and running")
    public void apiRunning() throws Exception {
        pingRequest.isRunning().then()
                .statusCode(201)
                .time(lessThan(3L), TimeUnit.SECONDS);

    }

}

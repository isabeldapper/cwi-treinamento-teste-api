package br.com.restassuredapitesting.tests.booking.tests.delete;

import br.com.restassuredapitesting.suites.Acceptance;
import br.com.restassuredapitesting.tests.base.tests.BaseTest;
import br.com.restassuredapitesting.tests.booking.requests.delete.DltByIdAndBasicAuthRequest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class DltByIdAndBasicAuthTest extends BaseTest {
    DltByIdAndBasicAuthRequest dltByIdAndBasicAuthRequest = new DltByIdAndBasicAuthRequest();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Category(Acceptance.class)
    @DisplayName("Testa o delete por id e basic auth")
    public void testDltByIdAndBasicAuthRequest() throws Exception {
        dltByIdAndBasicAuthRequest.dltByIdAndBasicAuthRequest(71).then()
            .statusCode(201)
            .time(lessThan(5L), TimeUnit.SECONDS);
    }
}

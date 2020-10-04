package br.com.restassuredapitesting.tests.booking.tests.get;

import br.com.restassuredapitesting.suites.Acceptance;
import br.com.restassuredapitesting.suites.Contract;
import br.com.restassuredapitesting.tests.base.tests.BaseTest;
import br.com.restassuredapitesting.tests.booking.requests.get.GetBookingByIdRequest;
import br.com.restassuredapitesting.utils.Utils;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class GetBookingByIdTest extends BaseTest {
    GetBookingByIdRequest getBookingByIdRequest = new GetBookingByIdRequest();

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Category(Acceptance.class)
    @DisplayName("Mostrar ")
    public void getBookingById() throws Exception {
        getBookingByIdRequest.bookingById(31).then()
                .statusCode(200)
                .time(lessThan(5L), TimeUnit.SECONDS)
                .body("size()", greaterThan(0));

    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Category(Contract.class)
    @DisplayName("valid contract booking by Id return")
    public void validContractBookingById() throws Exception {
        getBookingByIdRequest.bookingById(31).then()
            .statusCode(200)
            .assertThat()
            .body(matchesJsonSchema(
                    new File(
                            Utils.getContractsBasePath("booking", "booking")
                    )
                    )
            );

    }
}

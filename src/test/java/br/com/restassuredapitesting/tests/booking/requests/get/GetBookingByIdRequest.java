package br.com.restassuredapitesting.tests.booking.requests.get;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetBookingByIdRequest {

    @Step("Search one booking")
    public Response bookingById(int id){
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .when()
                .get("booking/" + id);
    }
}

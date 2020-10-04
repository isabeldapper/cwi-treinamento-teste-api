package br.com.restassuredapitesting.tests.base.requests;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PingRequest {

    @Step("Ping Request")
    public Response isRunning() {
        return given()
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .when()
                .get("ping");
    }
}

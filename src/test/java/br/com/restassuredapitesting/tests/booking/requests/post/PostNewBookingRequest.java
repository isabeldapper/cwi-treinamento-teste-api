package br.com.restassuredapitesting.tests.booking.requests.post;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;

public class PostNewBookingRequest {

    PostNewBookingRequest postNewBookingRequest = new PostNewBookingRequest();

    @Step("Criar nova reserva")
    public Response newBookingRequest(int id, JSONObject payload) {
        return given()
            .header("Content-Type", "application/json")
            .when()
            .body(payload.toString())
            .post("booking/");
    }
}

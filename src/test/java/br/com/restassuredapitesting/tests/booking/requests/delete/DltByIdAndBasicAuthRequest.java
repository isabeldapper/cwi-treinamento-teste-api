package br.com.restassuredapitesting.tests.booking.requests.delete;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DltByIdAndBasicAuthRequest {

    @Step("Deleta reserva pelo id, usando o header Authorization")
    public Response dltByIdAndBasicAuthRequest(int id){
        return given()
            .header("Content-Type", "application/json")
            .header("Accept", "application/json")
            .header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
            .when()
            .delete("booking/" + id);
    }
}

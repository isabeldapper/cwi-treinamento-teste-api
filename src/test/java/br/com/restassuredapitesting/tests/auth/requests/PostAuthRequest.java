package br.com.restassuredapitesting.tests.auth.requests;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;

public class PostAuthRequest {

    @Step("Buscar Token")
    public Response token(){
        JSONObject payload = new JSONObject();
        payload.put("username", "admin");
        payload.put("password", "password123");


        return given()
                .header("Content-Type", "application/json")
                .when()
                .body(payload.toString())
                .post("auth");
    }

    @Step("Pegar token")
    public String getToken(){
        return "token="+this.token().then().statusCode(200).extract().path("token");
    }
}

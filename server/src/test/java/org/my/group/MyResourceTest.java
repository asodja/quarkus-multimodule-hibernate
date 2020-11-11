package org.my.group;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class MyResourceTest {

    @Test
    public void testInvalidBody() {
        Response response = given()
                .body("{\"value\":\"\"}")
                .contentType(ContentType.JSON)
                .when().post("/hello");

        System.out.println(response.asString());
        assertEquals(400, response.getStatusCode());
    }

    @Test
    public void testValidBody() {
        Response response = given()
                .body("{\"value\":\"not-blank\"}")
                .contentType(ContentType.JSON)
                .when().post("/hello");

        System.out.println(response.asString());
        assertEquals(200, response.getStatusCode());
    }

}
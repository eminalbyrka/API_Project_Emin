package com.cybertek.Day2;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpartanNegativeGetTest {//bu test sıkıntılı./api/spartans/10 ile çalışnmıyor.
    //muhtemelen tek search.te xml kabul etmediği için olmuyor.

    @BeforeAll
    public static void init() {
        //save baseurl inside this variable so that we don't need to type each http method.
        baseURI = "http://54.90.15.74:8000";
    }

    /*TASK
   Given Accept type application/xml
   When user send GET request to /api/spartans/10 end point
   Then status code must be 406
   And response Content Type must be application/xml;charset=UTF-8
   */
    @DisplayName("GET request to /api/spartans/10")
    @Test
    public void test1(){
        Response response = given()
                .accept(ContentType.XML)
                .when()
                .get("/api/spartans/10");

        //verify status code is 406
        assertEquals(406,response.statusCode());
        //verify content type
        assertEquals("application/xml;charset=UTF-8",response.contentType());
    }

}

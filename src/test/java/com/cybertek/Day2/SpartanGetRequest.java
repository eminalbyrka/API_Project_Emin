package com.cybertek.Day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpartanGetRequest {

    String baseUrl="http://54.90.15.74:8000";  //+ /api/spartans";
//    Given Accept type application/json
//    When user send GET request to api/spartans end point
//    Then status code must 200
//    And response Content Type must be application/json
//    And response body should include spartan result
    
    @Test
    public void test1(){
        Response response = RestAssured.given().accept(ContentType.JSON)
                .when()
                        .get(baseUrl+"/api/spartans");//yukarda base url.den sonra / bunu koyma


        System.out.println("response.statusCode() = " + response.statusCode());

        System.out.println("response.contentType() = " + response.contentType());

        System.out.println("response.prettyPrint() = " + response.prettyPrint());

        Assertions.assertEquals(response.statusCode(),200);

        Assertions.assertEquals(response.contentType(),"application/json");
    }


}

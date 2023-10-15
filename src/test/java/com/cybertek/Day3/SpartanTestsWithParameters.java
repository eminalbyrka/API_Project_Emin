package com.cybertek.Day3;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class SpartanTestsWithParameters {

    @BeforeAll
    public static void init(){

        baseURI="http://3.208.2.75:8000";

    }
/* Given accept type is Json
And Id paramater value is 5
When user sends GET request to /api/spartans/{id}
Then response status cade should be 200
and response content type : application/json
And "Blythe" should be in response payload


 */
@DisplayName("GET request to /api/spartans/{id}")
    @Test
    public void test1(){

    Map<String,Object> queryMap = new HashMap<>();
    queryMap.put("nameContains","e");
    queryMap.put("gender","Female");
    System.out.println("queryMap = " + queryMap);
//    Response response=given().accept(ContentType.JSON).and().pathParam("id",5)
//            .when().get("/api/spartans/{id}");
//    //verify statuscode
//    assertEquals("application/json", response.contentType());
//    //verify Blythe in the json payload/body
//
//    assertTrue(response.body().asString().contains("Blythe"));
}

/*
Given accept type is json
And id parameter value is 500
When user sends GET request to /api/spartans/{id}
Then response status code should be 404
and response content type : application/json
and "Not found " message should be in response payload.

 */
//    public void test666() {
//        Response response = given().accept(ContentType.JSON).and().pathParam("id", 500)
//                .get("/api/spartans/{id}");
//
//        assertEquals("application/json", response.contentType());
//        assertEquals( 404,response.statusCode());
//        assertTrue(response.body().asString().contains("Not found"));
//
//
//    }
//
//    public void test2(){
//
//        Response response= given().accept(ContentType.JSON).log().all()
//                .pathParam("id",500).when().get("/api/spartans/{id}");
//        //verify status code 404
//
//        assertEquals(404,response.statusCode());
//        //verify content type
//        assertEquals("application/json",response.contentType());
//
//
//    }

}

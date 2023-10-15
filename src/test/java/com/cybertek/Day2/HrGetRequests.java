package com.cybertek.Day2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HrGetRequests {

    @BeforeAll
    public static void init(){

       RestAssured.baseURI= "http://54.90.15.74:1000/ords/hr";


    }
    @DisplayName("Get request to /regions")
    @Test
    public void test1(){

        Response response=RestAssured.get("/regions");

        System.out.println(response.statusCode());


}

}

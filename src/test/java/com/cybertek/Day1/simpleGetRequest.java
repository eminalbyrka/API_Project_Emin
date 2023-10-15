package com.cybertek.Day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class simpleGetRequest {


    String url="http://54.90.15.74:8000/api/spartans";

    @Test//junitten geliyor
    public void test1(){

        //send a get request and save response inside the Response object
        Response response = RestAssured.get(url);

        //print response status code
        System.out.println(response.statusCode());

        //print response body
        response.prettyPrint();


    }



}

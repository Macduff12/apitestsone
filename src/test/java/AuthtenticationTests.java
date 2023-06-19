import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class AuthtenticationTests {
    @BeforeClass
    public static void setup(){
        RestAssured.proxy("localhost", 8888);
    }
    @Test
    public void basicPreemptiveAuthTest(){
        given().
                auth().preemptive().basic("username", "password").when().
                get("http://localhost:8080/someEndpoint");
    }
    @Test
    public void basicChallengedAuthTest(){
        given().auth().basic("username", "password").
                when().
                    get("http://localhost:8080/someEndpoint");
    }
    @Test
    public void oauth1Test(){
        given().auth().oauth("consumerKey", "consumerSecret", "consumerAccessToken", "secretToken").
        when().get("http://localhost:8080/someEndpoint");
    }
    @Test
    public void relaxHTTPSTest(){
        given().
                relaxedHTTPSValidation().
        when().
                get("http://localhost:8080/someEndpoint");
    }
    @Test
    public void keystoeTest(){
        given().
                keyStore("/pathToJKS", "password").
        when().
                get("http://localhost:8080/someEndpoint");
    }
}

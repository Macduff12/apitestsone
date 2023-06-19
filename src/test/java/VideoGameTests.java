import config.VideoGameConfig;
import config.VideoGameEndpoints;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.module.jsv.JsonSchemaValidator;
import objects.VideoGame;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class VideoGameTests extends VideoGameConfig {
    String gameBodyJson = "{\n" +
            "  \"category\": \"Platform\",\n" +
            "  \"name\": \"Mario\",\n" +
            "  \"rating\": \"Mature\",\n" +
            "  \"releaseDate\": \"2012-05-04\",\n" +
            "  \"reviewScore\": 80\n" +
            "}";
    @Test
    public void  getAllGame(){
        given()
                .when()
                    .get(VideoGameEndpoints.ALL_VIDEO_GAMES)
                .then();
    }
    @Test
    public void createNewGameByJSON(){

        given()
                .body(gameBodyJson)
                .when()
                        .post(VideoGameEndpoints.ALL_VIDEO_GAMES)
                .then();
    }
    @Test
    public void createNewGameByXml(){
        String gameBodyXml = "<VideoGameRequest>\n" +
                "\t<category>Platform</category>\n" +
                "\t<name>Mario</name>\n" +
                "\t<rating>Mature</rating>\n" +
                "\t<releaseDate>2012-05-04</releaseDate>\n" +
                "\t<reviewScore>85</reviewScore>\n" +
                "</VideoGameRequest>";
        given()
                .body(gameBodyXml)
                .contentType("application/xml")
                .accept("application/xml")
                .when()
                .post(VideoGameEndpoints.ALL_VIDEO_GAMES)
                .then();
    }
    @Test
    public void updateGame(){
        given()
                .body(gameBodyJson)
                .when()
                .put("videogame/3")
                .then();

    }
    @Test
    public void deleteGame(){
        given()
                .accept("text/plain")
                .when()
                .delete("videogame/8")
                .then();
    }
    @Test
    public void getSingleGame(){
        given()
                .pathParam("videoGameId", 6)
                .when()
                .get(VideoGameEndpoints.SINGLE_VIDEO_GAME)
                .then();
    }
    @Test
    public void testVideoGameSchemaXML(){
        given()
                .pathParam("videoGameId",5)
                .accept("application/xml")
                .when()
                .get(VideoGameEndpoints.SINGLE_VIDEO_GAME)
                .then()
                .body(RestAssuredMatchers.matchesXsdInClasspath("VideoGameXSD.xsd"));
    }
    @Test
    public void testVideoGameSchemaJson(){
        given()
                .pathParam("videoGameId", 5)
                .accept("application/json")
                .when()
                .get(VideoGameEndpoints.SINGLE_VIDEO_GAME)
                .then()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("VideoGameJsonSchema.json"));
    }

//    @Test
//    public void captureResponseTime(){
//        long responseTime = get(VideoGameEndpoints.ALL_VIDEO_GAMES).time();
//        System.out.println("Response time in MS: " + responseTime);
//    }
//    @Test
//    public void assertOnResponseTime(){
//        get(VideoGameEndpoints.ALL_VIDEO_GAMES)
//                .then().time(lessThan(1000L));
//    }
}

package api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.IsEqual.equalTo;

public class RequestTest {
    private final static String URL = "https://postman-echo.com/";

    @Test
    public void checkGetRequest() {
        given()
                .when()
                .get(URL + "get")
                .then().log().all()
                .assertThat()
                .statusCode(200);
        ;
    }

    @Test
    public void checkGetRequestWoops() {
        given().queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when().get(URL + "get")
                .then().log().all()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void checkPostRawText() {
        String requestBody = "    test" + ":" + " value";
        given()
                .body(requestBody)
                .when().post(URL + "post")
                .then().log().all()
                .body("data", containsString(requestBody))
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void checkPostFormData() {

        given()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when().post(URL + "post")
                .then().log().all()
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }

    @Test
    public void checkPutRawText() {
        String requestBodyText = "This is expected to be sent back as part of response body.";
        given()
                .body(requestBodyText)
                .when().put(URL + "put")
                .then().log().all()
                .body("data", containsString(requestBodyText))
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void checkPatchRawText() {
        String requestBodyText = "This is expected to be sent back as part of response body.";
        given()
                .body(requestBodyText)
                .when().patch(URL + "patch")
                .then().log().all()
                .body("data", containsString(requestBodyText))
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void checkDeleteRawText() {
        String requestBodyText = "This is expected to be sent back as part of response body.";
        given()
                .body(requestBodyText)
                .when().delete(URL + "delete")
                .then().log().all()
                .body("data", containsString(requestBodyText))
                .assertThat()
                .statusCode(200);
    }


}

package api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.IsEqual.equalTo;

public class RequestTest {
    private final static String URL = "https://postman-echo.com/";

    @Test
    public void checkGetRequest() {
        given()
                .when()
                .get(URL + "get")
                .then().log().all()
                .body("headers.connection", equalTo("close"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("url", equalTo("http://postman-echo.com/get"))
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void checkGetRequestWoops() {
        given().queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when().get(URL + "get")
                .then().log().all()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-forwarded-proto", equalTo("http"))
                .body("headers.connection", equalTo("close"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("url", equalTo("http://postman-echo.com/get?foo1=bar1&foo2=bar2"))
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
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-forwarded-proto", equalTo("http"))
                .body("headers.connection", equalTo("close"))
                .body("headers.content-length", equalTo("15"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("url", equalTo("http://postman-echo.com/post"))
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
                .body("form.foo2", equalTo("bar2"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-forwarded-proto", equalTo("http"))
                .body("headers.connection", equalTo("close"))
                .body("headers.content-length", equalTo("19"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.content-type", equalTo("application/x-www-form-urlencoded; charset=utf-8"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("url", equalTo("http://postman-echo.com/post"));
    }

    @Test
    public void checkPutRawText() {
        String requestBodyText = "This is expected to be sent back as part of response body.";
        given()
                .body(requestBodyText)
                .when().put(URL + "put")
                .then().log().all()
                .body("data", containsString(requestBodyText))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-forwarded-proto", equalTo("http"))
                .body("headers.connection", equalTo("close"))
                .body("headers.content-length", equalTo("58"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("url", equalTo("http://postman-echo.com/put"))
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
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-forwarded-proto", equalTo("http"))
                .body("headers.connection", equalTo("close"))
                .body("headers.content-length", equalTo("58"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("url", equalTo("http://postman-echo.com/patch"))
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
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-forwarded-proto", equalTo("http"))
                .body("headers.connection", equalTo("close"))
                .body("headers.content-length", equalTo("58"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.content-type", equalTo("text/plain; charset=ISO-8859-1"))
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .body("url", equalTo("http://postman-echo.com/delete"))
                .assertThat()
                .statusCode(200);
    }
}

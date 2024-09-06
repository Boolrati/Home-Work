package api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.IsEqual.equalTo;

public class RequestTest {
    @BeforeAll
    public static void setupRequestSpecification() {
        requestSpecification = RestAssured.given()
                .baseUri("https://postman-echo.com/");
        responseSpecification = RestAssured.expect();
        responseSpecification.body("headers.host", equalTo("postman-echo.com"));
        responseSpecification.body("headers.x-forwarded-proto", equalTo("https"));
        responseSpecification.body("headers.connection", equalTo("close"));
        responseSpecification.body("headers.x-forwarded-port", equalTo("443"));
        responseSpecification.body("headers.accept", equalTo("*/*"));
        responseSpecification.body("headers.accept-encoding", equalTo("gzip,deflate"));
        responseSpecification.statusLine("HTTP/1.1 200 OK");
    }

    @Test
    public void checkGetRequest() {
        RestAssured
                .given()
                .spec(requestSpecification)
                .when()
                .get("get")
                .then().log().all()
                .spec(responseSpecification)
                .body("url", equalTo("https://postman-echo.com/get"));
    }

    @Test
    public void checkGetRequestWoops() {
        RestAssured
                .given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .spec(requestSpecification)
                .when().get("get")
                .then().log().all()
                .spec(responseSpecification)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }

    @Test
    public void checkPostRawText() {
        String requestBody = "    test" + ":" + " value";
        RestAssured
                .given()
                .spec(requestSpecification)
                .body(requestBody)
                .when().post("post")
                .then().log().all()
                .spec(responseSpecification)
                .body("data", containsString(requestBody))
                .body("headers.content-length", equalTo("15"))
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void checkPostFormData() {
        RestAssured
                .given()
                .spec(requestSpecification)
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when().post("post")
                .then().log().all()
                .spec(responseSpecification)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))
                .body("headers.content-length", equalTo("19"))
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void checkPutRawText() {
        String requestBodyText = "This is expected to be sent back as part of response body.";
        RestAssured
                .given()
                .spec(requestSpecification)
                .body(requestBodyText)
                .when().put("put")
                .then().log().all()
                .spec(responseSpecification)
                .body("data", containsString(requestBodyText))
                .body("headers.content-length", equalTo("58"))
                .body("url", equalTo("https://postman-echo.com/put"));
    }

    @Test
    public void checkPatchRawText() {
        String requestBodyText = "This is expected to be sent back as part of response body.";
        RestAssured
                .given()
                .spec(requestSpecification)
                .body(requestBodyText)
                .when().patch("patch")
                .then().log().all()
                .spec(responseSpecification)
                .body("data", containsString(requestBodyText))
                .body("headers.content-length", equalTo("58"))
                .body("url", equalTo("https://postman-echo.com/patch"));
    }

    @Test
    public void checkDeleteRawText() {
        String requestBodyText = "This is expected to be sent back as part of response body.";
        RestAssured
                .given()
                .spec(requestSpecification)
                .body(requestBodyText)
                .when().delete("delete")
                .then().log().all()
                .spec(responseSpecification)
                .body("data", containsString(requestBodyText))
                .body("headers.content-length", equalTo("58"))
                .body("url", equalTo("https://postman-echo.com/delete"));
    }
}

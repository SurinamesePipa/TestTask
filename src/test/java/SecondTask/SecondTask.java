package SecondTask;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class SecondTask {

    @Test
    public void responseCodeCheck() {
        SecondTaskPojo data = given()
                .baseUri("http://api.ipstack.com/")
                .contentType(ContentType.JSON)
                .when().get("134.249.147.247?access_key=01c0ac92c93748e0790e73e1739d39bf")
                .then()
                .statusCode(200)
                .extract().as(SecondTaskPojo.class);
       Assert.assertTrue(data.getLatitude().startsWith("50.43"));
       Assert.assertTrue(data.getLongitude().startsWith("30.51"));
    }
}


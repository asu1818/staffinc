package Testcases;

import lombok.SneakyThrows;
import okhttp3.*;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Author : Andre Suwandi
 *
 * How to run this test case : using terminal add write "mvn test -Dtest=BackEndGetUserId"
 */

public class BackEndGetUserId {

    @SneakyThrows
    @Test
    public void getApiDataTest() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        Request request = new Request.Builder()
                .url("https://reqres.in/api/user/2")
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();

        // Verification response
        String jsonResponse = response.body().string();
        JSONObject Jobject1 = new JSONObject(jsonResponse);
        JSONObject Jobject2 = new JSONObject(Jobject1.getString("data"));
        JSONObject Jobject3 = new JSONObject(Jobject1.getString("support"));

        Assert.assertNotNull(Jobject2.getString("id"), "Field id not null");
        Assert.assertNotNull(Jobject2.getString("name"), "Field name not null");
        Assert.assertNotNull(Jobject2.getString("year"), "Field year not null");
        Assert.assertNotNull(Jobject2.getString("color"), "Field color not null");
        Assert.assertNotNull(Jobject2.getString("pantone_value"), "Field pantone_value not null");
        Assert.assertNotNull(Jobject3.getString("url"), "Field url not null");
        Assert.assertNotNull(Jobject3.getString("text"), "Field text not null");
    }
}

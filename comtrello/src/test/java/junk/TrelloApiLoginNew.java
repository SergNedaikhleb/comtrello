package junk;

import com.google.gson.Gson;
import okhttp3.Cookie;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.testng.annotations.Test;

import java.io.IOException;

public class TrelloApiLoginNew {

 //   OkHttpClient client = new OkHttpClient.Builder().cookieJar(cookieStorage).build();
    Gson gson = new Gson();

    @Test
    public void testCookies() throws IOException {
//        String response = client.newCall(new Request.Builder().url("http://whatsmyua.info/").addHeader("User-Agent", "12345"));
 //       System.out.println(response);
    }


    @Test
    public void loginByAp() throws IOException {
        FormBody formData = new FormBody.Builder()
        .add("method", "password")
        .add("factors[user", "@gmail.com")
        .add("factors[password]", "qwerty3")
        .build();
        Request request = new Request.Builder().url("http://trello.com/1/authentication").post(formData).build();
 //       String response = client.newCall(request).execute().body().string();


    // authorization/session
//    String dsc = cookieStorage.cookies.stream().filter(cookie -> cookie.name().equals("dsc")).findFirst().get().value();
    FormBody sessionFormData = new FormBody.Builder()
//            .add("authentication", code)
//            .add("dsc", dsc)
            .build();
    Request requestSession = new Request.Builder().url("https://trello.com/1/authorization/session").post(sessionFormData).build();
//    response = client.newCall(requestSession).execute().body().string();
 //       System.out.println(response);

    // Selenium

//    driver().get("http://trello.com");

 //   for (Cookie cookie : cookieStorage.Builder()) {
 //       org.openqa.selenium.Cookie
    }

}

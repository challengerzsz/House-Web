package com.bsb.house;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HouseApplicationTests {

    @Autowired
    private HttpClient client;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testHttpClient() throws IOException {
        System.out.println(EntityUtils.toString(client.execute(new HttpGet("https://www.google.com")).getEntity()));
    }

}

package com.vipkid.header;

import com.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@EnableAutoConfiguration
public class App {

    @Autowired
    private ExampleService exampleService;

    @RequestMapping("/")
    @ResponseBody
    String home() throws IOException {
        //SampleHttpClient.doHttpClient();
        return exampleService.wrap("Hello World!");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}

package xyz.anhbom.demospringboot.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("${base.url}/hello")
public class HelloRestController {

    @PostConstruct
    public void postConstruct(){
        System.out.println("post construct");
    }


    @GetMapping
    public ResponseEntity<?> helloSpring(){
        Map<String,String> response = new HashMap<>();
        response.put("response", "Hello World");
        return ResponseEntity.ok(response);
    }
}

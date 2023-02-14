package com.ll.resttemplate.restTemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController {

    @GetMapping("/getUserObject")
    public String getUserObject(){

        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject("https://mocki.io/v1/803b009a-9996-46d0-b7be-f287d20278d6", User.class);

        System.out.println("User id:"+user.getId());
        System.out.println("User name:"+user.getName());
        return "getUserObject Success";
    }
}

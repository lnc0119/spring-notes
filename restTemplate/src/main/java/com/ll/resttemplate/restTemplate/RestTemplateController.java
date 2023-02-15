package com.ll.resttemplate.restTemplate;

import com.ll.resttemplate.objectmapper.Results;
import com.ll.resttemplate.objectmapper.ResultList;
import com.ll.resttemplate.objects.TaipeiShopData;
import com.ll.resttemplate.objects.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController {


    private final static Logger log = LoggerFactory.getLogger(RestTemplateController.class);

    @Autowired
    RestTemplate restTemplate;



    @GetMapping("/taipeiShopData")
    public String getTaipeiShopData(){


        TaipeiShopData apiData = restTemplate.getForObject("https://data.taipei/api/v1/dataset/bdc97a62-4da4-43f9-8c35-c0e6157d3d68?scope=resourceAquire",
                TaipeiShopData.class);

        ResultList resultList = apiData.getResultList();
        log.info("apiData: {}",apiData.getResultList());
        log.info("limitData: {}, offset:{},count:{},sort{}",
                resultList.getLimitData(),resultList.getOffset(),resultList.getCount(),resultList.getSort());

        for(Results results:resultList.getResults()){
            log.info("序號:{}, 商圈:{},區:{}, 標籤:{}," +
                        "組織名稱:{},坐落位置:{},鄰近捷運:{},商圈類型:{},說明:{}",
                results.getId(),results.getShopArea(),results.getState(), results.getTag(),
                results.getOrganizeName(),results.getLocation(),results.getMrt(),
                results.getShopType(),results.getDirections()
                );
        }

        return "getTaipeiShopData Success";

    }

    @GetMapping("/user")
    public String getUserObject(){

        User user = restTemplate.getForObject("https://mocki.io/v1/e8038fe4-e084-4d6d-8908-6e1eea05032d", User.class);

        System.out.println("user name: "+ user.getName());
        System.out.println("user id: "+ user.getId());
        // 用log (log4j) -> 少用sout
//        System.out.println("User id:"+user.getId());
//        System.out.println("User name:"+user.getName());

        return "getUserObject Success";

        // mapping
        // object 接值

    }
}

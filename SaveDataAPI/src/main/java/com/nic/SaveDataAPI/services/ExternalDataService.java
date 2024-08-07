package com.nic.SaveDataAPI.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalDataService {

    @Value("${external.api.url}")
    private String externalApiUrl;

    @Autowired
    private RestTemplate restTemplate;

    public String fetchData(String requestKey){
//        String url = externalApiUrl + "?requestKey="+requestKey;
        String url = externalApiUrl +requestKey;
        return  restTemplate.getForObject(url,String.class); // needs similar types to be served from python endpoint
    }

}

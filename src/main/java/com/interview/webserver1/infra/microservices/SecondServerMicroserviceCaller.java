package com.interview.webserver1.infra.microservices;

import com.interview.webserver1.model.Create;
import com.interview.webserver1.model.CreateCallback;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class SecondServerMicroserviceCaller {

    private static final String urlForCreate = "/document/create";

    private final String secondServerUrlForCreate;

    private final RestTemplate restTemplate;

    @Autowired
    public SecondServerMicroserviceCaller(Environment environment) {
        String secondServerUrl = environment.getProperty("second_server_microservice.url");

        this.secondServerUrlForCreate = secondServerUrl + urlForCreate;
        this.restTemplate = new RestTemplate();
    }

    public CreateCallback getCallbackInfoCreate(Create request) {
        CreateCallback response =  restTemplate.postForObject(secondServerUrlForCreate, request, CreateCallback.class);
        return response;
    }
}

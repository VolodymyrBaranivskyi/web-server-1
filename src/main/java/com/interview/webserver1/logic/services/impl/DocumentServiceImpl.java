package com.interview.webserver1.logic.services.impl;

import com.interview.webserver1.infra.microservices.SecondServerMicroserviceCaller;
import com.interview.webserver1.logic.services.DocumentService;
import com.interview.webserver1.model.Create;
import com.interview.webserver1.model.CreateCallback;
import org.springframework.stereotype.Service;

@Service
public class DocumentServiceImpl implements DocumentService {
    private final SecondServerMicroserviceCaller caller;

    public DocumentServiceImpl(SecondServerMicroserviceCaller caller) {
        this.caller = caller;
    }

    @Override
    public CreateCallback sendToSecondServer( Create create) {
        return caller.getCallbackInfoCreate(create);
    }
}

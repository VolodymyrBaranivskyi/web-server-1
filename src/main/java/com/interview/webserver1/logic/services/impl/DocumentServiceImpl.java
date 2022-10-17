package com.interview.webserver1.logic.services.impl;

import com.interview.webserver1.daos.CreateCallbackDao;
import com.interview.webserver1.infra.microservices.SecondServerMicroserviceCaller;
import com.interview.webserver1.logic.services.DocumentService;
import com.interview.webserver1.model.Create;
import com.interview.webserver1.model.CreateCallback;
import com.interview.webserver1.view.dto.CreateCallbackDto;
import com.interview.webserver1.view.dto.mappers.CreateCallbackMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DocumentServiceImpl implements DocumentService {
    private final SecondServerMicroserviceCaller caller;
    private final CreateCallbackDao createCallbackDao;

    @Autowired
    public DocumentServiceImpl(SecondServerMicroserviceCaller caller, CreateCallbackDao createCallbackDao) {
        this.caller = caller;
        this.createCallbackDao = createCallbackDao;
    }

    @Override
    public CreateCallback sendToSecondServer( Create create) {
        return caller.getCallbackInfoCreate(create);
    }

    @Override
    public void saveCallback(CreateCallback createCallback) {
        log.info("start saving createCallback {}", createCallback);
        createCallbackDao.saveCreateCallback(createCallback);
        log.info("end saving createCallback");
    }


}

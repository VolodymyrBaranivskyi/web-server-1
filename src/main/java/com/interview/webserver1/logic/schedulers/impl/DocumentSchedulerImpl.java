package com.interview.webserver1.logic.schedulers.impl;

import com.interview.webserver1.logic.schedulers.DocumentScheduler;
import com.interview.webserver1.logic.services.DocumentService;
import com.interview.webserver1.model.Create;
import com.interview.webserver1.model.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import static java.lang.String.format;

@Component
@Slf4j
public class DocumentSchedulerImpl implements DocumentScheduler {


    private final DocumentService documentService;

    private final Environment environment;

    @Autowired
    public DocumentSchedulerImpl(DocumentService documentService, Environment environment){
        this.environment = environment;
        this.documentService = documentService;
    }

    @Override
    @Scheduled(cron = "${create.send_to_second_server.cron_expression}")
    public void runSendToSecondServer() {
        log.info("Send request to second server started! ");
        Data data = new Data();
        data.setNumber(12345);
        data.setType("1");
        String callback_url = format("http://%s:%s/callback/document/create",
                environment.getProperty("server.host"), environment.getProperty("server.port"));
        Create create = new Create(data, callback_url);
        log.info("createData, {}", create);

        documentService.sendToSecondServer(create);

        log.info("createData, {}", create);

    }

}

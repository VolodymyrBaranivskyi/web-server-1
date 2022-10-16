package com.interview.webserver1.view.controllers.schedulers;

import com.interview.webserver1.logic.services.DocumentService;
import com.interview.webserver1.model.Create;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import static com.interview.webserver1.view.controllers.Response.ok;

@RestController
@RequestMapping()
@ApiIgnore
public class DocumentSchedulerController {

    private final DocumentService service;

    @Autowired
    public DocumentSchedulerController(DocumentService service) {
        this.service = service;
    }

    @PostMapping("document/create")
    public ResponseEntity<?> runSendToSecondServer(@RequestBody Create create) {
        service.sendToSecondServer(create);
        return ok();
    }
}

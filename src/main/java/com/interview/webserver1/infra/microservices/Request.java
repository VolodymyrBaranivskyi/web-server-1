package com.interview.webserver1.infra.microservices;

import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMethod;

import static java.util.Objects.nonNull;

@Getter
public class Request<B, U> {

    private final B body;
    private final U urlParams;
    private final RequestMethod method;

    Request(B body, U urlParams, RequestMethod method) {
        this.body = body;
        this.urlParams = urlParams;
        this.method = method;
    }

    public boolean hasBody() {
        return nonNull(body);
    }

    public boolean hasUrlParams() {
        return nonNull(urlParams);
    }
}

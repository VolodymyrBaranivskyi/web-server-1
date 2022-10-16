package com.interview.webserver1.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "createCallback")
public class CreateCallback {
    @JacksonXmlProperty
    private int number;

    @JacksonXmlProperty
    private String state;
}

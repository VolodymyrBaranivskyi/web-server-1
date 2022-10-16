package com.interview.webserver1.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "data")
@lombok.Data
public class Data {

    @JacksonXmlProperty
    private int number;

    @JacksonXmlProperty
    private String type;
}

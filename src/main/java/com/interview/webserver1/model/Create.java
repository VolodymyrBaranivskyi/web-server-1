package com.interview.webserver1.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@JacksonXmlRootElement(localName = "create")
public class Create {

    @JacksonXmlProperty
    private com.interview.webserver1.model.Data data;

    @JacksonXmlProperty
    private String callback_url;


}

package com.interview.webserver1.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "CreateCallbacks")
@EqualsAndHashCode
@NoArgsConstructor
@JacksonXmlRootElement(localName = "createCallback")
public class CreateCallback implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JacksonXmlProperty
    private int number;

    @JacksonXmlProperty
    private String state;
}

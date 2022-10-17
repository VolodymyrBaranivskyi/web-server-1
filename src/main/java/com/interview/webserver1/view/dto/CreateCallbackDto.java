package com.interview.webserver1.view.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CreateCallbackDto implements Dto{
    private int number;

    private String state;
}
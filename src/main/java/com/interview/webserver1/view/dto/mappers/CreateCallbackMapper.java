package com.interview.webserver1.view.dto.mappers;

import com.interview.webserver1.model.CreateCallback;
import com.interview.webserver1.view.dto.CreateCallbackDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CreateCallbackMapper extends BaseMapper<CreateCallbackDto, CreateCallback>{
}
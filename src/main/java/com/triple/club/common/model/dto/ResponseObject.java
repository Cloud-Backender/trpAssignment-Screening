package com.triple.club.common.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@Getter
public class ResponseObject {
    private Object data;
    private final HttpStatus apiStatus = HttpStatus.OK;

    public void setBody(Object data) {
        this.data = data;
    }
}

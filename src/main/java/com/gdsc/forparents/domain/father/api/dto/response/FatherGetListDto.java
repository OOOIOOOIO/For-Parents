package com.gdsc.forparents.domain.father.api.dto.response;

import lombok.Getter;

import java.util.List;

@Getter
public class FatherGetListDto {

    private List<FatherGetResInterface> questions;

    public FatherGetListDto(List<FatherGetResInterface> questions) {
        this.questions = questions;
    }
}

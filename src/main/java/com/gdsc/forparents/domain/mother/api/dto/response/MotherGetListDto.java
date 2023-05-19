package com.gdsc.forparents.domain.mother.api.dto.response;

import com.gdsc.forparents.domain.father.api.dto.response.FatherGetResInterface;
import lombok.Getter;

import java.util.List;

@Getter
public class MotherGetListDto {

    private List<MotherGetResInterface> questions;

    public MotherGetListDto(List<MotherGetResInterface> questions) {
        this.questions = questions;
    }
}

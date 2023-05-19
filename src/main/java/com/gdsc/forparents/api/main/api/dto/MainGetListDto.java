package com.gdsc.forparents.api.main.api.dto;

import com.gdsc.forparents.domain.father.api.dto.response.FatherGetResInterface;
import com.gdsc.forparents.domain.mother.api.dto.response.MotherGetResInterface;
import lombok.Getter;

import java.util.List;

@Getter
public class MainGetListDto {

    private List<MotherGetResInterface> motherSelf;
    private List<MotherGetResInterface> motherOther;
    private List<FatherGetResInterface> fatherSelf;
    private List<FatherGetResInterface> fatherOther;

    public MainGetListDto(List<MotherGetResInterface> motherSelf, List<MotherGetResInterface> motherOther, List<FatherGetResInterface> fatherSelf, List<FatherGetResInterface> fatherOther) {
        this.motherSelf = motherSelf;
        this.motherOther = motherOther;
        this.fatherSelf = fatherSelf;
        this.fatherOther = fatherOther;
    }
}

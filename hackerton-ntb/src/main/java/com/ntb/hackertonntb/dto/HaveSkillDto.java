package com.ntb.hackertonntb.dto;

import com.ntb.hackertonntb.domain.entity.HaveSkill;
import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class HaveSkillDto {
    private int id;

    public HaveSkill toEntity(){
        HaveSkill build = HaveSkill.builder()
                .id(id)
                .build();
        return build;
    }

    @Builder
    public HaveSkillDto(int id){
        this.id = id;
    }
}
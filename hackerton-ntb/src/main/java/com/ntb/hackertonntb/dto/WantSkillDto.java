package com.ntb.hackertonntb.dto;

import com.ntb.hackertonntb.domain.entity.WantSkill;
import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class WantSkillDto {
    private int id;

    public WantSkill toEntity(){
        WantSkill build = WantSkill.builder()
                .id(id)
                .build();
        return build;
    }

    @Builder
    public WantSkillDto(int id){
        this.id = id;
    }
}
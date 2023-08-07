package com.ntb.hackertonntb.dto;

import com.ntb.hackertonntb.domain.entity.Skills;
import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class SkillsDto {
    private int id;
    private String skillname;

    public Skills toEntity(){
        Skills build = Skills.builder()
                .id(id)
                .skillname(skillname)
                .build();
        return build;
    }

    @Builder
    public SkillsDto(int id, String skillname){
        this.id = id;
        this.skillname = skillname;
    }
}
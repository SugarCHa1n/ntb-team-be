package com.ntb.hackertonntb.dto;

import com.ntb.hackertonntb.domain.entity.Gesipan;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class GesipanDto {
    private int id;
    private LocalDateTime date;
    private String detail;
    private String comment;

    public Gesipan toEntity(){
        Gesipan build = Gesipan.builder()
                .id(id)
                .detail(detail)
                .comment(comment)
                .build();
        return build;
    }

    @Builder
    public GesipanDto(int id, String detail, String comment, LocalDateTime date){
        this.id = id;
        this.detail = detail;
        this.comment = comment;
        this.date = date;
    }
}
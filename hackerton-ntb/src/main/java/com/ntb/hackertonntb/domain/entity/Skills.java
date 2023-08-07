package com.ntb.hackertonntb.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Skills {
    @Id
    @GeneratedValue
    private int id;

    @Column(length = 45, nullable = false)
    private String skillname;

    @Builder
    public Skills(int id, String skillname) {
        this.id = id;
        this.skillname = skillname;
    }
}

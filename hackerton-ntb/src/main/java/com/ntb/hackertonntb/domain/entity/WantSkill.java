package com.ntb.hackertonntb.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WantSkill {
    @Id
    @GeneratedValue
    private int id;

    @Builder
    public WantSkill(int id) {
        this.id = id;
    }
}
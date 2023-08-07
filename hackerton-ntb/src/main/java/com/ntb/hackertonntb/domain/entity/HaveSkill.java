package com.ntb.hackertonntb.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class HaveSkill {
    @Id
    @GeneratedValue
    private int id;

    @Builder
    public HaveSkill(int id) {
        this.id = id;
    }
}
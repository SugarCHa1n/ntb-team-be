package com.ntb.hackertonntb.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Gesipan extends TimeEntity{
    @Id
    @GeneratedValue
    private int id;

    @Column(length = 500, nullable = false)
    private String detail;

    @Column(length = 100, nullable = false)
    private String comment;

    @Builder
    public Gesipan(int id, String detail, String comment) {
        this.id = id;
        this.detail = detail;
        this.comment = comment;
    }
}
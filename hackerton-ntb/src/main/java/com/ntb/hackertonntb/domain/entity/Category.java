package com.ntb.hackertonntb.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category {
    @Id
    @GeneratedValue
    private int id;

    @Column(length = 45, nullable = false)
    private String categoryname;

    @Builder
    public Category(int id, String categoryname) {
        this.id = id;
        this.categoryname = categoryname;
    }
}

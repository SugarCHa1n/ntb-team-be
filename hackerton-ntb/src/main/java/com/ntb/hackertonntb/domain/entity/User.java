package com.ntb.hackertonntb.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends TimeEntity{
    @Id
    @GeneratedValue
    private int id;

    @Column(length = 45, nullable = false)
    private String loginid;

    @Column(length = 45, nullable = false)
    private String loginpassword;

    @Column(length = 245, nullable = false)
    private String introduce;

    @Column(length = 45, nullable = false)
    private String name;

    @Builder
    public User(int id, String loginid, String loginpassword, String introduce, String name){
        this.id = id;
        this.loginid = loginid;
        this.loginpassword = loginpassword;
        this.introduce = introduce;
        this.name = name;
    }
}

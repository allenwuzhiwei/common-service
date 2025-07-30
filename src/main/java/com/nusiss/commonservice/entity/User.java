package com.nusiss.commonservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Setter
@Getter
public class User{

    private Integer userId;

    private String username;

    private String email;

    private String password;

    private String createDatetime;

    private String updateDatetime;

    private String createUser;

    private String updateUser;

    public User(){}

    public User(Integer userId, String username, String email,
                String createDatetime, String updateDatetime,
                String createUser, String updateUser) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.createDatetime = createDatetime;
        this.updateDatetime = updateDatetime;
        this.createUser = createUser;
        this.updateUser = updateUser;
    }

}


package com.nusiss.commonservice.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class Permission{

    private Integer id;

    private String endpoint;

    private String method;

    private String description;

    private String createDatetime;

    private String updateDatetime;

    private String createUser;

    private String updateUser;

}
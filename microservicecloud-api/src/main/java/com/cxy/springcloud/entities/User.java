package com.cxy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private int id;
    private String headid;
    private String email;
    private String password;
    private String username;
    private String phonenumber;
    private Date signintime;
    private String focususers;
    private String focustext;
    private String sex;
    private String underwrite;
    private int experence;
}

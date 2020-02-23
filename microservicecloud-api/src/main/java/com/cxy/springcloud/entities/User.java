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
    private String headId;
    private String email;
    private String password;
    private String username;
    private String phoneNumber;
    private Date signInTime;
    private String focusUsers;
    private String focusText;
    private String sex;
    private String underWrite;
    private int experence;
}

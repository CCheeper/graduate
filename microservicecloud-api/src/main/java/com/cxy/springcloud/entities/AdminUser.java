package com.cxy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AdminUser {
    private int id;
    private String username;
    private String password;
}

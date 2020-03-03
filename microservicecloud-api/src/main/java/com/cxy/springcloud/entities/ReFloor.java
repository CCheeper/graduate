package com.cxy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReFloor {
    private int refid;
    private int user_id;
    private int reuser_id;
    private String refloorcontent;
    private int refloor;
    private int refloorId;
    private Date buildtime;

}

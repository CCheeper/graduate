package com.cxy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReFloor {
    private int refId;
    private int user_id;
    private int reUser_id;
    private String reFloorContent;
    private int reFloor;
    private int reFloorId;
    private Date buildTime;

}

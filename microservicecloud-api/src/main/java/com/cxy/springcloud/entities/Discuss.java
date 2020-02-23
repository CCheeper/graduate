package com.cxy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Discuss {
    private int userId;
    private int textId;
    private String discussText;
    private Date buildTime;
    private int id;
    private int floor;
}

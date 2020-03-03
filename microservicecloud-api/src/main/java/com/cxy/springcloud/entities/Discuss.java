package com.cxy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Discuss {
    private int userid;
    private int textid;
    private String discusstext;
    private Date buildtime;
    private int id;
    private int floor;
}

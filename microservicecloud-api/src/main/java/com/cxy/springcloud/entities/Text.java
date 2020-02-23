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
public class Text {
    private int id;
    private int likeNum;
    private Date releaseTime;
    private String status;
    private String text;
    private int userId;
    private String type;
    private int scanned;
}

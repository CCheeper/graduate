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
    private int likenum;
    private Date releasetime;
    private String status;
    private int userid;
    private String type;
    private int scanned;
}

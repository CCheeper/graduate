package com.cxy.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(indexName = "bbs" ,type = "text")
public class ESText {
    @Id
    private int id;

    private String title;
    private String text;
}

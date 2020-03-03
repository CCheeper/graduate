package com.cxy.springcloud.service;

import com.cxy.springcloud.entities.Text;
import com.cxy.springcloud.common.Assist;

import java.util.List;

public interface TextService{
    long getTextRowCount(Assist assist);
    List<Text> selectText(Assist assist);
    Text selectTextById(Integer id);
    int insertText(Text value);
    int insertNonEmptyText(Text value);
    int deleteTextById(Integer id);
    int deleteText(Assist assist);
    int updateTextById(Text enti);
    int updateText(Text value, Assist assist);
    int updateNonEmptyTextById(Text enti);
    int updateNonEmptyText(Text value, Assist assist);
}
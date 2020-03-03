package com.cxy.springcloud.dao;
import com.cxy.springcloud.entities.Text;

import java.util.List;

import com.cxy.springcloud.common.Assist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TextDao{
    int getTextRowCount(Assist assist);
    List<Text> selectText(Assist assist);
    Text selectTextById(Integer id);
    int insertText(Text value);
    int insertNonEmptyText(Text value);
    int deleteTextById(Integer id);
    int deleteText(Assist assist);
    int updateTextById(Text enti);
    int updateText(@Param("enti") Text value, @Param("assist") Assist assist);
    int updateNonEmptyTextById(Text enti);
    int updateNonEmptyText(@Param("enti") Text value, @Param("assist") Assist assist);
}
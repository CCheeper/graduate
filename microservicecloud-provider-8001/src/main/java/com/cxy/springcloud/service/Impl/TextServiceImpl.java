package com.cxy.springcloud.service.Impl;
import java.util.List;

import com.cxy.springcloud.entities.Text;
import com.cxy.springcloud.common.Assist;
import com.cxy.springcloud.dao.TextDao;
import com.cxy.springcloud.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextServiceImpl implements TextService {
    @Autowired
    private TextDao textDao;
    @Override
    public long getTextRowCount(Assist assist){
        return textDao.getTextRowCount(assist);
    }
    @Override
    public List<Text> selectText(Assist assist){
        return textDao.selectText(assist);
    }
    @Override
    public Text selectTextById(Integer id){
        return textDao.selectTextById(id);
    }
    @Override
    public int insertText(Text value){
        return textDao.insertText(value);
    }
    @Override
    public int insertNonEmptyText(Text value){
        return textDao.insertNonEmptyText(value);
    }
    @Override
    public int deleteTextById(Integer id){
        return textDao.deleteTextById(id);
    }
    @Override
    public int deleteText(Assist assist){
        return textDao.deleteText(assist);
    }
    @Override
    public int updateTextById(Text enti){
        return textDao.updateTextById(enti);
    }
    @Override
    public int updateText(Text value, Assist assist){
        return textDao.updateText(value,assist);
    }
    @Override
    public int updateNonEmptyTextById(Text enti){
        return textDao.updateNonEmptyTextById(enti);
    }
    @Override
    public int updateNonEmptyText(Text value, Assist assist){
        return textDao.updateNonEmptyText(value,assist);
    }

    public TextDao getTextDao() {
        return this.textDao;
    }

    public void setTextDao(TextDao textDao) {
        this.textDao = textDao;
    }

}
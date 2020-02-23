package com.cxy.springcloud.service.impl;

import com.cxy.springcloud.dao.AdminUserDao;
import com.cxy.springcloud.dao.TextDao;
import com.cxy.springcloud.entities.AdminUser;
import com.cxy.springcloud.entities.Text;
import com.cxy.springcloud.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextServiceImpl implements TextService {
    @Autowired
    private TextDao dao;

    @Override
    public boolean add(Text text) {
        return dao.addText(text);
    }

    @Override
    public Text get(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Text> list() {
        return dao.findAll();
    }

    @Override
    public boolean delete(int id) {
        return dao.deleteText(id);
    }

    @Override
    public List<Text> findLimit(int fnum, int bnum) {
        return dao.findLimit(fnum, bnum);
    }

}

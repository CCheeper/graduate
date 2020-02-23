package com.cxy.springcloud.service;

import com.cxy.springcloud.entities.Text;

import java.util.List;

public interface TextService {
    public boolean add(Text user);

    public Text get(int id);

    public List<Text> list();

    public boolean delete(int id);

    public List<Text> findLimit(int fnum, int bnum);
}

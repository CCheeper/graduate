package com.cxy.springcloud.dao;

import com.cxy.springcloud.entity.ESText;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ESDao extends ElasticsearchRepository<ESText, Integer> {
}

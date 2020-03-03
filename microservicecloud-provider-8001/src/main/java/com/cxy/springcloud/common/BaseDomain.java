package com.cxy.springcloud.common;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


    public class BaseDomain implements Serializable {
        public BaseDomain() {
        }

        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }


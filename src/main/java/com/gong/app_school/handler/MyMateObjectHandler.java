package com.gong.app_school.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class MyMateObjectHandler implements MetaObjectHandler {

    //插入时的填充策略
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill.....");
        setFieldValByName("deleted",0,metaObject);
        setFieldValByName("deleted",0,metaObject);
        this.setFieldValByName("createTime",new Date(),metaObject);
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }

    //更新时的填充策略
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("====>start update fill.....");
        setFieldValByName("deleted",0,metaObject);
        setFieldValByName("deleted",0,metaObject);
        this.setFieldValByName("updateTime",new Date(),metaObject);
        this.setFieldValByName("createTime",new Date(),metaObject);
    }
}

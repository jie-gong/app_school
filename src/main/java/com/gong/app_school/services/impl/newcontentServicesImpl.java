package com.gong.app_school.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gong.app_school.mapper.newcontentMapper;
import com.gong.app_school.model.dao.newcontent;
import com.gong.app_school.services.newcontentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.services.impl.newcontentServicesImpl
 * @Date: 2022年10月04日 09:24
 * @Description:
 */
@Service
public class newcontentServicesImpl extends ServiceImpl<newcontentMapper, newcontent> implements newcontentServices {

    @Autowired
    private newcontentMapper newcontentMapper;

    //查询全部厂商新闻
    public List<newcontent> showList() {
        List<newcontent> newcontents = newcontentMapper.selectList(new QueryWrapper<>());
        return newcontents;
    }
}

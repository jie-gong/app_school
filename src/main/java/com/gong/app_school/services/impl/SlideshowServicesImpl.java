package com.gong.app_school.services.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gong.app_school.mapper.SlideshowMapper;
import com.gong.app_school.model.dao.Slideshow;
import com.gong.app_school.services.SlideshowServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.services.impl.SlideshowServicesIml
 * @Date: 2022年10月04日 08:57
 * @Description:
 */
@Service
public class SlideshowServicesImpl extends ServiceImpl<SlideshowMapper, Slideshow> implements SlideshowServices {
    @Autowired
    private SlideshowMapper slideshowMapper;

    //获取轮播图
    public List<Slideshow> showSlides() {
        List<Slideshow> slideshows = slideshowMapper.selectList(new QueryWrapper<>());
        return slideshows;
    }
}

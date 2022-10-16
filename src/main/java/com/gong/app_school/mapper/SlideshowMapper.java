package com.gong.app_school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gong.app_school.model.dao.Slideshow;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.mapper.SlideshowMapper
 * @Date: 2022年10月04日 08:54
 * @Description:
 */
@Mapper
@Repository
public interface SlideshowMapper extends BaseMapper<Slideshow> {
}

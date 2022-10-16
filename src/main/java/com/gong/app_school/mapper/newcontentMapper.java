package com.gong.app_school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gong.app_school.model.dao.newcontent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.mapper.newcontentMapper
 * @Date: 2022年10月04日 09:20
 * @Description:
 */
@Mapper
@Repository
public interface newcontentMapper extends BaseMapper<newcontent> {
}

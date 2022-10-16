package com.gong.app_school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gong.app_school.model.dao.Activeity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.mapper.ActiveityMapper
 * @Date: 2022年10月03日 15:44
 * @Description:
 */
@Mapper
@Repository//持久层框架
public interface ActiveityMapper extends BaseMapper<Activeity> {
}

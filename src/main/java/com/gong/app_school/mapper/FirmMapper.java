package com.gong.app_school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gong.app_school.model.dao.Firm;
import com.gong.app_school.model.vo.Phone;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.mapper.FirmMapper
 * @Date: 2022年10月03日 14:46
 * @Description:
 */
@Mapper
@Repository
//持久层框架
public interface FirmMapper extends BaseMapper<Firm> {

    List<Firm> listName(int recommand);

    List<Phone> ListPhone();
}

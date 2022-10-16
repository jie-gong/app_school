package com.gong.app_school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gong.app_school.model.dao.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.mapper.ProductMapper
 * @Date: 2022年10月04日 20:45
 * @Description:
 */
@Mapper
@Repository
public interface ProductMapper extends BaseMapper<Product> {
    List<Product>SelectByClass(Product product);
}

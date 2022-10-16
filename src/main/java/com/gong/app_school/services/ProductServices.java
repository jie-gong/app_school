package com.gong.app_school.services;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gong.app_school.mapper.ProductMapper;
import com.gong.app_school.model.dao.Product;

import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.services.productServices
 * @Date: 2022年10月04日 20:52
 * @Description:
 */
public interface ProductServices extends IService<Product> {
    List<Product> SelectByClass(Product product);

}

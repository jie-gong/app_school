package com.gong.app_school.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gong.app_school.mapper.ProductMapper;
import com.gong.app_school.model.dao.Product;
import com.gong.app_school.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zJyS mzr
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.services.impl.productServicesImpl
 * @Date: 2022年10月04日 20:52
 * @Description:
 */
@Service
public class ProductServicesImpl extends ServiceImpl<ProductMapper, Product> implements ProductServices {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> SelectByClass(Product product) {
        List<Product> products = productMapper.SelectByClass(product);
        return products;
    }
}

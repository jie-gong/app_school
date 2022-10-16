package com.gong.app_school.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gong.app_school.mapper.ProductMapper;
import com.gong.app_school.model.dao.Product;
import com.gong.app_school.returnJson.ReturnObject;
import com.gong.app_school.services.impl.ProductServicesImpl;
import com.gong.app_school.util.ServletUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.controller.ProductController
 * @Date: 2022年10月04日 20:47
 * @Description:
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductMapper productMapper;

    //获取全部产品信息
    @GetMapping("/list")
    @ResponseBody
    public Object listPro() {
        List<Product> products = productMapper.selectList(new QueryWrapper<>());
        if (products.size() != 0) {
            for (Product product : products) {
                product.setImg(ServletUtils.getImageUrl(product.getImg()));
            }
            return JSONObject.toJSON(new ReturnObject(200, "查询成功", products.size(), products));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "查询内容为空"));
        }
    }

    @Autowired
    private ProductServicesImpl productServices;

    //根据工厂类型查询产品
    @RequestMapping("/product")
    @ResponseBody
    public Object SelectByclass(@RequestBody Product product) {
        List<Product> products = productServices.SelectByClass(product);
        if (products.size() != 0) {
            for (Product product1 : products) {
                product1.setImg(ServletUtils.getImageUrl(product1.getImg()));
            }
            return JSONObject.toJSON(new ReturnObject(200, "操作成功", products.size(), products));
        } else {
            return JSONObject.toJSON(new ReturnObject(500, "操作失败"));
        }
    }
}

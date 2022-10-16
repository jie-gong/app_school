package com.gong.app_school.model.dao;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.model.dao.Product
 * @Date: 2022年10月04日 20:40
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
    private int id;
    @TableId(value = "classify")
    private String classify;
    private String product;
    private int firmId;
    private String img;
    private String neiRong;
}

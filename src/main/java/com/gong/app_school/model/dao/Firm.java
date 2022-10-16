package com.gong.app_school.model.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.model.dao.Firm
 * @Date: 2022年10月03日 14:47
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Firm implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @TableField("name")
    private String name;

    @TableField("news")
    private String news;

    @TableField("classify")
    private String classify;

    private String event;

    private String image;

    @TableId(value = "firm_id", type = IdType.AUTO)
    private int firmId;
    /**
     * 1推荐活动 0 不推荐  int类型
     */
    private Integer recommand;

    @TableId("phone")
    private String phone;


}

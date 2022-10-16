package com.gong.app_school.model.dao;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.model.dao.Activeity
 * @Date: 2022年10月03日 15:26
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activeity {

    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private String actives;
    private String name;
    //字段填充内容
    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;
}

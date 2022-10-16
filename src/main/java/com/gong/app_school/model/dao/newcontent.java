package com.gong.app_school.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.model.dao.newcontent
 * @Date: 2022年10月04日 09:17
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class newcontent {
    private  Integer id;
    private String content;
    private int firmId;
    private String img;

}

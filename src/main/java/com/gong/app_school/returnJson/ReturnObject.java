package com.gong.app_school.returnJson;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
public class ReturnObject {

    private Integer code = 200;
    private Integer total;
    private String message = "";
    private Object data;

    public ReturnObject(Integer code, String message, Integer total, Object result) {
        this.code = code;
        this.total = total;
        this.message = message;
        this.data = result;
    }

    public ReturnObject(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}

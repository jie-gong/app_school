package com.gong.app_school.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: 公杰
 * @Project: JavaLaity
 * @Pcakage: com.gong.app_school.config.UserLoginHandlerInterceptor
 * @Date: 2022年10月04日 14:05
 * @Description:
 */
public class UserLoginHandlerInterceptor implements HandlerInterceptor {
    String User = "123";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (User == null) {
            return false;
        } else {
            return true;
        }
    }
}

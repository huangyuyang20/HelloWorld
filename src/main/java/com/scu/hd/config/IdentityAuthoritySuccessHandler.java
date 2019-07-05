package com.scu.hd.config;

import com.alibaba.fastjson.JSONObject;
import com.scu.hd.dao.ApplyForColleageDao;
import com.scu.hd.entity.AppResponse;
import com.scu.hd.entity.User;
import com.scu.hd.serviceImpl.ApplyForColleageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.DefaultSavedRequest;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 权限路由判断
 */
@Component
public class IdentityAuthoritySuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        httpServletResponse.setContentType("application/json;charset=UTF-8");

        DefaultSavedRequest savedRequest = (DefaultSavedRequest)httpServletRequest.getSession().getAttribute("SPRING_SECURITY_SAVED_REQUEST");
        AppResponse response = new AppResponse();
        response.setBody(((User)authentication.getPrincipal()).getUsername());

        if (savedRequest != null){
            response.setInfo(savedRequest.getRequestURI());

            if (savedRequest.getRequestURI().contains("check")){
                System.out.println(((User) authentication.getPrincipal()));
                if (!((User) authentication.getPrincipal()).getUserRole().contains("LEVEL" + savedRequest.getRequestURI().charAt(savedRequest.getRequestURI().indexOf("check") + 5))) {
                    httpServletRequest.getSession().removeAttribute("SPRING_SECURITY_SAVED_REQUEST");
                }
            } else if (savedRequest.getRequestURI().contains("admin")){
                if (!((User) authentication.getPrincipal()).getUserRole().contains("ADMIN")) {
                    httpServletRequest.getSession().removeAttribute("SPRING_SECURITY_SAVED_REQUEST");
                }
            } else {
                if (!((User) authentication.getPrincipal()).getUserRole().contains("STUDENT")) {
                    httpServletRequest.getSession().removeAttribute("SPRING_SECURITY_SAVED_REQUEST");
                }
            }

        } else {
            if (((User) authentication.getPrincipal()).getUserRole().equals("ROLE_LEVEL1")){
                response.setInfo("/check1");
            }else if (((User) authentication.getPrincipal()).getUserRole().equals("ROLE_LEVEL2")){
                response.setInfo("/check2");
            }else if (((User) authentication.getPrincipal()).getUserRole().equals("ROLE_LEVEL3")){
                response.setInfo("/check3");
            }else if (((User) authentication.getPrincipal()).getUserRole().equals("ROLE_LEVEL4")){
                response.setInfo("/check4");
            }else if (((User) authentication.getPrincipal()).getUserRole().equals("ROLE_STUDENT")){
                System.out.println("用户名"+((User) authentication.getPrincipal()).getUsername());
                 response.setInfo("/student/application");

            }
             else  response.setInfo("/index");
            System.out.println(((User) authentication.getPrincipal()).getUserRole().toString()+"调用response.setInfo");

        }
        System.out.println("返回数据"+JSONObject.toJSON(response).toString());
        httpServletResponse.getWriter().write(JSONObject.toJSON(response).toString());
    }
}

package com.scu.hd.controller;


import com.scu.hd.entity.AppResponse;
import com.scu.hd.entity.StudApplyInformation;
import com.scu.hd.entity.User;
import com.scu.hd.entity.UserStudApplyInformationOV;
import com.scu.hd.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;

/**
 * @author:   wbx
 * @email:    wbx123450@163.com
 * @date:     2019/6/29-15:15
 * @module:   [申请模块]
 * @describe: []
 * @version:  v1.0
 */
@RestController
@RequestMapping("/student")
public class ApplicationController {
    @Autowired
    LoginService loginService;


    @PostMapping("/application/edit")
    public AppResponse editApplicationInfo(@RequestBody StudApplyInformation information){
        System.out.println(information);
        AppResponse resp = new AppResponse();
        try{
            information.setStuBirthday(null);
            loginService.updateStudApplyInformation(information);
        } catch (Exception e){
            resp.setCode(2);
            resp.setStatus("fail");
            resp.setInfo("插入失败");
        }
        return resp;
    }

    @GetMapping("/application/init")
    public UserStudApplyInformationOV getInit(HttpServletRequest request){
        /**
         * 获得spring security的session数据
         */
        SecurityContext securityContext = (SecurityContext) request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        Authentication authentication = securityContext.getAuthentication();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

        User principal = (User)authentication.getPrincipal();
        StudApplyInformation studApplyInformation = loginService.selectStudApplyInformationById(principal.getUsername());
        System.out.println("=="+studApplyInformation);

        return new UserStudApplyInformationOV(principal, studApplyInformation);
    }
}

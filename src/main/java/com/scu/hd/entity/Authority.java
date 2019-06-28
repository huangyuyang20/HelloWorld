package com.scu.hd.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

/**
 * @author:   wbx
 * @email:    wbx123450@163.com
 * @date:     2019/6/23-8:43
 * @module:   [权限校验]
 * @describe: [权限bean, 实现GrantedAuthority接口, 实现getAuthority方法
 *                 包含权限版本id
 *                 权限name]
 * @version:  v1.0
 */
public class Authority implements GrantedAuthority, Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Authority{" +
                "id=" + id +
                ", authority='" + authority + '\'' +
                '}';
    }

    private long id;

    private String authority;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}

package com.scu.hd.service;

import com.scu.hd.dao.LoginMapper;
import com.scu.hd.entity.Authority;
import com.scu.hd.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:   wbx
 * @email:    wbx123450@163.com
 * @date:     2019/6/23-10:53
 * @module:   []
 * @describe: [测试所需的数据
 *                  这里强调一点: 密码必须是md5加密后的
 *                   spring security会通过username查询数据库, 再比较post密码和查询密码来判断是否成功]
 * @version:  v1.0
 */
@Service
public class UserDetailService implements UserDetailsService{
    @Autowired
    private LoginMapper log;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println("===============:" + s);
        User user = log.selectUserById(s);
        List<Authority> list = new ArrayList<>();
        Authority authority = new Authority();
        authority.setAuthority(user.getUserRole());
        list.add(authority);
        user.setAuthorities(list);

        System.out.println(user);
        return user;
    }
}

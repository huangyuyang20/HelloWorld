package com.scu.hd.config;


import com.scu.hd.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


/**
 * @author:   wbx
 * @email:    wbx123450@163.com
 * @date:     2019/6/23-9:26
 * @module:   [权限校验]
 * @describe: [spring security的配置类
 *              1. 配置权限
 *              2. 配置查询
 *              3. 配置编码
 *              4. 设置post校验
 * @version:  v1.0
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private static final String KEY = "wbx.com";

    //1. 配置编码
    @Bean
    PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Autowired
    private PasswordEncoder passwordEncoder;

    //2. 配置数据库查询
    @Autowired
    UserDetailService userDetailService;

    @Bean
    AuthenticationProvider getAuthenticationProvider(){
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailService);
        authenticationProvider.setPasswordEncoder(passwordEncoder);
        return authenticationProvider;
    }
    @Autowired
    AuthenticationProvider authenticationProvider;

    //3. 配置权限通过
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/css/**", "/js/**", "/fonts/**", "/index").permitAll() // 都可以访问
                .antMatchers("/login/**").permitAll()
                .antMatchers("/admins/**").hasRole("ADMIN") // 需要相应的角色才能访问
                .antMatchers("/updateEmployee/**").hasRole("ADMIN")
                .antMatchers("/check1/**").hasRole("LEVEL1")
                .antMatchers("/check2/**").hasRole("LEVEL2")
                .antMatchers("/check3/**").hasRole("LEVEL3")
                .antMatchers("/check4/**").hasRole("LEVEL4")
                .antMatchers("/student/**").hasRole("STUDENT")
                .and()

                .formLogin()                    //基于 post + Form 表单登录验证
                .loginPage("/login")            // post提交页面
                .failureUrl("/login-error")     // post校验失败跳转页面
                .successHandler(new IdentityAuthoritySuccessHandler())
                .and()

//                .csrf().disable()
                .rememberMe().key(KEY) // 启用 remember me
                .and()

                .exceptionHandling().accessDeniedPage("/login-error")
        .and().logout().logoutUrl("/logout").clearAuthentication(true).logoutSuccessUrl("/index");

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailService);
        auth.authenticationProvider(authenticationProvider);
    }
}

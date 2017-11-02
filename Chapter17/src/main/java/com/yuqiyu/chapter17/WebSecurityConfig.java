package com.yuqiyu.chapter17;

import com.yuqiyu.chapter17.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/18
 * Time：22:55
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter
{
    //完成自定义认证实体注入
    @Bean
    UserDetailsService userService()
    {
        return new UserService();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .anyRequest().authenticated()//所有请求必须登陆后访问
                .and()
                    .formLogin()
                    .loginPage("/login")
                    .failureUrl("/login?error")
                    .permitAll()//登录界面，错误界面可以直接访问
                .and()
                .logout()
                .permitAll();//注销请求可直接访问
    }
}

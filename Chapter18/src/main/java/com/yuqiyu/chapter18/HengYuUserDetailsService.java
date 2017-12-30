package com.yuqiyu.chapter18;

import com.yuqiyu.chapter18.entity.Authority;
import com.yuqiyu.chapter18.entity.User;
import com.yuqiyu.chapter18.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/22
 * Time：16:46
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Component("userDetailsService")
public class HengYuUserDetailsService implements UserDetailsService
{
    @Autowired
    private UserJPA userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(final String login) {

        String lowercaseLogin = login.toLowerCase();

        User userFromDatabase = userRepository.findByUsernameCaseInsensitive(lowercaseLogin);

        if (userFromDatabase == null) {
            throw new NewUserNotFoundException("User " + lowercaseLogin + " was not found in the database");
        }
        //获取用户的所有权限并且SpringSecurity需要的集合
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (Authority authority : userFromDatabase.getAuthorities()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getName());
            grantedAuthorities.add(grantedAuthority);
        }
        //返回一个SpringSecurity需要的用户对象
        return new org.springframework.security.core.userdetails.User(
                userFromDatabase.getUsername(),
                userFromDatabase.getPassword(),
                grantedAuthorities);

    }
}

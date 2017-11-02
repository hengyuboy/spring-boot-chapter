package com.yuqiyu.chapter17.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/18
 * Time：22:13
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Entity
@Table(name = "users")
public class UserEntity implements Serializable,UserDetails
{
    @Id
    @Column(name = "u_id")
    private Long id;
    @Column(name = "u_username")
    private String username;
    @Column(name = "u_password")
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = {
                    @JoinColumn(name = "ur_user_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ur_role_id")
            }
    )
    private List<RoleEntity> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> auths = new ArrayList<>();
        List<RoleEntity> roles = getRoles();
        for(RoleEntity role : roles)
        {
            auths.add(new SimpleGrantedAuthority(role.getFlag()));
        }
        return auths;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleEntity> roles) {
        this.roles = roles;
    }
}

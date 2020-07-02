package com.example.security.service.impl;

import com.example.security.entity.SysUser;
import com.example.security.entity.vo.LoginUser;
import com.example.security.service.SysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.security.Permission;
import java.util.List;

/**
 * @author liudangge
 * @date 2020/7/1 11:23
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    SysUserService sysUserService;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser user = sysUserService.queryByUsername(s);
        if (user == null) {
            throw new AuthenticationCredentialsNotFoundException("用户名不存在");
        } else if (user.getStatus().equals(SysUser.Status.LOCKED)) {
            throw new LockedException("用户被锁定，请联系管理员");
        } else if (user.getStatus().equals(SysUser.Status.DISABLED)) {
            throw new DisabledException("用户不可用");
        }
        LoginUser loginUser = new LoginUser();
        BeanUtils.copyProperties(user,loginUser);

        List<Permission> permissionList =
        return null;
    }
}

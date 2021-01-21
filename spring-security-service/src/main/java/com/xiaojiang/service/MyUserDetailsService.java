package com.xiaojiang.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaojiang.entity.UserDTO;
import com.xiaojiang.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDTO userDTO = userMapper.selectOne(new QueryWrapper<UserDTO>().eq("username",username));

        if (null == userDTO){
            throw new UsernameNotFoundException("该用户未注册！");
            }
//        ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<>();

        // 设置权限
        List<GrantedAuthority> authorities = AuthorityUtils.commaSeparatedStringToAuthorityList("abc");
        return new User(userDTO.getUsername(),userDTO.getPassword(),authorities) ;
    }

}

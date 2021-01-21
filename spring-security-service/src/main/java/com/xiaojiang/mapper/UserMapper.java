package com.xiaojiang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaojiang.entity.UserDTO;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface UserMapper extends BaseMapper<UserDTO> {

}

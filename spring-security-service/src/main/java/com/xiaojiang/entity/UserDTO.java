package com.xiaojiang.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "ad_user")
public class UserDTO {
    @TableId(value = "id")
    private int id;
    private String username;
    private String password;
}

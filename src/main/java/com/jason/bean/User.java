package com.jason.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
//    db_mybatis.users.user_id
//    db_mybatis.users.user_name
//    db_mybatis.users.user_pwd
//    db_mybatis.users.user_realname
//    db_mybatis.users.user_img

    private int userId;
    private String userName;
    private String userPwd;
    private String userRealName;
    private String userImg;

}

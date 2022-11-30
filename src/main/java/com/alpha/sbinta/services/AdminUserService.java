package com.alpha.sbinta.services;

import com.alpha.sbinta.models.AdminUser;

public interface AdminUserService
{
    AdminUser login(String userName, String password);

    AdminUser getUserDetailById(Integer loginUserId);

    Boolean updatePassword(Integer loginUserId, String originalPassword, String newPassword);

    Boolean updateName(Integer loginUserId, String loginUserName, String nickName);

}

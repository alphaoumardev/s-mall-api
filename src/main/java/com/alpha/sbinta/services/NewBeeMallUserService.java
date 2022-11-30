package com.alpha.sbinta.services;

import com.alpha.sbinta.controllers.vo.NewBeeMallUserVO;
import com.alpha.sbinta.models.MallUser;
import com.alpha.sbinta.utils.PageQueryUtil;
import com.alpha.sbinta.utils.PageResult;

import javax.servlet.http.HttpSession;

public interface NewBeeMallUserService
{
    PageResult getNewBeeMallUsersPage(PageQueryUtil pageUtil);

    String register(String loginName, String password);

    String login(String loginName, String passwordMD5, HttpSession httpSession);

    NewBeeMallUserVO updateUserInfo(MallUser mallUser, HttpSession httpSession);

    Boolean lockUsers(Integer[] ids, int lockStatus);
}

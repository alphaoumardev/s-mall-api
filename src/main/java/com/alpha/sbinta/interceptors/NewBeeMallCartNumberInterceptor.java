package com.alpha.sbinta.interceptors;

import com.alpha.sbinta.common.Constants;
import com.alpha.sbinta.controllers.vo.NewBeeMallUserVO;
import com.alpha.sbinta.mappers.NewBeeMallShoppingCartItemMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
@AllArgsConstructor
public class NewBeeMallCartNumberInterceptor implements HandlerInterceptor {

    private final NewBeeMallShoppingCartItemMapper newBeeMallShoppingCartItemMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception
    {
        //购物车中的数量会更改，但是在这些接口中并没有对session中的数据做修改，这里统一处理一下
        if (null != request.getSession() && null != request.getSession().getAttribute(Constants.MALL_USER_SESSION_KEY))
        {
            //如果当前为登陆状态，就查询数据库并设置购物车中的数量值
            NewBeeMallUserVO newBeeMallUserVO = (NewBeeMallUserVO) request.getSession().getAttribute(Constants.MALL_USER_SESSION_KEY);
            //设置购物车中的数量
            newBeeMallUserVO.setShopCartItemCount(newBeeMallShoppingCartItemMapper.selectCountByUserId(newBeeMallUserVO.getUserId()));
            request.getSession().setAttribute(Constants.MALL_USER_SESSION_KEY, newBeeMallUserVO);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

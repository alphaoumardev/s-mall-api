package com.alpha.sbinta.services;

import com.alpha.sbinta.controllers.vo.NewBeeMallOrderDetailVO;
import com.alpha.sbinta.controllers.vo.NewBeeMallOrderItemVO;
import com.alpha.sbinta.controllers.vo.NewBeeMallShoppingCartItemVO;
import com.alpha.sbinta.controllers.vo.NewBeeMallUserVO;
import com.alpha.sbinta.models.NewBeeMallOrder;
import com.alpha.sbinta.utils.PageQueryUtil;
import com.alpha.sbinta.utils.PageResult;

import java.util.List;

public interface NewBeeMallOrderService
{
    PageResult getNewBeeMallOrdersPage(PageQueryUtil pageUtil);

    String updateOrderInfo(NewBeeMallOrder newBeeMallOrder);

    String checkDone(Long[] ids);

    String checkOut(Long[] ids);

    String closeOrder(Long[] ids);

    String saveOrder(NewBeeMallUserVO user, List<NewBeeMallShoppingCartItemVO> myShoppingCartItems);

    NewBeeMallOrderDetailVO getOrderDetailByOrderNo(String orderNo, Long userId);


    NewBeeMallOrder getNewBeeMallOrderByOrderNo(String orderNo);


    PageResult getMyOrders(PageQueryUtil pageUtil);

    String cancelOrder(String orderNo, Long userId);

    String finishOrder(String orderNo, Long userId);

    String paySuccess(String orderNo, int payType);

    List<NewBeeMallOrderItemVO> getOrderItems(Long id);
}

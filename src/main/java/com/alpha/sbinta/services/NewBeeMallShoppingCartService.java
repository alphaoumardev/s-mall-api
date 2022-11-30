package com.alpha.sbinta.services;

import com.alpha.sbinta.controllers.vo.NewBeeMallShoppingCartItemVO;
import com.alpha.sbinta.models.NewBeeMallShoppingCartItem;

import java.util.List;

public interface NewBeeMallShoppingCartService
{
    String saveNewBeeMallCartItem(NewBeeMallShoppingCartItem newBeeMallShoppingCartItem);

    String updateNewBeeMallCartItem(NewBeeMallShoppingCartItem newBeeMallShoppingCartItem);

    NewBeeMallShoppingCartItem getNewBeeMallCartItemById(Long newBeeMallShoppingCartItemId);

    Boolean deleteById(Long shoppingCartItemId, Long userId);

    List<NewBeeMallShoppingCartItemVO> getMyShoppingCartItems(Long newBeeMallUserId);
}

package com.alpha.sbinta.services;

import com.alpha.sbinta.models.NewBeeMallGoods;
import com.alpha.sbinta.utils.PageQueryUtil;
import com.alpha.sbinta.utils.PageResult;

import java.util.List;

public interface NewBeeMallGoodsService
{
    PageResult getNewBeeMallGoodsPage(PageQueryUtil pageUtil);

    String saveNewBeeMallGoods(NewBeeMallGoods goods);

    void batchSaveNewBeeMallGoods(List<NewBeeMallGoods> newBeeMallGoodsList);


    String updateNewBeeMallGoods(NewBeeMallGoods goods);

    NewBeeMallGoods getNewBeeMallGoodsById(Long id);

    Boolean batchUpdateSellStatus(Long[] ids,int sellStatus);

    PageResult searchNewBeeMallGoods(PageQueryUtil pageUtil);
}

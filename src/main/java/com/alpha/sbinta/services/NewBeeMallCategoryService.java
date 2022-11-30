package com.alpha.sbinta.services;

import com.alpha.sbinta.controllers.vo.NewBeeMallIndexCategoryVO;
import com.alpha.sbinta.controllers.vo.SearchPageCategoryVO;
import com.alpha.sbinta.models.GoodsCategory;
import com.alpha.sbinta.utils.PageQueryUtil;
import com.alpha.sbinta.utils.PageResult;

import java.util.List;

public interface NewBeeMallCategoryService
{
    PageResult getCategorisPage(PageQueryUtil pageUtil);

    String saveCategory(GoodsCategory goodsCategory);

    String updateGoodsCategory(GoodsCategory goodsCategory);

    GoodsCategory getGoodsCategoryById(Long id);

    Boolean deleteBatch(Integer[] ids);

    List<NewBeeMallIndexCategoryVO> getCategoriesForIndex();

    SearchPageCategoryVO getCategoriesForSearch(Long categoryId);

    List<GoodsCategory> selectByLevelAndParentIdsAndNumber(List<Long> parentIds, int categoryLevel);
}

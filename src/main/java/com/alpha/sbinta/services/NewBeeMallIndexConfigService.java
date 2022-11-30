package com.alpha.sbinta.services;

import com.alpha.sbinta.controllers.vo.NewBeeMallIndexConfigGoodsVO;
import com.alpha.sbinta.models.IndexConfig;
import com.alpha.sbinta.utils.PageQueryUtil;
import com.alpha.sbinta.utils.PageResult;

import java.util.List;

public interface NewBeeMallIndexConfigService
{
    PageResult getConfigsPage(PageQueryUtil pageUtil);

    String saveIndexConfig(IndexConfig indexConfig);

    String updateIndexConfig(IndexConfig indexConfig);

    IndexConfig getIndexConfigById(Long id);

    List<NewBeeMallIndexConfigGoodsVO> getConfigGoodsesForIndex(int configType, int number);

    Boolean deleteBatch(Long[] ids);
}

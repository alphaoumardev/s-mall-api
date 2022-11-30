package com.alpha.sbinta.services;

import com.alpha.sbinta.controllers.vo.NewBeeMallIndexCarouselVO;
import com.alpha.sbinta.models.Carousel;
import com.alpha.sbinta.utils.PageQueryUtil;
import com.alpha.sbinta.utils.PageResult;

import java.util.List;

public interface NewBeeMallCarouselService {

    PageResult getCarouselPage(PageQueryUtil pageUtil);

    String saveCarousel(Carousel carousel);

    String updateCarousel(Carousel carousel);

    Carousel getCarouselById(Integer id);

    Boolean deleteBatch(Integer[] ids);

    List<NewBeeMallIndexCarouselVO> getCarouselsForIndex(int number);
}

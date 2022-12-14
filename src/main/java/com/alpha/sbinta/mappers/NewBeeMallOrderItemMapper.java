package com.alpha.sbinta.mappers;

import com.alpha.sbinta.models.NewBeeMallOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewBeeMallOrderItemMapper {
    int deleteByPrimaryKey(Long orderItemId);

    int insert(NewBeeMallOrderItem record);

    int insertSelective(NewBeeMallOrderItem record);

    NewBeeMallOrderItem selectByPrimaryKey(Long orderItemId);


    List<NewBeeMallOrderItem> selectByOrderId(Long orderId);


    List<NewBeeMallOrderItem> selectByOrderIds(@Param("orderIds") List<Long> orderIds);

    int insertBatch(@Param("orderItems") List<NewBeeMallOrderItem> orderItems);

    int updateByPrimaryKeySelective(NewBeeMallOrderItem record);

    int updateByPrimaryKey(NewBeeMallOrderItem record);
}
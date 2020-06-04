package com.sj.mall.order.dao;

import com.sj.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author shuaiju
 * @email shuaiju@gmail.comu
 * @date 2020-06-04 18:45:38
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

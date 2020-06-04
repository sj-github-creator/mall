package com.sj.mall.coupon.dao;

import com.sj.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author shuaiju
 * @email shuaiju@gmail.com
 * @date 2020-06-04 17:46:59
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

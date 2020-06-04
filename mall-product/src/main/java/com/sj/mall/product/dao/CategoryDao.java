package com.sj.mall.product.dao;

import com.sj.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author shuaiju
 * @email shuaiju@gmail.com
 * @date 2020-06-04 13:36:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

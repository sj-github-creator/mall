package com.sj.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sj.common.utils.PageUtils;
import com.sj.mall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author shuaiju
 * @email shuaiju@gmail.com
 * @date 2020-06-04 13:36:11
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

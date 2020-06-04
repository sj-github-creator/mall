package com.sj.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sj.common.utils.PageUtils;
import com.sj.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author shuaiju
 * @email shuaiju@gmail.com
 * @date 2020-06-04 13:36:11
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


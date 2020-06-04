package com.sj.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.sj.mall.product.entity.BrandEntity;
import com.sj.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("国产强劲品牌");
        brandService.save(brandEntity);
        System.out.println("保存成功。。。。。");
//        List<BrandEntity> list=brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
//
//        for(BrandEntity item :list){
//            System.out.println(item);
//        }
    }

}

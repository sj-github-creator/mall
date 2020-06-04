package com.sj.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sj.common.utils.PageUtils;
import com.sj.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author shuaiju
 * @email shuaiju@gmail.comu
 * @date 2020-06-04 18:22:53
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


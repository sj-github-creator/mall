package com.sj.mall.member.dao;

import com.sj.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author shuaiju
 * @email shuaiju@gmail.comu
 * @date 2020-06-04 18:22:53
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

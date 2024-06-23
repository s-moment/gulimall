package com.bsl.mall.member.dao;

import com.bsl.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author moment
 * @email moment@gmail.com
 * @date 2024-06-23 10:09:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

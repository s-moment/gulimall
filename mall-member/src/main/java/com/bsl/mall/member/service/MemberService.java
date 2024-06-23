package com.bsl.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsl.common.utils.PageUtils;
import com.bsl.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author moment
 * @email moment@gmail.com
 * @date 2024-06-23 10:09:08
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


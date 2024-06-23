package com.bsl.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bsl.common.utils.PageUtils;
import com.bsl.mall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author moment
 * @email moment@gmail.com
 * @date 2024-06-22 11:27:55
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


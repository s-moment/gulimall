package com.bsl.mall.ware.service;

import com.bsl.mall.ware.vo.MergeVo;
import com.bsl.mall.ware.vo.PurchaseDoneVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bsl.common.utils.PageUtils;
import com.bsl.mall.ware.entity.PurchaseEntity;

import java.util.List;
import java.util.Map;

/**
 * 采购信息
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-11-17 13:50:10
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPageUnreceivePurchase(Map<String, Object> params);


    void mergePurchase(MergeVo mergeVo);


    void received(List<Long> ids);


    void done(PurchaseDoneVo doneVo);


}


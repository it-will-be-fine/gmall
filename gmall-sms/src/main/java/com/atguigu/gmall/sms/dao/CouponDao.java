package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author milk
 * @email lxf@atguigu.com
 * @date 2020-11-29 03:35:01
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

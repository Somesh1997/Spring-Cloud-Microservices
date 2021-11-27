package com.somesh.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.somesh.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {
	public Coupon findByCode(String code);
}

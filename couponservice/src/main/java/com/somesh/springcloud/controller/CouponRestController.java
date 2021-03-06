package com.somesh.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.somesh.springcloud.model.Coupon;
import com.somesh.springcloud.repos.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

	@Autowired
	private CouponRepo couponRepo;

	@PostMapping("/coupons")
	public Coupon createCoupon(@RequestBody Coupon coupon) {
		System.out.println(coupon.getCode());
		return couponRepo.save(coupon);
	}

	@GetMapping("/coupon/{code}")
	public Coupon getCoupon(@PathVariable String code) {
		return couponRepo.findByCode(code);
	}

}

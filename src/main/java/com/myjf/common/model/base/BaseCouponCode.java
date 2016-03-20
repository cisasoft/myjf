package com.myjf.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCouponCode<M extends BaseCouponCode<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}

	public java.util.Date getCreateDate() {
		return get("create_date");
	}

	public void setModifyDate(java.util.Date modifyDate) {
		set("modify_date", modifyDate);
	}

	public java.util.Date getModifyDate() {
		return get("modify_date");
	}

	public void setCode(java.lang.String code) {
		set("code", code);
	}

	public java.lang.String getCode() {
		return get("code");
	}

	public void setIsUsed(java.lang.Boolean isUsed) {
		set("is_used", isUsed);
	}

	public java.lang.Boolean getIsUsed() {
		return get("is_used");
	}

	public void setUsedDate(java.util.Date usedDate) {
		set("used_date", usedDate);
	}

	public java.util.Date getUsedDate() {
		return get("used_date");
	}

	public void setCoupon(java.lang.Long coupon) {
		set("coupon", coupon);
	}

	public java.lang.Long getCoupon() {
		return get("coupon");
	}

	public void setMember(java.lang.Long member) {
		set("member", member);
	}

	public java.lang.Long getMember() {
		return get("member");
	}

}

package com.myjf.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGiftItem<M extends BaseGiftItem<M>> extends Model<M> implements IBean {

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

	public void setQuantity(java.lang.Integer quantity) {
		set("quantity", quantity);
	}

	public java.lang.Integer getQuantity() {
		return get("quantity");
	}

	public void setGift(java.lang.Long gift) {
		set("gift", gift);
	}

	public java.lang.Long getGift() {
		return get("gift");
	}

	public void setPromotion(java.lang.Long promotion) {
		set("promotion", promotion);
	}

	public java.lang.Long getPromotion() {
		return get("promotion");
	}

}

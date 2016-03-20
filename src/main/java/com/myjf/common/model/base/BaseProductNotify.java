package com.myjf.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProductNotify<M extends BaseProductNotify<M>> extends Model<M> implements IBean {

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

	public void setEmail(java.lang.String email) {
		set("email", email);
	}

	public java.lang.String getEmail() {
		return get("email");
	}

	public void setHasSent(java.lang.Boolean hasSent) {
		set("has_sent", hasSent);
	}

	public java.lang.Boolean getHasSent() {
		return get("has_sent");
	}

	public void setMember(java.lang.Long member) {
		set("member", member);
	}

	public java.lang.Long getMember() {
		return get("member");
	}

	public void setProduct(java.lang.Long product) {
		set("product", product);
	}

	public java.lang.Long getProduct() {
		return get("product");
	}

}

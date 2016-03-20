package com.myjf.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDeliveryCenter<M extends BaseDeliveryCenter<M>> extends Model<M> implements IBean {

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

	public void setAddress(java.lang.String address) {
		set("address", address);
	}

	public java.lang.String getAddress() {
		return get("address");
	}

	public void setAreaName(java.lang.String areaName) {
		set("area_name", areaName);
	}

	public java.lang.String getAreaName() {
		return get("area_name");
	}

	public void setContact(java.lang.String contact) {
		set("contact", contact);
	}

	public java.lang.String getContact() {
		return get("contact");
	}

	public void setIsDefault(java.lang.Boolean isDefault) {
		set("is_default", isDefault);
	}

	public java.lang.Boolean getIsDefault() {
		return get("is_default");
	}

	public void setMemo(java.lang.String memo) {
		set("memo", memo);
	}

	public java.lang.String getMemo() {
		return get("memo");
	}

	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}

	public java.lang.String getMobile() {
		return get("mobile");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}

	public java.lang.String getPhone() {
		return get("phone");
	}

	public void setZipCode(java.lang.String zipCode) {
		set("zip_code", zipCode);
	}

	public java.lang.String getZipCode() {
		return get("zip_code");
	}

	public void setArea(java.lang.Long area) {
		set("area", area);
	}

	public java.lang.Long getArea() {
		return get("area");
	}

}

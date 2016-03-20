package com.myjf.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseArea<M extends BaseArea<M>> extends Model<M> implements IBean {

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

	public void setOrders(java.lang.Integer orders) {
		set("orders", orders);
	}

	public java.lang.Integer getOrders() {
		return get("orders");
	}

	public void setFullName(java.lang.String fullName) {
		set("full_name", fullName);
	}

	public java.lang.String getFullName() {
		return get("full_name");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setTreePath(java.lang.String treePath) {
		set("tree_path", treePath);
	}

	public java.lang.String getTreePath() {
		return get("tree_path");
	}

	public void setParent(java.lang.Long parent) {
		set("parent", parent);
	}

	public java.lang.Long getParent() {
		return get("parent");
	}

}
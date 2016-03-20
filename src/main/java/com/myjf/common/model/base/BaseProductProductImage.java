package com.myjf.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProductProductImage<M extends BaseProductProductImage<M>> extends Model<M> implements IBean {

	public void setProduct(java.lang.Long product) {
		set("product", product);
	}

	public java.lang.Long getProduct() {
		return get("product");
	}

	public void setLarge(java.lang.String large) {
		set("large", large);
	}

	public java.lang.String getLarge() {
		return get("large");
	}

	public void setMedium(java.lang.String medium) {
		set("medium", medium);
	}

	public java.lang.String getMedium() {
		return get("medium");
	}

	public void setOrders(java.lang.Integer orders) {
		set("orders", orders);
	}

	public java.lang.Integer getOrders() {
		return get("orders");
	}

	public void setSource(java.lang.String source) {
		set("source", source);
	}

	public java.lang.String getSource() {
		return get("source");
	}

	public void setThumbnail(java.lang.String thumbnail) {
		set("thumbnail", thumbnail);
	}

	public java.lang.String getThumbnail() {
		return get("thumbnail");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}

	public java.lang.String getTitle() {
		return get("title");
	}

}
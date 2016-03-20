package com.myjf.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("xx_ad", "id", Ad.class);
		arp.addMapping("xx_ad_position", "id", AdPosition.class);
		arp.addMapping("xx_admin", "id", Admin.class);
		// Composite Primary Key order: admins,roles
		arp.addMapping("xx_admin_role", "admins,roles", AdminRole.class);
		arp.addMapping("xx_area", "id", Area.class);
		arp.addMapping("xx_article", "id", Article.class);
		arp.addMapping("xx_article_category", "id", ArticleCategory.class);
		// Composite Primary Key order: articles,tags
		arp.addMapping("xx_article_tag", "articles,tags", ArticleTag.class);
		arp.addMapping("xx_attribute", "id", Attribute.class);
		arp.addMapping("xx_attribute_option", "", AttributeOption.class);
		arp.addMapping("xx_brand", "id", Brand.class);
		arp.addMapping("xx_cart", "id", Cart.class);
		arp.addMapping("xx_cart_item", "id", CartItem.class);
		arp.addMapping("xx_consultation", "id", Consultation.class);
		arp.addMapping("xx_coupon", "id", Coupon.class);
		arp.addMapping("xx_coupon_code", "id", CouponCode.class);
		arp.addMapping("xx_delivery_center", "id", DeliveryCenter.class);
		arp.addMapping("xx_delivery_corp", "id", DeliveryCorp.class);
		arp.addMapping("xx_delivery_template", "id", DeliveryTemplate.class);
		arp.addMapping("xx_deposit", "id", Deposit.class);
		arp.addMapping("xx_friend_link", "id", FriendLink.class);
		arp.addMapping("xx_gift_item", "id", GiftItem.class);
		arp.addMapping("xx_goods", "id", Goods.class);
		arp.addMapping("xx_log", "id", Log.class);
		arp.addMapping("xx_member", "id", Member.class);
		arp.addMapping("xx_member_attribute", "id", MemberAttribute.class);
		arp.addMapping("xx_member_attribute_option", "", MemberAttributeOption.class);
		// Composite Primary Key order: favorite_members,favorite_products
		arp.addMapping("xx_member_favorite_product", "favorite_members,favorite_products", MemberFavoriteProduct.class);
		arp.addMapping("xx_member_rank", "id", MemberRank.class);
		arp.addMapping("xx_message", "id", Message.class);
		arp.addMapping("xx_navigation", "id", Navigation.class);
		arp.addMapping("xx_order", "id", Order.class);
		arp.addMapping("xx_order_coupon", "", OrderCoupon.class);
		arp.addMapping("xx_order_item", "id", OrderItem.class);
		arp.addMapping("xx_order_log", "id", OrderLog.class);
		arp.addMapping("xx_parameter", "id", Parameter.class);
		arp.addMapping("xx_parameter_group", "id", ParameterGroup.class);
		arp.addMapping("xx_payment", "id", Payment.class);
		arp.addMapping("xx_payment_method", "id", PaymentMethod.class);
		// Composite Primary Key order: payment_methods,shipping_methods
		arp.addMapping("xx_payment_shipping_method", "payment_methods,shipping_methods", PaymentShippingMethod.class);
		arp.addMapping("xx_plugin_config", "id", PluginConfig.class);
		// Composite Primary Key order: name,plugin_config
		arp.addMapping("xx_plugin_config_attribute", "name,plugin_config", PluginConfigAttribute.class);
		arp.addMapping("xx_product", "id", Product.class);
		arp.addMapping("xx_product_category", "id", ProductCategory.class);
		// Composite Primary Key order: brands,product_categories
		arp.addMapping("xx_product_category_brand", "brands,product_categories", ProductCategoryBrand.class);
		// Composite Primary Key order: member_price_key,product
		arp.addMapping("xx_product_member_price", "member_price_key,product", ProductMemberPrice.class);
		arp.addMapping("xx_product_notify", "id", ProductNotify.class);
		// Composite Primary Key order: parameter_value_key,product
		arp.addMapping("xx_product_parameter_value", "parameter_value_key,product", ProductParameterValue.class);
		arp.addMapping("xx_product_product_image", "", ProductProductImage.class);
		// Composite Primary Key order: products,specifications
		arp.addMapping("xx_product_specification", "products,specifications", ProductSpecification.class);
		// Composite Primary Key order: products,specification_values
		arp.addMapping("xx_product_specification_value", "products,specification_values", ProductSpecificationValue.class);
		// Composite Primary Key order: products,tags
		arp.addMapping("xx_product_tag", "products,tags", ProductTag.class);
		arp.addMapping("xx_promotion", "id", Promotion.class);
		// Composite Primary Key order: brands,promotions
		arp.addMapping("xx_promotion_brand", "brands,promotions", PromotionBrand.class);
		// Composite Primary Key order: coupons,promotions
		arp.addMapping("xx_promotion_coupon", "coupons,promotions", PromotionCoupon.class);
		// Composite Primary Key order: member_ranks,promotions
		arp.addMapping("xx_promotion_member_rank", "member_ranks,promotions", PromotionMemberRank.class);
		// Composite Primary Key order: products,promotions
		arp.addMapping("xx_promotion_product", "products,promotions", PromotionProduct.class);
		// Composite Primary Key order: product_categories,promotions
		arp.addMapping("xx_promotion_product_category", "product_categories,promotions", PromotionProductCategory.class);
		arp.addMapping("xx_receiver", "id", Receiver.class);
		arp.addMapping("xx_refunds", "id", Refunds.class);
		arp.addMapping("xx_returns", "id", Returns.class);
		arp.addMapping("xx_returns_item", "id", ReturnsItem.class);
		arp.addMapping("xx_review", "id", Review.class);
		arp.addMapping("xx_role", "id", Role.class);
		arp.addMapping("xx_role_authority", "", RoleAuthority.class);
		arp.addMapping("xx_seo", "id", Seo.class);
		arp.addMapping("xx_shipping", "id", Shipping.class);
		arp.addMapping("xx_shipping_item", "id", ShippingItem.class);
		arp.addMapping("xx_shipping_method", "id", ShippingMethod.class);
		arp.addMapping("xx_sn", "id", Sn.class);
		arp.addMapping("xx_specification", "id", Specification.class);
		arp.addMapping("xx_specification_value", "id", SpecificationValue.class);
		arp.addMapping("xx_tag", "id", Tag.class);
	}
}

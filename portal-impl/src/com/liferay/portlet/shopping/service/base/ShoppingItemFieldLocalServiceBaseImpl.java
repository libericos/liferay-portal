/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.shopping.service.base;

import com.liferay.portal.PortalException;
import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;

import com.liferay.portlet.shopping.model.ShoppingItemField;
import com.liferay.portlet.shopping.service.ShoppingCartLocalService;
import com.liferay.portlet.shopping.service.ShoppingCategoryLocalService;
import com.liferay.portlet.shopping.service.ShoppingCategoryService;
import com.liferay.portlet.shopping.service.ShoppingCouponLocalService;
import com.liferay.portlet.shopping.service.ShoppingCouponService;
import com.liferay.portlet.shopping.service.ShoppingItemFieldLocalService;
import com.liferay.portlet.shopping.service.ShoppingItemLocalService;
import com.liferay.portlet.shopping.service.ShoppingItemPriceLocalService;
import com.liferay.portlet.shopping.service.ShoppingItemService;
import com.liferay.portlet.shopping.service.ShoppingOrderItemLocalService;
import com.liferay.portlet.shopping.service.ShoppingOrderLocalService;
import com.liferay.portlet.shopping.service.ShoppingOrderService;
import com.liferay.portlet.shopping.service.persistence.ShoppingCartPersistence;
import com.liferay.portlet.shopping.service.persistence.ShoppingCategoryPersistence;
import com.liferay.portlet.shopping.service.persistence.ShoppingCouponFinder;
import com.liferay.portlet.shopping.service.persistence.ShoppingCouponPersistence;
import com.liferay.portlet.shopping.service.persistence.ShoppingItemFieldPersistence;
import com.liferay.portlet.shopping.service.persistence.ShoppingItemFinder;
import com.liferay.portlet.shopping.service.persistence.ShoppingItemPersistence;
import com.liferay.portlet.shopping.service.persistence.ShoppingItemPricePersistence;
import com.liferay.portlet.shopping.service.persistence.ShoppingOrderFinder;
import com.liferay.portlet.shopping.service.persistence.ShoppingOrderItemPersistence;
import com.liferay.portlet.shopping.service.persistence.ShoppingOrderPersistence;

import java.util.List;

/**
 * <a href="ShoppingItemFieldLocalServiceBaseImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public abstract class ShoppingItemFieldLocalServiceBaseImpl
	implements ShoppingItemFieldLocalService {
	public ShoppingItemField addShoppingItemField(
		ShoppingItemField shoppingItemField) throws SystemException {
		shoppingItemField.setNew(true);

		return shoppingItemFieldPersistence.update(shoppingItemField, false);
	}

	public ShoppingItemField createShoppingItemField(long itemFieldId) {
		return shoppingItemFieldPersistence.create(itemFieldId);
	}

	public void deleteShoppingItemField(long itemFieldId)
		throws PortalException, SystemException {
		shoppingItemFieldPersistence.remove(itemFieldId);
	}

	public void deleteShoppingItemField(ShoppingItemField shoppingItemField)
		throws SystemException {
		shoppingItemFieldPersistence.remove(shoppingItemField);
	}

	public List<Object> dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return shoppingItemFieldPersistence.findWithDynamicQuery(dynamicQuery);
	}

	public List<Object> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) throws SystemException {
		return shoppingItemFieldPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	public ShoppingItemField getShoppingItemField(long itemFieldId)
		throws PortalException, SystemException {
		return shoppingItemFieldPersistence.findByPrimaryKey(itemFieldId);
	}

	public List<ShoppingItemField> getShoppingItemFields(int start, int end)
		throws SystemException {
		return shoppingItemFieldPersistence.findAll(start, end);
	}

	public int getShoppingItemFieldsCount() throws SystemException {
		return shoppingItemFieldPersistence.countAll();
	}

	public ShoppingItemField updateShoppingItemField(
		ShoppingItemField shoppingItemField) throws SystemException {
		shoppingItemField.setNew(false);

		return shoppingItemFieldPersistence.update(shoppingItemField, true);
	}

	public ShoppingCartLocalService getShoppingCartLocalService() {
		return shoppingCartLocalService;
	}

	public void setShoppingCartLocalService(
		ShoppingCartLocalService shoppingCartLocalService) {
		this.shoppingCartLocalService = shoppingCartLocalService;
	}

	public ShoppingCartPersistence getShoppingCartPersistence() {
		return shoppingCartPersistence;
	}

	public void setShoppingCartPersistence(
		ShoppingCartPersistence shoppingCartPersistence) {
		this.shoppingCartPersistence = shoppingCartPersistence;
	}

	public ShoppingCategoryLocalService getShoppingCategoryLocalService() {
		return shoppingCategoryLocalService;
	}

	public void setShoppingCategoryLocalService(
		ShoppingCategoryLocalService shoppingCategoryLocalService) {
		this.shoppingCategoryLocalService = shoppingCategoryLocalService;
	}

	public ShoppingCategoryService getShoppingCategoryService() {
		return shoppingCategoryService;
	}

	public void setShoppingCategoryService(
		ShoppingCategoryService shoppingCategoryService) {
		this.shoppingCategoryService = shoppingCategoryService;
	}

	public ShoppingCategoryPersistence getShoppingCategoryPersistence() {
		return shoppingCategoryPersistence;
	}

	public void setShoppingCategoryPersistence(
		ShoppingCategoryPersistence shoppingCategoryPersistence) {
		this.shoppingCategoryPersistence = shoppingCategoryPersistence;
	}

	public ShoppingCouponLocalService getShoppingCouponLocalService() {
		return shoppingCouponLocalService;
	}

	public void setShoppingCouponLocalService(
		ShoppingCouponLocalService shoppingCouponLocalService) {
		this.shoppingCouponLocalService = shoppingCouponLocalService;
	}

	public ShoppingCouponService getShoppingCouponService() {
		return shoppingCouponService;
	}

	public void setShoppingCouponService(
		ShoppingCouponService shoppingCouponService) {
		this.shoppingCouponService = shoppingCouponService;
	}

	public ShoppingCouponPersistence getShoppingCouponPersistence() {
		return shoppingCouponPersistence;
	}

	public void setShoppingCouponPersistence(
		ShoppingCouponPersistence shoppingCouponPersistence) {
		this.shoppingCouponPersistence = shoppingCouponPersistence;
	}

	public ShoppingCouponFinder getShoppingCouponFinder() {
		return shoppingCouponFinder;
	}

	public void setShoppingCouponFinder(
		ShoppingCouponFinder shoppingCouponFinder) {
		this.shoppingCouponFinder = shoppingCouponFinder;
	}

	public ShoppingItemLocalService getShoppingItemLocalService() {
		return shoppingItemLocalService;
	}

	public void setShoppingItemLocalService(
		ShoppingItemLocalService shoppingItemLocalService) {
		this.shoppingItemLocalService = shoppingItemLocalService;
	}

	public ShoppingItemService getShoppingItemService() {
		return shoppingItemService;
	}

	public void setShoppingItemService(ShoppingItemService shoppingItemService) {
		this.shoppingItemService = shoppingItemService;
	}

	public ShoppingItemPersistence getShoppingItemPersistence() {
		return shoppingItemPersistence;
	}

	public void setShoppingItemPersistence(
		ShoppingItemPersistence shoppingItemPersistence) {
		this.shoppingItemPersistence = shoppingItemPersistence;
	}

	public ShoppingItemFinder getShoppingItemFinder() {
		return shoppingItemFinder;
	}

	public void setShoppingItemFinder(ShoppingItemFinder shoppingItemFinder) {
		this.shoppingItemFinder = shoppingItemFinder;
	}

	public ShoppingItemFieldLocalService getShoppingItemFieldLocalService() {
		return shoppingItemFieldLocalService;
	}

	public void setShoppingItemFieldLocalService(
		ShoppingItemFieldLocalService shoppingItemFieldLocalService) {
		this.shoppingItemFieldLocalService = shoppingItemFieldLocalService;
	}

	public ShoppingItemFieldPersistence getShoppingItemFieldPersistence() {
		return shoppingItemFieldPersistence;
	}

	public void setShoppingItemFieldPersistence(
		ShoppingItemFieldPersistence shoppingItemFieldPersistence) {
		this.shoppingItemFieldPersistence = shoppingItemFieldPersistence;
	}

	public ShoppingItemPriceLocalService getShoppingItemPriceLocalService() {
		return shoppingItemPriceLocalService;
	}

	public void setShoppingItemPriceLocalService(
		ShoppingItemPriceLocalService shoppingItemPriceLocalService) {
		this.shoppingItemPriceLocalService = shoppingItemPriceLocalService;
	}

	public ShoppingItemPricePersistence getShoppingItemPricePersistence() {
		return shoppingItemPricePersistence;
	}

	public void setShoppingItemPricePersistence(
		ShoppingItemPricePersistence shoppingItemPricePersistence) {
		this.shoppingItemPricePersistence = shoppingItemPricePersistence;
	}

	public ShoppingOrderLocalService getShoppingOrderLocalService() {
		return shoppingOrderLocalService;
	}

	public void setShoppingOrderLocalService(
		ShoppingOrderLocalService shoppingOrderLocalService) {
		this.shoppingOrderLocalService = shoppingOrderLocalService;
	}

	public ShoppingOrderService getShoppingOrderService() {
		return shoppingOrderService;
	}

	public void setShoppingOrderService(
		ShoppingOrderService shoppingOrderService) {
		this.shoppingOrderService = shoppingOrderService;
	}

	public ShoppingOrderPersistence getShoppingOrderPersistence() {
		return shoppingOrderPersistence;
	}

	public void setShoppingOrderPersistence(
		ShoppingOrderPersistence shoppingOrderPersistence) {
		this.shoppingOrderPersistence = shoppingOrderPersistence;
	}

	public ShoppingOrderFinder getShoppingOrderFinder() {
		return shoppingOrderFinder;
	}

	public void setShoppingOrderFinder(ShoppingOrderFinder shoppingOrderFinder) {
		this.shoppingOrderFinder = shoppingOrderFinder;
	}

	public ShoppingOrderItemLocalService getShoppingOrderItemLocalService() {
		return shoppingOrderItemLocalService;
	}

	public void setShoppingOrderItemLocalService(
		ShoppingOrderItemLocalService shoppingOrderItemLocalService) {
		this.shoppingOrderItemLocalService = shoppingOrderItemLocalService;
	}

	public ShoppingOrderItemPersistence getShoppingOrderItemPersistence() {
		return shoppingOrderItemPersistence;
	}

	public void setShoppingOrderItemPersistence(
		ShoppingOrderItemPersistence shoppingOrderItemPersistence) {
		this.shoppingOrderItemPersistence = shoppingOrderItemPersistence;
	}

	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.ShoppingCartLocalService.impl")
	protected ShoppingCartLocalService shoppingCartLocalService;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.persistence.ShoppingCartPersistence.impl")
	protected ShoppingCartPersistence shoppingCartPersistence;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.ShoppingCategoryLocalService.impl")
	protected ShoppingCategoryLocalService shoppingCategoryLocalService;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.ShoppingCategoryService.impl")
	protected ShoppingCategoryService shoppingCategoryService;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.persistence.ShoppingCategoryPersistence.impl")
	protected ShoppingCategoryPersistence shoppingCategoryPersistence;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.ShoppingCouponLocalService.impl")
	protected ShoppingCouponLocalService shoppingCouponLocalService;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.ShoppingCouponService.impl")
	protected ShoppingCouponService shoppingCouponService;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.persistence.ShoppingCouponPersistence.impl")
	protected ShoppingCouponPersistence shoppingCouponPersistence;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.persistence.ShoppingCouponFinder.impl")
	protected ShoppingCouponFinder shoppingCouponFinder;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.ShoppingItemLocalService.impl")
	protected ShoppingItemLocalService shoppingItemLocalService;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.ShoppingItemService.impl")
	protected ShoppingItemService shoppingItemService;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.persistence.ShoppingItemPersistence.impl")
	protected ShoppingItemPersistence shoppingItemPersistence;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.persistence.ShoppingItemFinder.impl")
	protected ShoppingItemFinder shoppingItemFinder;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.ShoppingItemFieldLocalService.impl")
	protected ShoppingItemFieldLocalService shoppingItemFieldLocalService;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.persistence.ShoppingItemFieldPersistence.impl")
	protected ShoppingItemFieldPersistence shoppingItemFieldPersistence;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.ShoppingItemPriceLocalService.impl")
	protected ShoppingItemPriceLocalService shoppingItemPriceLocalService;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.persistence.ShoppingItemPricePersistence.impl")
	protected ShoppingItemPricePersistence shoppingItemPricePersistence;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.ShoppingOrderLocalService.impl")
	protected ShoppingOrderLocalService shoppingOrderLocalService;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.ShoppingOrderService.impl")
	protected ShoppingOrderService shoppingOrderService;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.persistence.ShoppingOrderPersistence.impl")
	protected ShoppingOrderPersistence shoppingOrderPersistence;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.persistence.ShoppingOrderFinder.impl")
	protected ShoppingOrderFinder shoppingOrderFinder;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.ShoppingOrderItemLocalService.impl")
	protected ShoppingOrderItemLocalService shoppingOrderItemLocalService;
	@com.liferay.portal.kernel.annotation.BeanReference(name = "com.liferay.portlet.shopping.service.persistence.ShoppingOrderItemPersistence.impl")
	protected ShoppingOrderItemPersistence shoppingOrderItemPersistence;
}
package com.mm.repositories;

import com.mm.model.ProductTypeCategory;

public class ProductTypeCategoryRepository extends HibernateGenericDAO<ProductTypeCategory>{

	private static final long serialVersionUID = -1979144674094224425L;

	@Override
	protected Class<ProductTypeCategory> getDomainClass() {
		return ProductTypeCategory.class;
	}

}

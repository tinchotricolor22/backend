package com.mm.repositories;

import com.mm.model.ProductType;

public class ProductTypeRepository extends HibernateGenericDAO<ProductType>{

	private static final long serialVersionUID = -1979144674094224425L;

	@Override
	protected Class<ProductType> getDomainClass() {
		return ProductType.class;
	}

}

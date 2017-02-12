package com.mm.repositories;

import com.mm.model.Product;

public class ProductRepository extends HibernateGenericDAO<Product>{

	private static final long serialVersionUID = -1979144674094224425L;

	@Override
	protected Class<Product> getDomainClass() {
		return Product.class;
	}

}

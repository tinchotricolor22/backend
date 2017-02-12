package com.mm.repositories;

import com.mm.model.TradeMark;

public class TradeMarkRepository extends HibernateGenericDAO<TradeMark>{

	private static final long serialVersionUID = -1979144674094224425L;

	@Override
	protected Class<TradeMark> getDomainClass() {
		return TradeMark.class;
	}

}

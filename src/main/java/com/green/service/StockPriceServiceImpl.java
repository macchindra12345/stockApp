package com.green.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.entity.StockPriceEntity;
import com.green.exception.CompanyNotFoundException;
import com.green.repository.IStockPriceRepository;
@Service
public class StockPriceServiceImpl implements IStockPriceService {

	@Autowired
	private IStockPriceRepository stockPriceRepository;

	public Double getStockPrice(String stockCompanyName) {

		StockPriceEntity stockPrice = stockPriceRepository.findBystockCompanyName(stockCompanyName);
		if (stockPrice == null) {
			throw new CompanyNotFoundException("Company Not Available,plz provide valid credential");
		} else
			return stockPrice.getStockCompanyPrise();
	}


}

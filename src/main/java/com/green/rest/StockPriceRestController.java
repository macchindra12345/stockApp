package com.green.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.green.service.IStockPriceService;

@RestController

public class StockPriceRestController {
	@Autowired
	private IStockPriceService stockPriceService;

    @GetMapping(value="/stockprice/{stockCompanyName}")
	public ResponseEntity<Double> stockPrice(@PathVariable("stockCompanyName") String stockCompanyName ){
		Double stockPrice=stockPriceService.getStockPrice(stockCompanyName);
		return new ResponseEntity<Double>(stockPrice,HttpStatus.OK);
	}
}

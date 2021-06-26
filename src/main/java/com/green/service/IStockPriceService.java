package com.green.service;

import org.springframework.stereotype.Service;

@Service
public interface IStockPriceService {
public Double getStockPrice(String stockCompanyName);
}

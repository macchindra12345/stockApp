package com.green.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.green.entity.StockPriceEntity;
@Repository
public interface IStockPriceRepository extends JpaRepository<StockPriceEntity,Serializable> {
public StockPriceEntity findBystockCompanyName(String stockCompanyName);
}

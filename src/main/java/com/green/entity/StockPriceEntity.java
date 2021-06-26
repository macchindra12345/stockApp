package com.green.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STOCK_PRICE")
public class StockPriceEntity {
@Id
@Column(name="STOCK_ID")
private Integer stockId;
@Column(name="STOCK_COMPANY_NAME")
private String stockCompanyName;
@Column(name="STOCK_COMPANY_PRICE")
private Double  stockCompanyPrise;

public Integer getStockId() {
	return stockId;
}
public void setStockId(Integer stockId) {
	this.stockId = stockId;
}
public String getStockCompanyName() {
	return stockCompanyName;
}
public void setStockCompanyName(String stockCompanyName) {
	this.stockCompanyName = stockCompanyName;
}
public Double getStockCompanyPrise() {
	return stockCompanyPrise;
}
public void setStockCompanyPrise(Double stockCompanyPrise) {
	this.stockCompanyPrise = stockCompanyPrise;
}
@Override
public String toString() {
	return "StockPriceEntity [stockId=" + stockId + ", stockCompanyName=" + stockCompanyName + ", stockCompanyPrise="
			+ stockCompanyPrise + "]";
}

}

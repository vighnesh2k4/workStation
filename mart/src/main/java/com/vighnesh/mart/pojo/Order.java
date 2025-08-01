package com.vighnesh.mart.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
	public enum Status{
		COMPLETED,
		CANCELLED
	}
	private int order_id;
	private int user_id;
	private BigDecimal total_amount;
	private Status status;
	private Timestamp order_date;
	private List<OrderItems> items;
}

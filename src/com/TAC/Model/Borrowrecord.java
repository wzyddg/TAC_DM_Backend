package com.TAC.Model;

// Generated 2015-8-30 16:35:56 by Hibernate Tools 4.3.1

import java.util.Date;

/**
 * Borrowrecord generated by hbm2java
 */
public class Borrowrecord implements java.io.Serializable {

	public Integer recordId;
	public String borrowerName;
	public String tele;
	public Integer itemId;
	public String itemName;
	public String itemInfo;
	public Date borrowDate;
	public Date returnDate;
	public int number;

	public Borrowrecord() {
	}

	public Borrowrecord(String borrowerName, String tele, int itemId,
			String itemName, String itemInfo, Date borrowDate, Date returnDate,
			int number) {
		this.borrowerName = borrowerName;
		this.tele = tele;
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemInfo = itemInfo;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.number = number;
	}

	public Integer getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public String getBorrowerName() {
		return this.borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public String getTele() {
		return this.tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemInfo() {
		return this.itemInfo;
	}

	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
	}

	public Date getBorrowDate() {
		return this.borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}

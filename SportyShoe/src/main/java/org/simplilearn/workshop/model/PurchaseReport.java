package org.simplilearn.workshop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table
public class PurchaseReport {
	
	

	public PurchaseReport(int id, String purchasedBy, String category, Date dop, String orderList) {
		super();
		this.id = id;
		this.purchasedBy = purchasedBy;
		this.category = category;
		this.dop = dop;
		this.orderList = orderList;
	}

	@Id
	@GeneratedValue
	private int id;
	private String purchasedBy; // This can be extended to utilize one to one relation with User Table [Future Implemetations]
	private String category;
	
	@Temporal(TemporalType.DATE)
	private Date dop;
	
	String orderList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPurchasedBy() {
		return purchasedBy;
	}

	public void setPurchasedBy(String purchasedBy) {
		this.purchasedBy = purchasedBy;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getDop() {
		return dop;
	}

	public void setDop(Date dop) {
		this.dop = dop;
	}

	@Override
	public String toString() {
		return String.format("PurchaseReport [id=%s, purchasedBy=%s, category=%s, dop=%s]", id, purchasedBy, category,
				dop);
	}

	public PurchaseReport() {
		super();
	}
	

	
}
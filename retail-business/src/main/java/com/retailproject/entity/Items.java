package com.retailproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "items")
public class Items {
	
	@Id
	@GenericGenerator(name = "id",strategy = "increment")
	private int id;
	
	@Column(name = "itemname")
	private String itemname;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "retailername")
	private String retailername;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRetailername() {
		return retailername;
	}

	public void setRetailername(String retailername) {
		this.retailername = retailername;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", itemname=" + itemname + ", type=" + type + ", retailername=" + retailername + "]";
	}
	
	
}

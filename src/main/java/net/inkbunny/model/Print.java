package net.inkbunny.model;

import java.util.Map;
import java.util.HashMap;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Entity bean for JSON bindings
 */
public class Print {

	/*
	 * Bean properties
	 */

	@JsonProperty("print_size_id")
	private Integer printSizeId;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("price")
	private Float price;
	
	@JsonProperty("price_owner_discount")
	private Float priceOwnerDiscount;

	/*
	 * Default constructor
	 */

	public Print(){}

	/*
	 * Getters and Setters
	 */

	public Integer getPrintSizeId() {
		return this.printSizeId;
	}
	
	public void setPrintSizeId( Integer printSizeId ) {
		this.printSizeId = printSizeId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription( String description ) {
		this.description = description;
	}
	
	public Float getPrice() {
		return this.price;
	}
	
	public void setPrice( Float price ) {
		this.price = price;
	}
	
	public Float getPriceOwnerDiscount() {
		return this.priceOwnerDiscount;
	}
	
	public void setPriceOwnerDiscount( Float priceOwnerDiscount ) {
		this.priceOwnerDiscount = priceOwnerDiscount;
	}

}
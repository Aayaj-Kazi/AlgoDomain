package com.app.pojos;

import javax.persistence.Column;

public class Products extends BaseEntity {

	@Column(length =40 )
	private String pname;
	
	@Column(length =40 )
	private String ptype;
	
	@Column(length =40 )
	private String pcategory;
	
	@Column
	private int pprice;
	
}

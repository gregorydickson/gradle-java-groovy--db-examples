package com.exam;
import java.util.*;
import java.io.*;

/**
* Represents and Order that contains a collection of items.
*
* care should be taken to ensure that this class is immutable since it
* is sent to other systems for processing that should not be able
* to change it in any way.
*
* <p>Copyright: Copyright (c) 2016</p>
* <p>Company: Exams are us</p>
* @author Gregory Dickson
* @version 1.0
*/
public class OrderItem implements Serializable
{
	private final Item item;
	private final Integer quantity;
	private final boolean material;

	public OrderItem(Item item, Integer quantity, boolean material){
		this.item = item;
		this.quantity = quantity;
		this.material = material;
	}
	public Item getItem(){
		return item;
	}
	public Integer getQuantity(){
		return quantity;
	}
	public boolean getMaterial(){
		return material;
	}

}
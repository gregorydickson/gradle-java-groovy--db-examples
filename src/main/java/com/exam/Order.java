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
* <p>Copyright: Copyright (c) 2004</p>
* <p>Company: Exams are us</p>
* @author Joe Blow
* @version 1.0
*/
public class Order implements Serializable
{
	private OrderItem[] orderItems;

	public Order(OrderItem[] orderItems)
	{
		this.orderItems = orderItems;
	}
	// Returns the total order cost after the tax has been applied
	public float getOrderTotal(float taxRate)
	{
		float total = 0;
		for(OrderItem orderItem: orderItems ){
			if(orderItem.getMaterial() == true){
				total = total + (orderItem.getItem().getPrice() * orderItem.getQuantity() * (1 + taxRate));
			} else {
				total = total + (orderItem.getItem().getPrice() * orderItem.getQuantity());
			}
		}
		return total; 
	}
	/**
	* Returns a Collection of all items sorted by item name
	* (case-insensitive).
	*
	* @return Collection
	*/
	public Collection getItems()
	{
		Arrays.sort(orderItems);
		return (Collection) Arrays.asList(orderItems); 
	}
}
package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cart{
@Id
@GeneratedValue
int cartId;
int productId;
int quantity;
int price;

String productName;
String username;



public Cart() {
	super();
}
public Cart(int cartId, int productId, int quantity, int price, String productName, String username) {
	super();
	this.cartId = cartId;
	this.productId = productId;
	this.quantity = quantity;
	this.price = price;
	this.productName = productName;
	this.username = username;
}
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Override
public String toString() {
	return "CartItem [cartId=" + cartId + ", productId=" + productId + ", quantity=" + quantity + ", price=" + price
			+ ", productName=" + productName + ", username=" + username + "]";
}

}

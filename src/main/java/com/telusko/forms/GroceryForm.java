package com.telusko.forms;

import java.util.List;

public class GroceryForm {
	private String name;
	private String email;
	private String quantity;
	private String category;
	private List<String> categoryOptions;
	private String selectedCategory;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<String> getCategoryOptions() {
		return categoryOptions;
	}

	public void setCategoryOptions(List<String> categoryOptions) {
		this.categoryOptions = categoryOptions;
	}

	public String getSelectedCategory() {
		return selectedCategory;
	}

	public void setSelectedCategory(String selectedCategory) {
		this.selectedCategory = selectedCategory;
	}



}

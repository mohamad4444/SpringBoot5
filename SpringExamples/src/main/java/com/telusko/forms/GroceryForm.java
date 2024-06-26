package com.telusko.forms;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class GroceryForm {
	private String name;
	private String email;
	private String quantity;
	private String category;
	private List<String> categoryOptions;
	private String selectedCategory;
	private int abweichendeMonate;
	private String garantieOption;
	private String textArea;
	
	
  private List<MultipartFile> files;
  private List<String> filePaths;
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

  public int getAbweichendeMonate() {
    return abweichendeMonate;
  }

  public void setAbweichendeMonate(int abweichendeMonate) {
    this.abweichendeMonate = abweichendeMonate;
  }

  public String getGarantieOption() {
    return garantieOption;
  }

  public void setGarantieOption(String garantieOption) {
    this.garantieOption = garantieOption;
  }

  public List<MultipartFile> getFiles() {
    return files;
  }

  public void setFiles(List<MultipartFile> files) {
    this.files = files;
  }

  public List<String> getFilePaths() {
    return filePaths;
  }

  public void setFilePaths(List<String> filePaths) {
    this.filePaths = filePaths;
  }

  public String getTextArea() {
    return textArea;
  }

  public void setTextArea(String textArea) {
    this.textArea = textArea;
  }



}

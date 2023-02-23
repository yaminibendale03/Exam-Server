package com.exam.service;

import java.util.Set;

import com.exam.model.Category;

public interface CategoryService {
	
	public Set<Category>getCategories();
	
	public Category getCategory(Long categoryId);

}

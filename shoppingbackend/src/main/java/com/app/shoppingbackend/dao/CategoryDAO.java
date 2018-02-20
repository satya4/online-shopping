package com.app.shoppingbackend.dao;

import java.util.List;

import com.app.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}

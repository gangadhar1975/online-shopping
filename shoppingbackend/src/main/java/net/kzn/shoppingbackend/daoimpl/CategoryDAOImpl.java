package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories=new ArrayList();
	
	static{
		Category category1=new Category();		
		category1.setId(1);
		category1.setName("Television");
		category1.setDescription("This is Discription for Television");
		category1.setImageURL("ndk1");		
		categories.add(category1);
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("Mobile");
		category2.setDescription("This is Discription for Mobile");
		category2.setImageURL("ndk2");		
		categories.add(category2);
		
		Category category3=new Category();
		category3.setId(3);
		category3.setName("Laptop");
		category3.setDescription("This is Discription for Laptop");
		category3.setImageURL("ndk3");		
		categories.add(category3);		
	}
	
	public List<Category> list() {
		return categories;
	}

	public Category get(int id) {		
		//enhanced for loop
		
		for(Category category:categories)
		{
			if(category.getId()==id)
				return category;
		}
		
		return null;
	}

}

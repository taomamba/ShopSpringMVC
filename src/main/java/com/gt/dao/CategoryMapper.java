package com.gt.dao;

import java.util.List;
import java.util.Map;

import com.gt.model.Category;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
    
    List<Category> findAllCategoryAccount(Map<String, Object> map);
    
    int countTypeAll(String type);

	int delCategory(Integer[] idkey);

	List<Category> findProductType();

    List<Category> getCategoryIsHot(int ishot);
}
package com.dept.web.service.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dept.web.dao.IProductDAO;
import com.dept.web.dao.model.Product;
import com.dept.web.dao.model.ProductExample;

@Service
public class ProductService {
	@Autowired
	private IProductDAO productDao;

	public List<Product> getProducts(Product product) {
		ProductExample example = new ProductExample();
		ProductExample.Criteria crt = example.createCriteria();
		if(product.getStatus()!=null){
			crt.andStatusEqualTo(product.getStatus());
		}
		return productDao.selectByExample(example);
	}
}

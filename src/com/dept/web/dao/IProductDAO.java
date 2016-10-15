package com.dept.web.dao;

import com.dept.web.dao.model.Product;
import com.dept.web.dao.model.ProductExample;
import java.util.List;

public interface IProductDAO {
    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据查询条件查询记录总数
	 * @param example 查询条件
	 * @return 记录总数
     */
    int countByExample(ProductExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据查询条件删除记录
	 * @param example 查询条件
	 * @return 被删除记录数
     */
    int deleteByExample(ProductExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据主键删除记录
	 * @param id 主键
	 * @return 被删除记录数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 新增记录
	 * @param record 新增记录对象
     */
    void insert(Product record);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 选择性新增记录
	 * @param record 新增记录对象
     */
    void insertSelective(Product record);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据查询条件查询记录
	 * @param example 查询条件
	 * @return 查询结果列表
     */
    List<Product> selectByExample(ProductExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据主键查询记录
	 * @param id 主键对象
	 * @return 查询结果对象
     */
    Product selectByPrimaryKey(Long id);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据查询条件选择性修改记录
	 * @param record 更新信息对象
	 * @param example 查询条件
	 * @return 被修改的记录数
     */
    int updateByExampleSelective(Product record, ProductExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据查询条件修改记录
	 * @param record 更新信息对象
	 * @param example 查询条件
	 * @return 被修改的记录数
     */
    int updateByExample(Product record, ProductExample example);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据主键选择性修改记录
	 * @param record 更新信息(必须对主键赋值)
	 * @return 被修改的记录数
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * 自动生成的代码.
     * 该方法对应的数据库 tb_product
     * 根据主键修改记录
	 * @param record 更新信息(必须对主键赋值)
	 * @return 被修改的记录数
     */
    int updateByPrimaryKey(Product record);
}